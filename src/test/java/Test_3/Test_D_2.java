package Test_3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_D_2 {

	@Test
	public void VerifyTest_1() {
	System.out.println("Email id");	
	System.out.println("Password");	
	System.out.println("Login");	
		
	String expected="BugSpotter";
	String actual="bugspotter";
	
  Assert.assertEquals(actual, expected);	
  
System.out.println("Test Done");  
	}
	

	
}
