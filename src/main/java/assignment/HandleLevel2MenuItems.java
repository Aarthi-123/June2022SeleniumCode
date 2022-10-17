package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleLevel2MenuItems {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		
		By parent1Menu = By.linkText("SHOP BY CATEGORY");
		By parent2Menu = By.linkText("Bakery, Cakes & Dairy");
		By parent3Menu = By.linkText("Cookies, Rusk & Khari");
		By childMenu = By.linkText("Millet Cookie");
		handleLevel3MenuItems(parent1Menu,parent2Menu,parent3Menu,childMenu);

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void handleLevel3MenuItems(By parent1Menu,By parent2Menu,By parent3Menu, By childMenu) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parent1Menu)).build().perform();
		Thread.sleep(3000);
		act.moveToElement(getElement(parent2Menu)).build().perform();
		Thread.sleep(3000);
		act.moveToElement(getElement(parent3Menu)).build().perform();
		Thread.sleep(3000);
		getElement(childMenu).click();
	} 

}
