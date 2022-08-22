package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(testng.Listener.class)
public class Listener1 {
	public static WebDriver driver;
	
	  @BeforeClass
  public void browser() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		//step-3 open webpage
		driver.get("https://opensource-demo.orangehrmlive.com/");
	  }
	  
  @Test (priority=1)
  public void pageVerification() throws InterruptedException {
	  
	 System.out.println(driver.getTitle());
	 Thread.sleep(2000);
	 Assert.assertFalse(true);
	
	  
  }
  
  @Test (priority=2)
  public void navigateToPage() throws InterruptedException {
	 
	 driver.navigate().to("https://www.facebook.com/");
	 Thread.sleep(2000);
	 
	 Assert.assertEquals(driver.getTitle(), "facefdf");
  }
  

  @AfterClass
  public void  tearDown() {
	  
	  driver.quit();
  
}
}
