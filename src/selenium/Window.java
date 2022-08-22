package selenium;

import java.util.Set;

import org.apache.poi.hslf.record.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) throws InterruptedException {
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

		//Step-4
		String parentTabId=driver.getWindowHandle();
		System.out.println(parentTabId);

		//Step-5
		WebElement tabButton=driver.findElement(By.id("opentab"));
		tabButton.click();
		Thread.sleep(2000);

		//Step-6
		Set<String>tabs=driver.getWindowHandles();

		for(String val:tabs) {
			System.out.println(val);

			if(!parentTabId.equals(val)) {
				driver.switchTo().window(val);
				System.out.println("Switched to child tab");
				System.out.println(driver.getTitle());
				Thread.sleep(3000);
			}
		}
		//Step-7 switch back to parent tab
		driver.switchTo().window(parentTabId);
		System.out.println("Switched to parent tab");
		System.out.println(driver.getTitle());

		Thread.sleep(8000);
		driver.quit();

	}

}
