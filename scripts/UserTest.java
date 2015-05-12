package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class  {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://try7.edusoho.cn/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/admin/");
    driver.findElement(By.linkText("用户")).click();
    driver.findElement(By.linkText("添加新用户")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("2987897@qq.com");
    driver.findElement(By.id("nickname")).clear();
    driver.findElement(By.id("nickname")).sendKeys("无名4");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("111111");
    driver.findElement(By.id("confirmPassword")).clear();
    driver.findElement(By.id("confirmPassword")).sendKeys("111111");
    driver.findElement(By.xpath("//form[@id='user-create-form']/div[4]/div/label")).click();
    driver.findElement(By.id("user-create-btn")).click();
    driver.findElement(By.linkText("批量导入")).click();
    driver.findElement(By.linkText("用户管理")).click();
    new Select(driver.findElement(By.name("roles"))).selectByVisibleText("学员");
    new Select(driver.findElement(By.id("keywordType"))).selectByVisibleText("用户名");
    driver.findElement(By.id("keyword")).clear();
    driver.findElement(By.id("keyword")).sendKeys("无名4");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.linkText("登录日志")).click();
    driver.findElement(By.linkText("下一页")).click();
    driver.findElement(By.linkText("3")).click();
    driver.findElement(By.linkText("尾页")).click();
    driver.findElement(By.linkText("首页")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
