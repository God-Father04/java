package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage2 {
	//Webelement
	@FindBy(id="txtUsername")
	private WebElement username;

	@FindBy(id="txtPassword")
	private WebElement password;

	@FindBy(id="btnLogin")
	private WebElement button;

	//constructor
	public LoginPage2(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//action
	public void enterCred() {

		username.sendKeys("Admin");
		password.sendKeys("admin123");
		button.click();
	}
}
