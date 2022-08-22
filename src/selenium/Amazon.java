package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
	public void Css() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.navigate().forward();

		WebElement a=driver.findElement(By.id("ap_email"));
		a.sendKeys("god04father@gmail.com");
		Thread.sleep(2000);
		WebElement d=driver.findElement(By.id("continue")); 
		d.click();
		WebElement b=driver.findElement(By.id("ap_password"));
		b.sendKeys("Aman@1995");
		Thread.sleep(2000);
		WebElement c=driver.findElement(By.id("signInSubmit")); 
		c.click();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,950)");
		Thread.sleep(3000);
		driver.findElement(By.id("nav-icon nav-arrow")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("nav-item-signout")).click();
		Thread.sleep(3000);
//		WebElement dropButton=driver.findElement(By.id("nav-link-accountList"));
//		
//		Select sel=new Select(dropButton);
//		sel.selectByVisibleText("Sign Out");

		Thread.sleep(3000);
		driver.close();

	}

	public static void main(String[] args) throws InterruptedException {
		Amazon ref=new Amazon();
		ref.Css();




	}

}
