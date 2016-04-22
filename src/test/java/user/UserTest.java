package user;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import product.BaseTest;

public class UserTest extends BaseTest {
	private WebElement login, loginpage, username, password, remember, loginbutton;

	@Parameters({ "telephonename", "telephonepwd" })
	@Test
	public void telephonelogin(String telephonename, String telephonepwd) {
		login = driver.findElement(By.linkText("登录"));
		login.click();
		loginpage = driver.findElement(By.xpath("//*[@id='content-container']/div/div[1]/a[1]"));
		loginpage.click();
		username = driver.findElement(By.id("login_username"));
		username.sendKeys(telephonename);

		Assert.assertEquals("13757160849", telephonename);
		System.out.println("..............'telephonename'+‘OK'+.................");

		password = driver.findElement(By.id("login_password"));
		password.sendKeys(telephonepwd);

		Assert.assertEquals("123456789", telephonepwd);
		System.out.println("..............'telephonepwd'+'‘OK'+.................");
		remember = driver.findElement(By.name("_remember_me"));
		remember.click();
		Assert.assertTrue(remember.isEnabled());
		System.out.println("‹OK");
		loginbutton = driver.findElement(By.xpath("//*[@id='login-form']/div[4]/button"));
		loginbutton.click();
		driver.equals(driver.getCurrentUrl());

	}

	@Parameters({ "youxiangname", "youxiangpwd" })
	@Test
	public void youxianglogin(String youxiangname, String youxiangpwd) {
		login = driver.findElement(By.linkText("登录"));
		login.click();
		loginpage = driver.findElement(By.xpath("//*[@id='content-container']/div/div[1]/a[1]"));
		loginpage.click();
		username = driver.findElement(By.id("login_username"));
		username.sendKeys(youxiangname);

		Assert.assertEquals("286031476@qq.com", youxiangname);
		System.out.println("..............'youxiangname'+'‘OK'+.................");

		password = driver.findElement(By.id("login_password"));
		password.sendKeys(youxiangpwd);

		Assert.assertEquals("123456789", youxiangpwd);
		System.out.println("..............'youxiangpwd'+'‘OK'+.................");

		remember = driver.findElement(By.name("_remember_me"));
		remember.click();
		loginbutton = driver.findElement(By.xpath("//*[@id='login-form']/div[4]/button"));
		Assert.assertTrue(loginbutton.isEnabled());
		System.out.println("button is enabled");
		loginbutton.click();

	}

	@Parameters({ "userloginname", "userloginpwd" })
	@Test
	public void usernamelogin(String userloginname, String userloginpwd) {
		login = driver.findElement(By.linkText("登录"));
		login.click();
		loginpage = driver.findElement(By.xpath("//*[@id='content-container']/div/div[1]/a[1]"));
		loginpage.click();
		// driver.findElement(By.linkText("注册账号")).click();
		// driver.findElement(By.linkText("登录账号"));
		username = driver.findElement(By.xpath("//*[@id='login_username']"));
		username.sendKeys(userloginname);

		Assert.assertEquals("test", userloginname);
		System.out.println("..............'userloginname'+'‘OK'+.................");

		password = driver.findElement(By.id("login_password"));
		password.sendKeys(userloginpwd);

		Assert.assertEquals("123456789", userloginpwd);
		System.out.println("..............'userloginpwd'+'‘OK'+.................");

		remember = driver.findElement(By.name("_remember_me"));
		remember.click();
		loginbutton = driver.findElement(By.xpath("//*[@id='login-form']/div[4]/button"));
		loginbutton.click();
		driver.equals(driver.getCurrentUrl());
	}

}
