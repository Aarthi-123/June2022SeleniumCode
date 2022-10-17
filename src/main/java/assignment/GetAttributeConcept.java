package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");

//		WebElement fullName =  driver.findElement(By.id("Form_getForm_FullName"));
//		fullName.sendKeys("Aarthi");
//		String fullNameText = fullName.getAttribute("value");
//		System.out.println(fullNameText);

		By fullName = By.id("Form_getForm_FullName");
		By country = By.id("Form_getForm_Country");
		By emailId = By.id("Form_getForm_Email");
		By logoImg = By.xpath("/html/body/nav/div/a/img");
		doSendKeys(fullName,"Aarthi");
		doSendKeys(country,"Canada");
		String fullNameText = doGetAttribute(fullName,"value");
		String countryText = doGetAttribute(country,"value");
		String emailText = doGetAttribute(emailId,"placeholder");
		String logoImgText = doGetAttribute(logoImg,"src");
		System.out.println(fullNameText);
		System.out.println(countryText);
		System.out.println(emailText);
		System.out.println(logoImgText);
		

	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {

		getElement(locator).sendKeys(value);
	}

	public static String doGetAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

}
