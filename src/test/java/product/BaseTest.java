package product;

import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.thoughtworks.selenium.Selenium;

public class BaseTest {

	protected static Selenium selenium;
	private static Properties prop = null;
	protected static WebDriver driver = null;
	protected static String baseUrl;

	@BeforeClass
	public void beforeClass(){
		InputStream in = BaseTest.class.getResourceAsStream("/selenium.properties");
		try {
			prop = new Properties();
			prop.load(in);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@BeforeMethod
	public void beforeMethod() {
		baseUrl = BaseTest.prop.getProperty("test.url");
		String browser = prop.getProperty("browser");
		if ("chrome".equals(browser)) {
			System.setProperty("webdriver.chrome.driver", prop.getProperty("selenium.webDriver"));
			driver = new ChromeDriver();
		} else if ("firefox".equals(browser)) {
			System.setProperty("webdriver.firefox.bin", prop.getProperty("selenium.webDriver"));
			driver = new FirefoxDriver();
		} else if ("iexplore".equals(browser)) {
			System.setProperty("webdriver.ie.driver", prop.getProperty("selenium.webDriver"));
			driver = new InternetExplorerDriver();
		}
		driver.navigate().to(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void aftermethod() {
		driver.close();
		driver.quit();

	}

}
