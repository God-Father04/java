package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest2 {
	public WebDriver driver;
	
	@BeforeClass
	public void browser() {
		
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
	//step-1 launch browser
	driver=new ChromeDriver();
	//step-2 maximize window
	driver.manage().window().maximize();
	//step-3 open Webpage
	driver.get("https://opensource-demo.orangehrmlive.com/");
	//Step-4 wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
	@Test
	public void login() {
		LoginPage2 lp=new LoginPage2(driver);
		lp.enterCred();
			}
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
