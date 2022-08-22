package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url {

      public void VerifyUrl() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
      //step-1 launch browser
      WebDriver driver=new ChromeDriver();
      //step-2 maximize window
      driver.manage().window().maximize();
      //step-3 open webpage
      driver.get("https://www.amazon.in/");
      //step-4 to verify url of page
      String exUrl="https://www.amazon.in/";
      String actUrl=driver.getCurrentUrl();
      System.out.println(actUrl);
      
      if (actUrl.contentEquals(exUrl)){
      	System.out.println("Url matched - Test case Passed");
      }
      else {
      	System.out.println("Url unmatched - Test case Failed");
      }
      
      Thread.sleep(5000);
      //step-5 close window
      driver.close();
      Thread.sleep(3000);
      }

	public static void main(String[] args) throws InterruptedException {
		Url w=new Url();
		w.VerifyUrl();

	}

}
