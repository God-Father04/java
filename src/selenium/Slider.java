package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");

		//step-1 launch browser
		WebDriver driver=new ChromeDriver();

		//step-2 maximize window
		driver.manage().window().maximize();

		//step-3 open webpage
		driver.get("https://jqueryui.com/slider/");
		
		//Step-4 Switch to frame
		WebElement frame=driver.findElement(By.xpath("//*[@class='demo-frame']"));
		
		driver.switchTo().frame(frame);
		
		//step-5 locate slider element 
		WebElement slider=driver.findElement(By.xpath("//*[@id='slider']//child::span"));
		
		//Step-6 Using actions class for keyboard & mouse action
		Actions act=new Actions(driver);
		act.clickAndHold(slider).perform();
		Thread.sleep(2000);
		act.moveByOffset(400, 0).perform();
		Thread.sleep(2000);
		act.moveByOffset(-370, 0).perform();
		Thread.sleep(2000);
		act.release().perform();
		Thread.sleep(3000);
		
		driver.quit();
		
	

	}

}
