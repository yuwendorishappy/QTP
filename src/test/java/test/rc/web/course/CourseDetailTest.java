package test.rc.web.course;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import product.BaseTest;

public class CourseDetailTest extends BaseTest {

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
    public void testCourseDetail() throws Exception {
        selenium.open("/course/1");
        selenium.click("link=讨论区");
        selenium.waitForPageToLoad("30000");
        selenium.click("link=资料区");
        selenium.waitForPageToLoad("30000");
        selenium.click("link=讨论区");
        selenium.waitForPageToLoad("30000");
        selenium.click("link=问答");
        selenium.waitForPageToLoad("30000");
        selenium.click("link=精华");
        selenium.waitForPageToLoad("30000");
        selenium.click("css=li.dropdown > a.dropdown-toggle");
        selenium.click("link=最新发帖");
        selenium.waitForPageToLoad("30000");
        selenium.click("link=资料区");
        selenium.waitForPageToLoad("30000");
        selenium.click("link=评价");
        selenium.waitForPageToLoad("30000");
        selenium.click("link=笔记");
        selenium.waitForPageToLoad("30000");
        selenium.click("link=概览");
        selenium.waitForPageToLoad("30000");
        selenium.click("//li[@id='favorite-btn']/a/p[2]");
        selenium.click("css=i.es-icon.es-icon-bookmark");
    }

    @After
    public void after() {
        selenium.open("/logout");
    }
}
