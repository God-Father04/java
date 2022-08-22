package testng;

import org.testng.annotations.Test;

public class Grouping {
	
  @Test(groups="sanity")
  public void login() {
	  System.out.println("login");
  }
  
  @Test(groups="regression")
  public void homepage() {
	  System.out.println("homepage");
  }
  
  @Test(groups="integration")
  public void title() {
	  System.out.println("title");
  }
}
