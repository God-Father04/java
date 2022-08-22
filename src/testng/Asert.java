package testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Asert {
	WebDriver driver;
	@BeforeClass
	public void browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

	}
	@Test(priority=1)
	public void login() {
		String actTitle=driver.getTitle();
		String expTitle="facebook";
		//Hard Assert
		Assert.assertEquals(actTitle,expTitle ,"Test case failed in validation");
		System.out.println("login-sanity");
		System.out.println("login-integration");
	}
	@Test (priority=2)
	public void homepage() {
		String actTitle=driver.getTitle();
		String expTitle="orange";
		
		//Soft Assert
		SoftAssert s=new SoftAssert();
		s.assertEquals(actTitle,expTitle,"Test case pass" );
		System.out.println("homepage-system");
		System.out.println("homepage-regression");
		
		//Last step
		s.assertAll();
		}
  
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
