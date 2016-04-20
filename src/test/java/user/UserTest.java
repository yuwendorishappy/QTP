package user;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class UserTest {
	public WebDriver driver;
	private WebElement login,loginpage,username,password,remember,loginbutton;
	
  @Parameters({"url","chrome"})
  @BeforeMethod
  public void beforeMethod(String url,String chrome) {
	  System.setProperty("webdriver.chrome.driver", chrome); 
	  driver = new ChromeDriver();
	  driver.navigate().to(url);
	  Assert.assertEquals("http://t5.edusoho.cn", url);
      System.out.println("..........œµÕ≥URL+url+................");
	  driver.manage().window().maximize();
     
   }
  
  @Parameters({"telephonename","telephonepwd"})
  @Test
  public void telephonelogin(String telephonename,String telephonepwd) {
	     login = driver.findElement(By.linkText("登录"));
		 login.click();
		 loginpage=driver.findElement(By.xpath("//*[@id='content-container']/div/div[1]/a[1]"));
		 loginpage.click();
		 username=driver.findElement(By.id("login_username"));    
		 username.sendKeys(telephonename);
		 
		//—È÷§
		 Assert.assertEquals("13757160849", telephonename);
		 System.out.println("..............'telephonename'+'∂œ—‘OK'+.................");
		 
		 password=driver.findElement(By.id("login_password"));
		 password.sendKeys(telephonepwd);
		 
		//—È÷§
		 Assert.assertEquals("123456789", telephonepwd);
		 System.out.println("..............'telephonepwd'+'∂œ—‘OK'+.................");
		 remember=driver.findElement(By.name("_remember_me"));
		 remember.click();
		 Assert.assertTrue(remember.isEnabled());
		 System.out.println("º«◊°√‹¬Îπ¶ƒ‹OK");
		 loginbutton=driver.findElement(By.xpath("//*[@id='login-form']/div[4]/button"));
		 loginbutton.click();
		 driver.equals(driver.getCurrentUrl());
		
		 }
  @Parameters({"youxiangname","youxiangpwd"})
  @Test
  public void youxianglogin(String youxiangname,String youxiangpwd) {
	 login = driver.findElement(By.linkText("µ«¬º"));
	 login.click();
	 loginpage=driver.findElement(By.xpath("//*[@id='content-container']/div/div[1]/a[1]"));
	 loginpage.click();
	 username=driver.findElement(By.id("login_username"));    
	 username.sendKeys(youxiangname);
	 //—È÷§
	 Assert.assertEquals("286031476@qq.com", youxiangname);
	 System.out.println("..............'youxiangname'+'∂œ—‘OK'+.................");
	 
	 password=driver.findElement(By.id("login_password"));
	 password.sendKeys(youxiangpwd);
	 
	 //—È÷§
	 Assert.assertEquals("123456789", youxiangpwd);
	 System.out.println("..............'youxiangpwd'+'∂œ—‘OK'+.................");
	 
	 remember=driver.findElement(By.name("_remember_me"));
	 remember.click();
	 loginbutton=driver.findElement(By.xpath("//*[@id='login-form']/div[4]/button"));
	 Assert.assertTrue(loginbutton.isEnabled());
	 System.out.println("button is enabled");
	 loginbutton.click();
	 
	 }
  
  @Parameters({"userloginname","userloginpwd"})
  @Test
  public void usernamelogin(String userloginname,String userloginpwd) {
	 login = driver.findElement(By.linkText("µ«¬º"));
	 login.click();
	 loginpage=driver.findElement(By.xpath("//*[@id='content-container']/div/div[1]/a[1]"));
	 loginpage.click();
	 username=driver.findElement(By.id("login_username"));    
	 username.sendKeys(userloginname);
	 //—È÷§
	 Assert.assertEquals("lisi", userloginname);
	 System.out.println("..............'userloginname'+'∂œ—‘OK'+.................");
	 
	 password=driver.findElement(By.id("login_password"));
	 password.sendKeys(userloginpwd);
	 
	 Assert.assertEquals("123456789", userloginpwd);
	 System.out.println("..............'userloginpwd'+'∂œ—‘OK'+.................");
	 
	 remember=driver.findElement(By.name("_remember_me"));
	 remember.click();
	 loginbutton=driver.findElement(By.xpath("//*[@id='login-form']/div[4]/button"));
	 loginbutton.click();
	 driver.equals(driver.getCurrentUrl());
	 }
  @AfterMethod
	 public void aftermethod() {
		  driver.close();
		  driver.quit();
		  
	  }

}
