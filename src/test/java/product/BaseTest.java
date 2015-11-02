package product;

import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class BaseTest {

	protected static Selenium selenium;
	private static Properties prop = null;
	protected WebDriver driver = null;
	protected String baseUrl;

	static {
		InputStream in = BaseTest.class.getResourceAsStream("/selenium.properties");
		try {
			prop = new Properties();
			prop.load(in);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@BeforeClass
	public static void before() throws Exception {

		String seleniumRunMode = prop.getProperty("seleniumRunMode");
		baseUrl = BaseTest.prop.getProperty("baseUrl");

		if ("webDriver".equals(seleniumRunMode)) {

			String browser = prop.getProperty("browser");
			if ("chrome".equals(browser)) {

				System.setProperty("webdriver.chrome.driver",
						prop.getProperty("selenium.webDriver.File"));
				driver = new ChromeDriver();
			} else if ("firefox".equals(browser)) {

				System.setProperty("webdriver.firefox.bin",
						prop.getProperty("selenium.webDriver.File"));
				driver = new FirefoxDriver();
			} else if ("iexplore".equals(browser)) {

				System.setProperty("webdriver.ie.driver",
						prop.getProperty("selenium.webDriver.File"));

				driver = new InternetExplorerDriver();

			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		} else if ("remoteControl".equals(seleniumRunMode)) {
			selenium = new DefaultSelenium(prop.getProperty("rc.url"),
					Integer.valueOf(prop.getProperty("rc.port")), "*"
							+ prop.getProperty("browser"),
					prop.getProperty("test.url"));
			selenium.start();
			selenium.windowMaximize();

		}
	}

	@AfterClass
	public static void after() {
		String seleniumDriver = prop.getProperty("seleniumRunMode");
		if ("webDriver".equals(seleniumDriver)) {
			driver.close();
			driver.quit();
		} else if ("remoteControl".equals(seleniumDriver)) {
			selenium.stop();
		}

	}

}
