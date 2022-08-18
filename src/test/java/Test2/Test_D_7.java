package Test2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_D_7 {

@Test
public void A() {
	
	System.out.println("Test 1");
Assert.assertTrue(false);
}
@Test(dependsOnMethods="A")
public void B() {
	
	System.out.println("Test 2");
}
@Test
public void C() {
	
	System.out.println("Test 3");
}
	
	
	
	
	
	
	
}
