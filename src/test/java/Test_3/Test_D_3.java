package Test_3;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_D_3 {

@Test
public void Test_1() {
	SoftAssert soft=new SoftAssert();
	
	System.out.println("Email id");	
	System.out.println("Password");	
	System.out.println("Login");	
		
	String expected="BugSpotter";
	String actual="bugspotter";	
	
   soft.assertEquals(actual, expected);	
	System.out.println("Test Done");
	
soft.assertAll();
	
	
}
	

}
