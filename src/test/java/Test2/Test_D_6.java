package Test2;

import org.testng.annotations.Test;

public class Test_D_6 {

@Test(priority=1)
public void A() {
	System.out.println("Test 1");
}
@Test(priority=0,enabled=false)
public void B() {
	System.out.println("Test 2");
}	
@Test(priority=-1)
public void C() {
	System.out.println("Test 3");
}	
	
	
	
	
}
