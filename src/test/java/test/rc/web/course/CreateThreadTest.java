package test.rc.web.course;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
import product.BaseTest;

public class CreateThreadTest extends BaseTest {

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
	public void testCreateThread() throws Exception {
		selenium.open("/course/1");
		selenium.selectWindow("null");
		selenium.click("link=讨论区");
		selenium.waitForPageToLoad("30000");
		selenium.click("//button[@type='button']");
		selenium.click("link=发话题");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=thread_title", "发表一个话题!!!");
		Thread.sleep(2000);
		selenium.focus("class=cke_editable cke_editable_themed cke_contents_ltr");
		selenium.runScript("CKEDITOR.instances['thread_content'].setData('testContent')");
		selenium.click("css=button.btn.btn-primary");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(1000);
		selenium.runScript("CKEDITOR.instances['post_content'].setData('testContent')");
		selenium.click("//button[@type='submit']");
		selenium.click("link=讨论区");
		selenium.waitForPageToLoad("30000");
		selenium.click("//button[@type='button']");
		selenium.click("link=提问题");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=thread_title", "提一个问题!!!!");
		Thread.sleep(2000);
		selenium.focus("class=cke_editable cke_editable_themed cke_contents_ltr");
		selenium.runScript("CKEDITOR.instances['thread_content'].setData('testContent')");
		selenium.click("css=button.btn.btn-primary");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(1000);
		selenium.focus("class=cke_editable cke_editable_themed cke_contents_ltr");
		selenium.runScript("CKEDITOR.instances['post_content'].setData('testContent')");
		selenium.click("//button[@type='submit']");
		selenium.click("link=删除");
		assertEquals("您真的要删除该帖吗？", selenium.getConfirmation());
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void after() {
		selenium.open("/logout");
	}

}
