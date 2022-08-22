package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	public void  actionclass() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");

		//step-1 launch browser
		WebDriver driver=new ChromeDriver();

		//step-2 maximize window
		driver.manage().window().maximize();

		//step-3 open webpage
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		// step4-A scrolling
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		
		//step-5 click on drop button
		driver.findElement(By.id("dropdown-class-example")).click();
		
		//Using actions class for keyboard & mouse action
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		Action ref=new Action();
		ref.actionclass();

	}

}
