package com.example.tests;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import product.BaseTest;

public class HomepageTest extends BaseTest {

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

	//首页
	@Test
	public void testHomepage() throws Exception {
		selenium.click("//img");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=span.swiper-pagination-switch");
		selenium.click("//span[2]");
		selenium.click("//span[3]");
		selenium.click("css=span.swiper-pagination-switch");
		assertEquals("网校基本设置", selenium.getText("//img[@alt='网校基本设置']"));
		selenium.click("xpath=(//a[contains(text(),'产品介绍')])[3]");
		assertEquals("EduSoho教育云服务介绍", selenium.getText("//img[@alt='EduSoho教育云服务介绍']"));
		selenium.click("//a[contains(text(),'使用教程')]");
		assertEquals("课程发布指南", selenium.getText("//img[@alt='课程发布指南']"));
		selenium.click("css=li..js-course-filter > a");
		selenium.click("link=最新");
		selenium.runScript("window.scroll(0, 800);");
		Thread.sleep(1000);
		assertEquals("EduSoho技术服务套餐", selenium.getText("//img[@alt='EduSoho技术服务套餐']"));
		selenium.click("link=最热");
		selenium.runScript("window.scroll(0, 800);");
		Thread.sleep(1000);
		selenium.click("link=推荐");
		selenium.runScript("window.scroll(0, 800);");
		Thread.sleep(1000);
		assertEquals("课程发布指南", selenium.getText("//img[@alt='课程发布指南']"));
		selenium.click("link=更多课程");
		selenium.waitForPageToLoad("30000");
		assertEquals("全部 - EduSoho网络课堂 - 三分钟帮助您建设功能完备的网校！ - Powered By EduSoho", selenium.getTitle());
		selenium.click("//img");
		selenium.click("xpath=(//a[contains(@href, '/classroom/explore')])[3]");
		selenium.waitForPageToLoad("30000");
		assertEquals("班级列表 \n 查看课程", selenium.getText("css=div.es-banner"));
		selenium.click("//img");
		selenium.runScript("window.scroll(0, 3000);");
		Thread.sleep(500);
		selenium.click("link=更多教师");
		selenium.waitForPageToLoad("30000");
		assertEquals("师资介绍 - EduSoho网络课堂 - 三分钟帮助您建设功能完备的网校！ - Powered By EduSoho", selenium.getTitle());
	}

	//测边栏
	@Test
	public void testSidebar() throws Exception {
		selenium.click("css=li.bar-user > a");
		selenium.click("css=i.es-icon.es-icon-edit");
		selenium.click("css=i.es-icon.es-icon-book");
		selenium.click("css=i.es-icon.es-icon-edit");
		selenium.click("id=bar-practice-finish");
		selenium.click("id=bar-practice-review");
		selenium.click("//div[2]/div/ul/li[3]");
		selenium.click("id=bar-classroom-btn");
		selenium.click("id=bar-course-btn");
		selenium.click("css=i.es-icon.es-icon-notifications");
		selenium.click("css=i.es-icon.es-icon-arrowforward");
		selenium.selectWindow("null");
	}


	//导航栏
	@Test
	public void testNavBar() throws Exception {
		selenium.mouseOver("xpath=(//a[contains(text(),'课程')])[3]");
		selenium.click("css=li.nav-hover.open > ul.dropdown-menu > li > a");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//a[contains(text(),'产品介绍')])[3]");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=使用教程");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//a[contains(text(),'默认分类')])[3]");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=最热");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=推荐");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//a[contains(text(),'产品介绍')])[2]");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=全部");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//a[contains(text(),'产品介绍')])[3]");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=使用教程");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//a[contains(text(),'默认分类')])[3]");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=使用教程");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=管理员");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=教师");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=学员");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=最热");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=推荐");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=live");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=free");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=live");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=free");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//a[contains(text(),'使用帮助')])[2]");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=全部");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//a[contains(text(),'产品介绍')])[3]");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//a[contains(text(),'默认分类')])[3]");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=最热");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=live");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=live");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=free");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=free");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=live");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=free");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=free");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=live");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//a[contains(text(),'班级')])[2]");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//a[contains(text(),'班级')])[2]");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//a[contains(text(),'产品介绍')])[3]");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=推荐");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=最热");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//a[contains(text(),'全部资讯')])[2]");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//a[contains(text(),'EduSoho')])[3]");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//a[contains(text(),'行业资讯')])[3]");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//a[contains(text(),'默认分类')])[3]");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=探索MOOC的机遇与挑战");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=资讯频道");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=h4.title");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//a[contains(text(),'EduSoho')])[2]");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//a[contains(text(),'行业资讯')])[2]");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=世界那么大，后台那么新，教你如何不迷失...");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//a[contains(text(),'小组')])[2]");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=img.avatar-square-sm");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=小组成员");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=小组设置");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//a[contains(text(),'小组')])[2]");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//a[contains(text(),'关于我们')])[2]");
		selenium.waitForPageToLoad("30000");
	}

	//测试搜索
	@Test
	public void testSearch() throws Exception {
		selenium.type("xpath=(//input[@name='q'])[2]", "php课程");
		selenium.click("//nav/div/form/div/button");
		selenium.waitForPageToLoad("30000");
		selenium.click("//nav/div/form/div/button");
		selenium.waitForPageToLoad("30000");
		assertEquals("搜索：全部课程 - EduSoho网络课堂 - 三分钟帮助您建设功能完备的网校！ - Powered By EduSoho", selenium.getTitle());
		assertEquals("网校运营指南", selenium.getText("//img[@alt='网校运营指南']"));
	}

	@After
	public void after() {
		selenium.open("/logout");
		super.after();
	}
}
