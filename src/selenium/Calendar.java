package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public void calendarHandling(String month,int date) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");

		//step-1 launch browser
		WebDriver driver=new ChromeDriver();

		//step-2 maximize window
		driver.manage().window().maximize();

		//step-3 open webpage
		driver.get("https://jqueryui.com/datepicker/");

		WebElement frame1=driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(frame1);

		WebElement cal=driver.findElement(By.id("datepicker"));
		cal.click();

		while(true) {
			String month1=driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
			System.out.println(month1);

			if(!month1.equalsIgnoreCase(month)) {
				driver.findElement(By.xpath("//a[@data-handler='prev']")).click();//next
			}
			else {
				break;
			}

		}
		driver.findElement(By.xpath("//*[@class='ui-datepicker-calendar']//child::tbody//tr//td//a[text()='"+date+"']")).click();




	}

	public static void main(String[] args) {
		Calendar d=new Calendar();
		d.calendarHandling("January 2020", 12);

	}

}
