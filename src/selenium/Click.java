package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {
	


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");

		//step-1 launch browser
		WebDriver driver=new ChromeDriver();

		//step-2 maximize window
		driver.manage().window().maximize();

		//step-3 open webpage
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(2000);
		
		WebElement doubleclick=driver.findElement(By.id("doubleClickBtn"));
		Actions act=new Actions(driver);
		act.doubleClick(doubleclick).perform();
		Thread.sleep(2000);
		
		String message=driver.findElement(By.id("doubleClickMessage")).getText();
		if(message.contains("double click")) {
			System.out.println("Test case1 passed");
		}else {
			System.out.println("Test case1 Failed");

		}
		
		
		WebElement rightclick=driver.findElement(By.id("rightClickBtn"));
		act.contextClick(rightclick).perform();
		Thread.sleep(2000);
		
		//WebElement clickme=driver.findElement(By.xpath("//*[@id='ER1Ja']"));
		//act.click(clickme).perform();
		//Thread.sleep(2000);
		
		String message2=driver.findElement(By.id("rightClickMessage")).getText();
		if(message2.contains("right click")) {
			System.out.println("Test case2 passed");
		}else {
			System.out.println("Test case2 Failed");

		}
		driver.quit();
		

	}

}
