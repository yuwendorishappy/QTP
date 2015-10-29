#!/usr/bin/env php
<?php

function initDatabase($argv)
{
    $workspace = $argv[1];
    $branch = !empty($argv[2]) ? $argv[2] : 'master';
    $command = "cd {$workspace};git pull origin {$branch}";
    exec($command, $output, $code);
    if ($code != 0) {
        echo "更新Selenium项目失败\n";
        exit($code);
    }

    $edusohoDir = "{$workspace}/../../EduSoho-develop/workspace";
    $configLocation = "{$edusohoDir}/app/config/parameters.yml";
    if (!file_exists($configLocation)) {
        echo "EduSoho配置文件{$configLocation}不存在\n";
        exit(1);
    }

    $command = "cd {$edusohoDir};git pull origin develop";
    exec($command, $output, $code);
    if ($code != 0) {
        echo "更新EduSoho develop分支失败\n";
        exit($code);
    }

    $config = file_get_contents($configLocation);
    $dbUser = getConfig('database_user', $config);
    $dbPassword = getConfig('database_password', $config);
    $dbname = getConfig('database_name', $config);
    $host = getConfig('database_host', $config);
    $port = getConfig('database_port', $config);

    $command = "mysql -u{$dbUser} -p{$dbPassword} -h {$host} -P {$port} -Nse 'show tables' {$dbname} | while read table; do [ \"\$table\" != \"migration_versions\" ] && mysql -u{$dbUser} -p{$dbPassword} -h {$host} -P {$port} -e \"truncate table \$table\" {$dbname}; done";
    exec($command, $output, $code);
    if ($code != 0) {
        echo "清空EduSoho所有表数据失败\n";
        exit($code);
    }

    $command = "mysql -u{$dbUser} -p{$dbPassword} -h {$host} -P {$port} {$dbname} < ~/edusoho.sql";
    exec($command, $output, $code);

    if ($code != 0) {
        echo "导入sql失败\n";
        exit($code);
    }

    $command = "cd {$edusohoDir};app/console doctrine:migrations:migrate";
    exec($command, $output, $code);

    if ($code != 0) {
        echo "升级{$dbname}数据库失败\n";
        exit($code);
    }

    $command = "mysqldump -uroot -proot '{$dbname}' --no-create-info --complete-insert --skip-comments --extended-insert --skip-add-locks --ignore-table=exam.edusoho.cn.cache --ignore-table=exam.edusoho.cn.cloud_app_logs --ignore-table=exam.edusoho.cn.log --ignore-table=exam.edusoho.cn.session2 --ignore-table=exam.edusoho.cn.user_token --skip-disable-keys --skip-set-charset --skip-tz-utc --skip-debug-check > ~/edusoho.sql";
    exec($command, $output, $code);

    if ($code != 0) {
        echo "备份{$dbname}数据库\n";
        exit($code);
    }
}

function getConfig($tag, $yml)
{
    $preg = '/'.$tag.':\s+(\w|.)+/';
    preg_match($preg, $yml, $matches);
    if (!$matches) {
        $this->_setError('未能查找到相应配置:'.$tag.':'.$yml);

        return false;
    }
    $values = explode(':', $matches[0]);

    return trim($values[1]);
}

initDatabase($argv);
