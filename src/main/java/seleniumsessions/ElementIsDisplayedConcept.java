package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementIsDisplayedConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {

		//webele + isDisplayed()--->boolean---true/false
		
		//
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
//		boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
//		if(flag) {
//			System.out.println("element is displayed");
//		}else {
//			System.out.println("element is not displayed");
//		}
		By searchField = By.id("twotabsearchtextbox");
		
		if(doEleIsDisplayed(searchField)) {
			System.out.println("element is displayed");
			doSendKeys(searchField, "Macbook pro");
		}else {
			System.out.println("element is not displayed");
		}

	}
	
	public static boolean doEleIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public static WebElement getElement(By locator) {

		return driver.findElement(locator);
	}
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	

}
