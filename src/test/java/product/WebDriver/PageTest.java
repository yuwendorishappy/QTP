package product.WebDriver;

import org.junit.Test;
import org.openqa.selenium.By;

import product.BaseTest;

public class PageTest extends BaseTest{

  @Test
  public void testBaidu() throws Exception {
    driver.get(baseUrl);
    driver.navigate().to("http://cache.upuday.com/student/index3.html?liveClassroomId=559a7c58f58356b6650003db&customerType=soooner&customer=edusoho&sp=0");
    //driver.findElement(By.id("kw")).clear();
    //driver.findElement(By.id("kw")).sendKeys("测试webdirver");
  }
}
