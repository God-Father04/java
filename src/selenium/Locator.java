package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	public void Chrome() throws InterruptedException {//Check type Exception
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        
        WebElement a=driver.findElement(By.name("email"));
        a.sendKeys("abc");
        Thread.sleep(3000);
        WebElement b=driver.findElement(By.name("pass"));
        b.sendKeys("abc@123");
        Thread.sleep(3000);
        WebElement c=driver.findElement(By.name("login"));
        c.click();
        Thread.sleep(3000);
        WebElement d=driver.findElement(By.linkText("Forgotten password?"));
       // d.click();
        //Thread.sleep(3000);
        WebElement e=driver.findElement(By.partialLinkText("Forgotten"));
        e.click();
        Thread.sleep(3000);
        
        driver.close();
       
	}

	public static void main(String[] args) throws InterruptedException {
		Locator ref=new Locator();
		ref.Chrome();

	}

}
