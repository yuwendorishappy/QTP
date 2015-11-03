package test.rc.web.course;

import org.junit.Test;
import static org.junit.Assert.*;
import product.BaseTest;

public class CreateCourseTest  extends BaseTest {

    //创建课程和图文课时,并发布
    @Test
    public void testCreateCourse() throws Exception {
        selenium.open("/");
        selenium.click("css=li.hidden-xs > a");
        selenium.waitForPageToLoad("30000");
        selenium.type("id=login_username", "admin");
        selenium.type("id=login_password", "admin");
        selenium.click("//button[@type='submit']");
        selenium.waitForPageToLoad("30000");
        selenium.click("css=li.visible-lg > a");
        selenium.waitForPageToLoad("30000");
        selenium.click("id=create-course");
        selenium.waitForPageToLoad("30000");
        selenium.type("id=course_title", "创建一个课程");
        selenium.click("id=course-create-btn");
        selenium.waitForPageToLoad("30000");
        selenium.type("id=course_subtitle", "副标题");
        selenium.click("id=s2id_autogen1");
        selenium.click("id=course_tags");
        selenium.select("id=course_categoryId", "label=产品介绍");
        selenium.click("id=course-create-btn");
        selenium.waitForPageToLoad("30000");
        selenium.click("link=详细信息");
        selenium.waitForPageToLoad("30000");
        selenium.type("id=course-about-field", "看");
        selenium.type("id=teacher-input", "年轻人");
        selenium.click("css=span.input-group-btn > button.btn.btn-default");
        selenium.type("css=#course-audiences-form-group > div.col-md-8.controls > div.input-group > #teacher-input", "年轻人");
        selenium.click("css=#course-audiences-form-group > div.col-md-8.controls > div.input-group > span.input-group-btn > button.btn.btn-default");
        selenium.click("id=course-create-btn");
        selenium.waitForPageToLoad("30000");
        selenium.click("link=课程图片");
        selenium.waitForPageToLoad("30000");
        selenium.click("link=文件管理");
        selenium.waitForPageToLoad("30000");
        selenium.click("link=价格设置");
        selenium.waitForPageToLoad("30000");
        selenium.click("link=教师设置");
        selenium.waitForPageToLoad("30000");
        selenium.click("link=学员管理");
        selenium.waitForPageToLoad("30000");
        selenium.click("link=题目管理");
        selenium.waitForPageToLoad("30000");
        selenium.click("link=试卷管理");
        selenium.waitForPageToLoad("30000");
        selenium.click("link=试卷批阅");
        selenium.waitForPageToLoad("30000");
        selenium.click("link=课程学习数据");
        selenium.waitForPageToLoad("30000");
        selenium.click("link=课程订单查询");
        selenium.waitForPageToLoad("30000");
        selenium.click("link=课时管理");
        selenium.waitForPageToLoad("30000");
        selenium.click("id=lesson-create-btn");
        Thread.sleep(2000);
        selenium.click("//form[@id='course-lesson-form']/div/div[2]/div/label[4]");
        selenium.click("id=lesson-title-field");
        selenium.click("name=type");
        selenium.click("xpath=(//input[@name='type'])[4]");
        selenium.type("id=lesson-title-field", "图文课时");
        selenium.type("id=lesson-summary-field", "图文课时");
        Thread.sleep(2500);
        selenium.focus("class=cke_editable cke_editable_themed cke_contents_ltr");
        selenium.typeKeys("class=cke_editable cke_editable_themed cke_contents_ltr", "test content");
        selenium.runScript("CKEDITOR.instances[\"lesson-content-field\"].setData('testContent')");
        Thread.sleep(2000);
        selenium.click("//button[@id='course-lesson-btn']");
        selenium.refresh();
        selenium.waitForPageToLoad("30000");
        selenium.mouseOver("css=div.item-content");
        selenium.click("id=dropdown-more");
        selenium.click("link=发布");
        selenium.click("//div[@id='content-container']/div/div[2]/div[2]/button");
        assertEquals("您真的要发布该课程吗？", selenium.getConfirmation());
    }

}