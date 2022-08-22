package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public void VerifyTitle()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		//step-1 launch browser
		WebDriver driver=new ChromeDriver();
		//step-2 maximize window
		driver.manage().window().maximize();
		//step-3 open webpage
		driver.get("https://www.amazon.in/");
		//step-4 to verify title of page
		String exTitle="Amazon";
		//step-5 
		String actTitle=driver.getTitle();
		System.out.println(actTitle);

		if (actTitle.contains(exTitle)) {
			System.out.println("Title matched - Test case Passed");
		}
		else {
			System.out.println("Title unmatched - Test case Failed");
		}
		driver.close();

	}


	public static void main(String[] args)  {
		Title ref=new Title();
		ref.VerifyTitle();


	}

}
