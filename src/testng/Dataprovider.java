package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Dataprovider {
	WebDriver driver;
	@BeforeTest
	public void browser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);

	}

	@Test (dataProvider="testData")
	public void login(String email, String pass) throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(pass);
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	}

	@DataProvider(name="testData")
	public String[][]getData(){
		String [][]data= {{"cbz@gmail.com","cbz@190"},{"abc@gmail.com","abc123"},{"xyz@gmail.com","xyz123"}};
		return data;

	}

	@AfterTest
	public void close() {
		driver.quit();
	}

}
