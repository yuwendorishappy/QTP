package test.rc.web.user;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import product.BaseTest;

public class RegisterTest extends BaseTest {
	
	@Before
	public void before() throws Exception {
		selenium.open("/");
		selenium.click("css=li.hidden-xs > a");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=login_username", "admin");
		selenium.type("id=login_password", "admin");
		selenium.click("//button[@type='submit']");
		selenium.waitForPageToLoad("30000");
	}

	@Test
	public void testRegister() throws Exception {
		selenium.click("link=管理后台");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=系统");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=用户设置");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=none");
		selenium.click("css=div.controls.col-md-8 > button.btn.btn-primary");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=回首页");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=退出登录");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//a[contains(text(),'注册')])[2]");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=register_email", new Date().getTime()+"@qq.com");
		selenium.type("id=register_nickname", new Date().getTime()+"abc");
		selenium.type("id=register_password", "123456");
		selenium.click("id=register-btn");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=img");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void after() {
		selenium.open("/logout");
	}
}
