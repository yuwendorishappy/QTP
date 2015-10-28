package test.rc.web.course;

import product.BaseTest;

public class BuyCourseTest extends BaseTest{
	
	public void testBuyCouse() throws Exception {
		selenium.open("/");
		selenium.click("css=li.hidden-xs > a");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=login_username", "test@edusoho.com");
	}
}
