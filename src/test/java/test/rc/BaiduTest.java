package test.rc;

import org.junit.Test;

import product.BaseTest;

public class BaiduTest extends BaseTest {


	@Test
	public void testBaidu() throws Exception {
		selenium.open("/");
		selenium.click("link=新闻");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//a[contains(text(),'互联网')])[2]");
		selenium.waitForPageToLoad("30000");
	}

}
