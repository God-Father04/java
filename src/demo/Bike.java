package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bike {
	
	// variable-     info
	String name="Bullet";
	String color="Black";
	int engine=500;
	int power=30;

	//action
	public void stunt() {
		System.out.println(  color+ name +" Looks Very Cool"    );
	}
	
	

	public static void main(String[] args) {
		
		Bike a=new Bike();
		a.stunt();
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		System.out.println("Successful");


	}

}
