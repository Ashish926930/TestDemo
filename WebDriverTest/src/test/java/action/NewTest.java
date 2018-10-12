package action;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver driver;

	@Test
	public void testEasy() {
		driver.get("http://demo.guru99.com/selenium/guru99home/");
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Demo Guru99 Page"));
	}

	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\Automation\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.get("https://www.bjs.com");
		driver.manage().window().maximize();

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}