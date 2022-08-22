package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
	
	public void Element() throws InterruptedException{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
	      //step-1 launch browser
	      WebDriver driver=new ChromeDriver();
	      //step-2 maximize window
	      driver.manage().window().maximize();
	      //step-3 open webpage
	      driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	      driver.findElement(By.xpath("//*[@type='email']")).sendKeys("dharmikvinay44@gmail.com");
	      
	      driver.findElement(By.xpath("//*[@class='VfPpkd-RLmnJb']")).click();
	      Thread.sleep(3000);
	      
	      WebElement textbox=driver.findElement(By.xpath("//*[@type='password']"));
	      textbox.sendKeys("Vinay@1993");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[@jsname='V67aGc']")).click();
	      
//	      if(text.isEnabled()) {
//	    	  System.out.println("Email Verified - Test case Passed");
//	    }
//	      else {
//	    	  System.out.println("Email not Verified - Test case Failed");
//	      }
//	      driver.close();
//	      
}

	public static void main(String[] args) throws InterruptedException {
		FindElement e=new FindElement();
		e.Element();
		
		// TODO Auto-generated method stub

	}

}
