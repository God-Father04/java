package testng;

import org.testng.annotations.Test;

public class Grouping1 {
	
  @Test(groups="sanity")
  public void email() {
	  System.out.println("email");
  }
  
  @Test(groups="regression")
  public void mobile() {
	  System.out.println("mobile");
  }
  
  @Test(groups="integration")
  public void scroll() {
	  System.out.println("scroll");
  }
  
  @Test(groups="sanity")
  public void message() {
	  System.out.println("message");
  }
}
