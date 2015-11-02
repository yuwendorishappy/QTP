package com.example.tests;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import product.BaseTest;

public class MyNavTest extends BaseTest {

	@Before
	public void before() throws Exception {
		super.before();
		selenium.open("/login");
		selenium.click("css=li.hidden-xs > a");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=login_username", "admin");
		selenium.type("id=login_password", "admin");
		selenium.click("//button[@type='submit']");
		selenium.waitForPageToLoad("30000");
	}

	//我的主页
	@Test
	public void testMyHomepage() throws Exception {
		selenium.open("/");
		selenium.click("css=li.hidden-xs > a");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=login_username", "admin");
		selenium.type("id=login_password", "admin");
		selenium.click("//button[@type='submit']");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=个人主页");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=在学课程");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=收藏的课程");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=加入的小组");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=关注/粉丝");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=在教班级");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=在学班级");
		selenium.waitForPageToLoad("30000");
	}

	//我的设置
	@Test
	public void testMySetting() throws Exception {
		selenium.open("/");
		selenium.click("css=li.hidden-xs > a");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=login_username", "admin");
		selenium.type("id=login_password", "admin");
		selenium.click("//button[@type='submit']");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=个人设置");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=头像设置");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=安全设置");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=邮箱设置");
		selenium.waitForPageToLoad("30000");
	}

	//帐号中心
	@Test
	public void testMoneyCenter() throws Exception {
		selenium.open("/login");
		selenium.click("css=li.hidden-xs > a");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=login_username", "admin");
		selenium.type("id=login_password", "admin");
		selenium.click("//button[@type='submit']");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=账户中心");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=我的订单");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=待付款0");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=已付款");
		selenium.waitForPageToLoad("30000");
		selenium.select("name=lastHowManyMonths", "label=最近一周");
		selenium.waitForPageToLoad("30000");
		selenium.select("name=payWays", "label=微信支付");
		selenium.waitForPageToLoad("30000");
		selenium.select("name=lastHowManyMonths", "label=最近一个月");
		selenium.waitForPageToLoad("30000");
		selenium.select("name=payWays", "label=其他支付");
		selenium.waitForPageToLoad("30000");
		selenium.select("name=payWays", "label=支付方式");
		selenium.waitForPageToLoad("30000");
		selenium.select("name=lastHowManyMonths", "label=最近两个月");
		selenium.waitForPageToLoad("30000");
	}

	//私信
	@Test
	public void testMyNavTest() throws Exception {
		selenium.open("/login");
		selenium.click("css=li.hidden-xs > a");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=login_username", "admin");
		selenium.type("id=login_password", "admin");
		selenium.click("//button[@type='submit']");
		selenium.waitForPageToLoad("30000");
		selenium.mouseOver("//nav/div/ul/li[3]/a");
		selenium.click("xpath=(//a[contains(@href, '/message/')])[2]");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=写私信");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=message_receiver", "admin111");
		selenium.click("link=返回我的私信");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void after() {
		super.after();
		selenium.open("/logout");
	}

}
