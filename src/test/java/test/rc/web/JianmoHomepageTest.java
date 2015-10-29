package test.rc.web;

import org.junit.Test;

import product.BaseTest;

public class JianmoHomepageTest extends BaseTest {

	@Test
	public void testJianmoHomepage() throws Exception {
		selenium.open("/");
		selenium.click("link=更多课程");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=a.navbar-brand");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=最热");
		selenium.click("link=推荐");
		selenium.click("link=最新");
	}

}
