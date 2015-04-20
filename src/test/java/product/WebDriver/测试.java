package product.WebDriver;

import org.junit.Test;
import org.openqa.selenium.By;

import product.BaseWebDriverTest;

public class 测试 extends BaseWebDriverTest{

  @Test
  public void testBaidu() throws Exception {
    driver.get(baseUrl);
    driver.findElement(By.id("kw")).clear();
    driver.findElement(By.id("kw")).sendKeys("测试webdirver");
  }
}
