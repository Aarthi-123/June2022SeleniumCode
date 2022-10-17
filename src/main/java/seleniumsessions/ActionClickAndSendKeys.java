package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClickAndSendKeys {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName = By.id("input-firstname");
		By checkbox = By.name("agree");
		
		Actions act = new Actions(driver);
		act.sendKeys(driver.findElement(firstName), "testing").build().perform();
		
		act.click(driver.findElement(checkbox)).build().perform();
		// Clicks in the middle of the given element.
		// Equivalent to: Actions.moveToElement(onElement).click()
		

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).build().perform();
	}
	public static void doActionsSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();
	}

}
//browser minimize and overlapping the targeted element normal sendkeys wont work bcoz it wont click directlt it find that element without clicking it directly print the text 
//but in Actions class sendKeys it will first click that element and then it will print the text so Actions class sendKeys are better
