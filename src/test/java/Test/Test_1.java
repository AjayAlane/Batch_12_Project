package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_1 {

	public static void main(String[] args) {
  WebDriverManager.chromedriver().setup();
  WebDriver driver=new ChromeDriver();
  driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.2.3");
	driver.manage().window().maximize();	
		
		
		
		
	driver.close();	
		
		
		
	}

}
