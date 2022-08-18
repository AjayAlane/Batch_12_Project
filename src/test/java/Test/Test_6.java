package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_6 {

	public static void main(String[] args) throws Exception {
   WebDriverManager.chromedriver().setup();
   WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	
	WebElement source=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	WebElement destination=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"))	;
	
	Actions act=new Actions(driver);
	act.dragAndDrop(source, destination).build().perform();	
	WebElement sourc=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
	WebElement destinatio=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"))	;	
	act.dragAndDrop(sourc, destinatio).build().perform();
	Thread.sleep(4000);
	WebElement sour=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
	WebElement destinati=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"))	;
		act.dragAndDrop(sour, destinati).build().perform();
		Thread.sleep(4000);
		WebElement sou=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement dest=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"))	;
		act.dragAndDrop(sou, dest).build().perform();
		Thread.sleep(5000);
		driver.close();
	}

}
