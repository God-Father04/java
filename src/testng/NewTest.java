package testng;

import org.testng.annotations.Test;

public class NewTest {
	
	
  @Test
  public void testCase1() {
	  System.out.println("test Case 1");
  }
  
  @Test
  public void testCase2() throws InterruptedException {
	  System.out.println("test Case 2");
	  Thread.sleep(2000);
  }
}
