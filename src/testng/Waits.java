package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Waits {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	@Test
	public void element() throws InterruptedException {
		driver.findElement(By.id("alert")).click();

		//using Explicit wait
		wait=new WebDriverWait(driver,Duration.ofSeconds(7));
		wait.until(ExpectedConditions.alertIsPresent());

		//Fluent Wait
		FluentWait <WebDriver> f=new FluentWait <WebDriver>(driver);
		f.withTimeout(Duration.ofSeconds(8)).pollingEvery(Duration.ofSeconds(20));
		f.until(ExpectedConditions.alertIsPresent());

		driver.switchTo().alert().accept();	
	}


		@Test
		public void text() {
			driver.findElement(By.id("populate-text")).click();
			WebElement text=driver.findElement(By.id("populate-text"));
			wait=new WebDriverWait(driver,Duration.ofSeconds(11));
			wait.until(ExpectedConditions.textToBePresentInElement(text, "Selenium Webdriver"));
	
		}
		@Test
		public void Button() {
			driver.findElement(By.id("display-other-button")).click();
			WebElement button=driver.findElement(By.id("hidden"));
			 wait=new WebDriverWait(driver,Duration.ofSeconds(11));
			wait.until(ExpectedConditions.elementToBeClickable(button));
		}



	@AfterClass
	public void afterClass() {

		driver.close();
	}

}
