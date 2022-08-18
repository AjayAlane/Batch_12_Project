package Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_7 {

	public static void main(String[] args) throws Exception {

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement txt_email=driver.findElement(By.xpath("//input[@name='email']"));	
	WebElement txt_password=driver.findElement(By.xpath("//input[@name='pass']"));	
	WebElement btn_login=driver.findElement(By.xpath("//button[@name='login']"));	

	txt_email.sendKeys("test");
	txt_password.sendKeys("123456778");
	btn_login.click();

	String path="F:\\Batch_12_Project\\ScreenShot";
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File destn=new File(path+"\\test.png");	
		FileUtils.copyDirectory(src, destn);
		
		
		
		
		
	}

}
