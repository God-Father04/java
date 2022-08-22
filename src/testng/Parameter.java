package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Parameter {
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void beforeTest(String type) {
		
		if(type.equals("chrome")) {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		//step-3 open webpage
		driver.get("https://opensource-demo.orangehrmlive.com/");
		}
		
		else if(type.equals("edge")) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\Compressed\\edgedriver_win64\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		}


	}

	@Test(priority=1)
	public void username() throws InterruptedException {

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void button() throws InterruptedException {
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
	}
	@Test(priority=3)
	public void title() throws InterruptedException {
		String title=driver.getTitle();
		Thread.sleep(2000);
		//String url=driver.getCurrentUrl();
		Thread.sleep(2000);
		Assert.assertEquals(title,"OrangeHRM" );
		//Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	}
	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}
	



	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

	@BeforeSuite
	public void beforeSuite() {
	}

	@AfterSuite
	public void afterSuite() {
	}

}
