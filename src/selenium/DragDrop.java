package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	
	public void drop() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");

		//step-1 launch browser
		WebDriver driver=new ChromeDriver();

		//step-2 maximize window
		driver.manage().window().maximize();

		//step-3 open webpage
		driver.get("https://jqueryui.com/droppable/");
		
		//Step-4 Switch to frame
		WebElement frame=driver.findElement(By.xpath("//*[@class='demo-frame']"));
		
		driver.switchTo().frame(frame);
		
		//step-5 locate slider element 
		WebElement drag=driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement drop1=driver.findElement(By.xpath("//*[@id='droppable']"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop1).perform();
		Thread.sleep(3000);
		driver.quit();

		
		
	}

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
//
//		//step-1 launch browser
//		WebDriver driver=new ChromeDriver();
//
//		//step-2 maximize window
//		driver.manage().window().maximize();
//
//		//step-3 open webpage
//		driver.get("https://jqueryui.com/droppable/");
//		
//		//Step-4 Switch to frame
//		WebElement frame=driver.findElement(By.xpath("//*[@class='demo-frame']"));
//		
//		driver.switchTo().frame(frame);
//		
//		//step-5 locate slider element 
//		WebElement drag=driver.findElement(By.xpath("//*[@id='draggable']"));
//		
//		Actions act=new Actions(driver);
//		act.dragAndDropBy(drag, 150, 150).perform();
//		Thread.sleep(3000);
//		driver.quit();
		DragDrop ref=new DragDrop();
		ref.drop();

	}

}
