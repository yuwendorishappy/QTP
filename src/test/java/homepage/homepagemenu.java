package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class homepagemenu {
	public WebDriver driver;
	public WebElement course,course1,course2,course3,test,test1,test2;
	private WebElement img1;
	private WebElement img2;
	private WebElement img3;
	
	@BeforeMethod
	  public void beforeMethod() {
		  System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedriver.exe"); 
		  driver = new ChromeDriver();
		  driver.get("http://t5.edusoho.cn/");
		  driver.manage().window().maximize();
	  }
	
  @Test
  public void lunbotutest() throws Exception{
	  /*
	   *简 墨主题下操作
	   * /
	   */
	  
	  course = driver.findElement(By.linkText("课程"));
      course.click();
      course1 = driver.findElement(By.xpath("//*[@id='nav']/li[2]/ul/li[1]/a"));
      course1.isEnabled();
      driver.equals(driver.getCurrentUrl());
      System.out.println("链接到指定页面OK");
    
     
    //轮播图片切换
      img1 =driver.findElement(By.xpath("/html/body/div[1]/section[1]/div[2]/span[1]"));
      img1.click();
      img2 =driver.findElement(By.xpath("/html/body/div[1]/section[1]/div[2]/span[2]"));
      img2.click();
      img3 =driver.findElement(By.xpath("/html/body/div[1]/section[1]/div[2]/span[3]"));
      img3.click();

    
  }
  
  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  driver.quit();
	  
  }

}
