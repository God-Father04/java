package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
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
		//step-4 click on button
		WebElement alert=driver.findElement(By.id("alertbtn"));
		alert.click();
		Thread.sleep(2000);
		//step-5 handle alert
		Alert alert1=driver.switchTo().alert();
		alert1.accept();
		Thread.sleep(2000);
		//step-6 click on another button
		String name="Aman";
		driver.findElement(By.id("name")).sendKeys(name);
		Thread.sleep(2000);

		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);

		Alert confirm=driver.switchTo().alert();
		String AlertMessage=confirm.getText();
		System.out.println(AlertMessage);

		if(AlertMessage.contains(name)) {
			System.out.println("Name matched + Test Case Passed");
			confirm.accept();
		}
		else {
			System.out.println("Name dosen't matched + Test Case Failed");
			confirm.dismiss();
		}
		Thread.sleep(8000);
		driver.close();

	}

}
