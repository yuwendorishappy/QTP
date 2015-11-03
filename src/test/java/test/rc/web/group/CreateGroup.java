package test.rc.web.group;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import product.BaseTest;

public class CreateGroup   extends BaseTest{

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
	public void testCreateGroup() throws Exception {
		selenium.open("/group");
		selenium.click("xpath=(//a[contains(text(),'小组')])[2]");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=创建小组");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=group_grouptitle", "小组");
		selenium.type("id=group", "小组");
		selenium.click("id=group-save-btn");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=背景设置");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=编辑小组");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=group-save-btn");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=小组成员");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=小组设置");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=小组首页");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=发话题");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=thread_title", "小组话题");
		selenium.type("id=thread_content", "话题内容");
		selenium.click("id=groupthread-save-btn");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
