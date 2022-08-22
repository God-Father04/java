package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");

		//step-1 launch browser
		WebDriver driver=new ChromeDriver();

		//step-2 maximize window
		driver.manage().window().maximize();

		//step-3 open webpage
		driver.get("https://vctcpune.com/selenium/practice.html");

		//step-4 find multiple elements
		List<WebElement>list=driver.findElements(By.xpath("//*[@name='radio']"));
		List<WebElement>list1=driver.findElements(By.xpath("//*[@type='checkbox']"));

		int totalCountOfElement=list.size();
		System.out.println(totalCountOfElement);

		//	iterate on webelements
		for (WebElement ele:list) {
			String val=ele.getAttribute("value");
			System.out.println(val);
			System.out.println(ele.getText());
			ele.click();
			Thread.sleep(5000);

		}
		int checkbox=list1.size();
		System.out.println(checkbox);

		for(WebElement a:list1) {
			String val=a.getAttribute("value");
			System.out.println(val);
			System.out.println(a.getText());
			a.click();
			Thread.sleep(5000);

		}

	}
}
