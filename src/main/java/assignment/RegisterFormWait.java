package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterFormWait {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email_id = By.id("input-email");
		By telePhone = By.id("input-telephone");
		By pwd = By.id("input-password");
		By pwd_cfrm = By.id("input-confirm");
		By checkBox = By.name("agree");
		By but_click = By.xpath("//input[@value='Continue']");
		By acc_text = By.tagName("h1");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//		WebElement fn_el = wait.until(ExpectedConditions.presenceOfElementLocated(firstName));
//		fn_el.sendKeys("aarthi");
		
		waitForElementPresence(firstName, 2).sendKeys("aarthi");
		
		doSendKeys(lastName, "Sundar");
		doSendKeys(email_id, "aarthi@gmail.com");
		doSendKeys(telePhone, "4372559071");
		doSendKeys(pwd, "aarthi@123");
		doSendKeys(pwd_cfrm, "aarthi@123");
		
		doClick(checkBox);
		doClick(but_click);
		
		String text = getElementTextWithWait(acc_text, 5);
		if(text.equals("Your Account Has Been Created!")) {
			System.out.println("acc is created");
		}
	
		

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSendKeys(By locator, String value) {

		getElement(locator).sendKeys(value);
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	public static WebElement waitForElementPresence(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static String getElementTextWithWait(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator)).getText();
	}

}
