package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {

	public static void main(String[] args) {
		
		//
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//usage of different locators:
		//1.id
		driver.findElement(By.id("input-firstname")).sendKeys("Aarthi");
		
		//2.name:
		driver.findElement(By.name("lastname")).sendKeys("Sundar");
		
		//3.className:
//		driver.findElement(By.className("form-control")).sendKeys("aarthi@gmail.com");//it show the result in search bcoz it always pick the first element of the page(duplicate className)
		
		//4.linkText:only for links
		//5.partialLinkText: only for links
		//6.xpath:
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("aarthi@gmail.com");
		//7.css selector:
		driver.findElement(By.cssSelector("#input-telephone")).sendKeys("4372559071");
		//8.tag name: its not unique
		
		//id
		driver.findElement(By.id("input-password")).sendKeys("aarthi@123");
		//name:
		driver.findElement(By.name("confirm")).sendKeys("aarthi@123");
		
		
		
	}

}
