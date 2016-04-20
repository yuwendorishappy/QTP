package userlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class dsf_Login {
  
  private ChromeDriver driver;
  public WebElement weibo;
@BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedriver.exe"); 
	  driver = new ChromeDriver();
	  driver.navigate().to("http://t5.edusoho.cn");
	  driver.manage().window().maximize();
  }
  @Test
  public void weibo () {
	  weibo=driver.findElement(By.xpath("//*[@id='content-container']/div/div[2]/div[2]/span/a[1]/i"));
	  weibo.click();
	  
  }
  public void qq() {
	 
  }
  public void weixin() {
	  
  }
  public void renrenwang() {
	  
  }
  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  driver.quit();
  }

}
