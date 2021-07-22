package Test;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class NewTest {
	
	
	
	
  @Test
  public void f() 
  
  
  {
	  
	
		System.out.println("Hey im in test1 test");
			  
	 ExtentTestManager.getTest().log(Status.INFO, "Hellooo started base test1");
	 /*ExtentTestManager.getTest().log(Status.INFO, "Hey im in base test1 1");
		ExtentTestManager.getTest().log(Status.INFO, "Hey im in base test1 2");
		ExtentTestManager.getTest().log(Status.INFO, "Hey im in base test1 3");	
		*/
	  System.out.println("1");
  }
}
