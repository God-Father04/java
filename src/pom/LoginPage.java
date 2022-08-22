package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;

	//Web element 
	private WebElement username;
	private WebElement password;
	private WebElement button1;

	public LoginPage(WebDriver driver) {

		username=driver.findElement(By.id("email"));
		password=driver.findElement(By.id("pass"));
		button1=driver.findElement(By.xpath("//button[@name='login']"));
	}
	public void enterCred() {

		username.sendKeys("Admin");
		password.sendKeys("Admin123");
		button1.click();
	}
}
