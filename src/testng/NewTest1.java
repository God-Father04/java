package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest1 {
	
  @Test (dependsOnMethods="verifypage")
  public void clickonbutton() {
	  System.out.println("Test case ClickOnButton");
  }
  
  @Test (dependsOnMethods="emailId")
  public void verifypage() {
	  System.out.println("Test case VerifyPage");
  }
  
  @Test (dependsOnMethods="clickonbutton")
  public void entercred() {
	  System.out.println("Test case EnterCred");
  }
  @Test (invocationCount=2,enabled=false)//only one command works
  public void mobileno() {
	  System.out.println("Test case MobileNumber");
  }
  @Test ()
  public void emailId() {
	  System.out.println("Test case EmailId");
  }
  
  
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
