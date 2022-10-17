package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGElement {
		
		static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		
		
//		driver.findElement(By.name("q")).sendKeys("hp laptop");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@type='submit']//*[local-name()='svg']")).click();
		
		
		By searchField = By.name("q");
		By searchLocator = By.xpath("//button[@type='submit']//*[local-name()='svg']");
		
		doSendKeys(searchField, searchLocator, "hp laptop");
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSendKeys(By searchFieldLocator,By searchLocator, String value) throws InterruptedException {
		getElement(searchFieldLocator).sendKeys(value);
		Thread.sleep(3000);
		getElement(searchLocator).click();
		
	}

}
