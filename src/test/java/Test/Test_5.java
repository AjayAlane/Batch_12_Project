package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_5 {

	public static void main(String[] args) {
   WebDriverManager.chromedriver().setup();
   WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");	
	driver.manage().window().maximize();
	
	WebElement txt_selenium=driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
		
	Actions act=new Actions(driver);
		act.moveToElement(txt_selenium).click().build().perform();
		
	WebElement Rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));	
		act.contextClick(Rightclick).build().perform();
		
	WebElement Doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));	
	act.doubleClick(Doubleclick).build().perform();
	driver.close();
	}

}
