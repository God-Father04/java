package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender2 {
	static String month1="November 2021";
	static int date=3;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/datepicker/");

		WebElement Frame=driver.findElement(By.xpath("//*[@class='demo-frame']"));

		driver.switchTo().frame(Frame);

		WebElement Date=driver.findElement(By.id("datepicker"));
		Date.click();

		while(true) {
			String month=driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
			System.out.println(month);

			if(!month.equalsIgnoreCase(month1)) {
				driver.findElement(By.xpath("//a[@data-handler='prev']")).click();
			}
			else {
				break;}
		}
		driver.findElement(By.xpath("//*[@class='ui-datepicker-calendar']//child::tbody//tr//td//a[text()='"+date+"']")).click();
		driver.close();
	}

}


