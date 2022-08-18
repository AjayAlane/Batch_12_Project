package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_11 {

	public static void main(String[] args) throws Exception {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement btn_CNA=driver.findElement(By.xpath("//a[text()='Create New Account']"));
	btn_CNA.click();
	Thread.sleep(5000);
	WebElement txt_Fn=driver.findElement(By.xpath("//input[@name='firstname']"));
	txt_Fn.sendKeys("Ajay");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Alane");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("test@gmail.com");
	driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("test@gmail.com");
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("12345678");
	
	WebElement drp_Day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select sel=new Select(drp_Day);	
		sel.selectByVisibleText("17");
		
		WebElement drp_Month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select sel1=new Select(drp_Month);	
		
		sel1.selectByVisibleText("Apr");
		
		WebElement drp_year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select sel2=new Select(drp_year);	
		
		sel2.selectByVisibleText("1997");
		driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba'])[2]")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
