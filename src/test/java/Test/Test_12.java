package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_12 {

	public static void main(String[] args) {
   WebDriverManager.chromedriver().setup();
   WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");	
	driver.manage().window().maximize();
	
	WebElement txt_FN=driver.findElement(By.xpath("//input[@name='firstName']"));
	WebElement txt_LN=driver.findElement(By.xpath("//input[@name='lastName']"));
	WebElement txt_Phone=driver.findElement(By.xpath("//input[@name='phone']"));
	WebElement txt_Email=driver.findElement(By.xpath("//input[@name='userName']"));
	WebElement txt_Address=driver.findElement(By.xpath("//input[@name='address1']"));
	WebElement txt_City=driver.findElement(By.xpath("//input[@name='city']"));
	WebElement txt_State=driver.findElement(By.xpath("//input[@name='state']"));
	WebElement txt_PC=driver.findElement(By.xpath("//input[@name='postalCode']"));
   WebElement drp_Country=driver.findElement(By.xpath("//select[@name='country']"));
	    
	
	
		
		
	}

}
