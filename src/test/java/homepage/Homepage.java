package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Homepage {
  public WebDriver driver;
  public WebElement homepagelink;
  public WebElement course;
  public WebElement group,classes,information,more;
  
  @BeforeMethod
  public void beforeMethod() throws Exception {
	 System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedriver.exe"); 
	 driver = new ChromeDriver();
     driver.get("http://t5.edusoho.cn/");
     driver.manage().window().maximize();
  }
  @Test
  public void shouyedaohangtest() throws Exception {
	   homepagelink = driver.findElement(By.linkText("首页"));
	   homepagelink.isEnabled();
	   homepagelink.click();
	   System.out.println("首页链接OK");
	   
	   course = driver.findElement(By.linkText("小组"));
       course.isEnabled();
       course.click();
       System.out.println("小组链接OK");
       
       classes = driver.findElement(By.linkText("班级"));
       classes.isEnabled();
       classes.click();
       System.out.println("班级链接OK");
      
       information = driver.findElement(By.linkText("站点资讯"));
       information.isEnabled();
       information.click();
       System.out.println("站点资讯链接OK");
       
//       more = driver.findElement(By.xpath("//*[@id='nav']/li[6]/a"));
//       more.isEnabled();
//       more.click();
//       System.out.println("更多链接OK");
       
      
  
  }
  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  driver.quit();
	  
  }

}
