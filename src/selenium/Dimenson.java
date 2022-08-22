package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Dimenson {
	public void chrome() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/default.asp");

		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.manage().window().minimize();
		Thread.sleep(3000);

		Dimension dia=new Dimension(600,900);
		driver.manage().window().setSize(dia);

		driver.navigate().to("https://www.w3schools.com/html/html_exercises.asp");
		Thread.sleep(5000);
		driver.navigate().back();

		Thread.sleep(3000);
		driver.navigate().forward();

		Thread.sleep(3000);
		driver.navigate().refresh();

	}
	public void edge() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\Compressed\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver=new EdgeDriver();
		driver.get("https://mail.google.com/mail/u/0/#inbox");

	}

	public static void main(String[] args) throws InterruptedException {
		Dimenson ref=new Dimenson();
		ref.chrome();






	}

}
