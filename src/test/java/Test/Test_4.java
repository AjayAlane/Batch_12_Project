package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_4 {

	public static void main(String[] args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement drp_country=driver.findElement(By.xpath("//select[@name='country']"));
		
		Select sel=new Select(drp_country);
		sel.selectByIndex(2);
		sel.selectByIndex(4);
		Thread.sleep(5000);
		sel.selectByValue("INDIA");
		Thread.sleep(5000);
		sel.selectByVisibleText("CHINA");
		
		List<WebElement> list=sel.getOptions();
		System.out.println(list.size());
		
		driver.close();
	}

}
