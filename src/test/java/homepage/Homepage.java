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
	   homepagelink = driver.findElement(By.linkText("��ҳ"));
	   homepagelink.isEnabled();
	   homepagelink.click();
	   System.out.println("��ҳ����OK");
	   
	   course = driver.findElement(By.linkText("С��"));
       course.isEnabled();
       course.click();
       System.out.println("С������OK");
       
       classes = driver.findElement(By.linkText("�༶"));
       classes.isEnabled();
       classes.click();
       System.out.println("�༶����OK");
      
       information = driver.findElement(By.linkText("վ����Ѷ"));
       information.isEnabled();
       information.click();
       System.out.println("վ����Ѷ����OK");
       
//       more = driver.findElement(By.xpath("//*[@id='nav']/li[6]/a"));
//       more.isEnabled();
//       more.click();
//       System.out.println("��������OK");
       
      
  
  }
  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  driver.quit();
	  
  }

}
