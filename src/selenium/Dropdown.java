package selenium;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");

		//step-1 launch browser
		WebDriver driver=new ChromeDriver();

		//step-2 maximize window
		driver.manage().window().maximize();

		//step-3 open webpage
		driver.get("https://vctcpune.com/selenium/practice.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);

		WebElement drop=driver.findElement(By.id("dropdown-class-example"));

		Select sel= new Select(drop);
		sel.selectByIndex(1);

		List<WebElement>dropList=sel.getOptions();

		for(WebElement a:dropList) {
			String value=a.getText();
			System.out.println(value);
			a.click();
			Thread.sleep(2000);
		}
		Screenshot.Capture(driver, null);
		Thread.sleep(3000);
		driver.quit();

	}

}
