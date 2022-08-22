package pom;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest {
	public WebDriver driver;

	@BeforeTest
	public void browser() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");

		//step-1 launch browser
		driver=new ChromeDriver();
		//step-2 maximize window
		driver.manage().window().maximize();
		//step-3 open Webpage
		driver.get("https://www.facebook.com/");
		//Step-4 wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void login() {
		LoginPage lp=new LoginPage(driver);
		lp.enterCred();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();

	}
}
