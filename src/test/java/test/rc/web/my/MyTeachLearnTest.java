package test.rc.web.my;

import org.junit.Test;

import product.BaseTest;

public class MyTeachLearnTest extends BaseTest {

	@Test
	public void testMyTeachLearn() throws Exception {
		selenium.open("/");
		selenium.click("css=li.hidden-xs > a");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=login_username", "admin");
		selenium.type("id=login_password", "admin");
		selenium.click("//button[@type='submit']");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=li.visible-lg > a");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=班级课程");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=学员问答");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=学员话题");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=试卷批阅");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=我的课程");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=我的问答");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=我的话题");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=我的笔记");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=我的考试");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=我的小组");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=加入的小组");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=发起的话题");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=回复的话题");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=收藏的话题");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=我的考试");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=收藏的题目");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=我的笔记");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=我的话题");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=班级话题");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=我的问答");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=我的课程");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=已学完");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=收藏");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=试卷批阅");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=已批阅");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=学员话题");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=班级学员话题");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=学员问答");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=在教课程");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=班级课程");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=退出登录");
		selenium.waitForPageToLoad("30000");
	}

}
