package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By parentMenu = By.linkText("Laptops & Notebooks");
		By childMenu = By.linkText("Show All Laptops & Notebooks");
		handleLevel1MenuItems(parentMenu,childMenu);
		

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void handleLevel1MenuItems(By parentMenu, By childMenu) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenu)).build().perform();
		Thread.sleep(3000);
		getElement(childMenu).click();
		
	}

}
