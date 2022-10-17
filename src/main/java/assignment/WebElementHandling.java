package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementHandling {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//1.
//		driver.findElement(By.id("input-firstname")).sendKeys("Aarthi");
//		driver.findElement(By.id("input-lastname")).sendKeys("Sundar");
//		driver.findElement(By.id("input-email")).sendKeys("aarthi@gmail.com");
//		driver.findElement(By.id("input-telephone")).sendKeys("4372559071");
//		driver.findElement(By.id("input-password")).sendKeys("aarthi@123");
//		driver.findElement(By.id("input-confirm")).sendKeys("aarthi@123");
		
		//2.
//		WebElement firstName = driver.findElement(By.id("input-firstname"));
//		WebElement lastName = driver.findElement(By.id("input-lastname"));
//		WebElement email = driver.findElement(By.id("input-email"));
//		WebElement telephone = driver.findElement(By.id("input-telephone"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		WebElement pwdConfirm = driver.findElement(By.id("input-confirm"));
//		
//		firstName.sendKeys("Aarthi");
//		lastName.sendKeys("Sundar");
//		email.sendKeys("aarthi@gmail.com");
//		telephone.sendKeys("4372559071");
//		password.sendKeys("aarthi@123");
//		pwdConfirm.sendKeys("aarthi@123");
		
		//3.By locator
		
//		By firstName = By.id("input-firstname");
//		By lastName = By.id("input-lastname");
//		By email = By.id("input-email");
//		By telephone = By.id("input-telephone");
//		By password = By.id("input-password");
//		By pwdConfirm = By.id("input-confirm");
//		
//		WebElement fName = driver.findElement(firstName);
//		WebElement lName = driver.findElement(lastName);
//		WebElement emailId = driver.findElement(email);
//		WebElement telePhone = driver.findElement(telephone);
//		WebElement pwd = driver.findElement(password);
//		WebElement pwdCfrm = driver.findElement(pwdConfirm);
//		
//		fName.sendKeys("Aarthi");
//		lName.sendKeys("Sundar");
//		emailId.sendKeys("aarthi@gmail.com");
//		telePhone.sendKeys("4372559071");
//		pwd.sendKeys("aarthi@123");
//		pwdCfrm.sendKeys("aarthi@123");
		
		//4.By locator + generic function
		
//		By firstName = By.id("input-firstname");
//		By lastName = By.id("input-lastname");
//		By email = By.id("input-email");
//		By telephone = By.id("input-telephone");
//		By password = By.id("input-password");
//		By pwdConfirm = By.id("input-confirm");
//		
//		getElement(firstName).sendKeys("Aarthi");
//		getElement(lastName).sendKeys("Sundar");
//		getElement(email).sendKeys("aarthi@gmail.com");
//		getElement(telephone).sendKeys("4372559071");
//		getElement(password).sendKeys("aarthi@123");
//		getElement(pwdConfirm).sendKeys("aarthi@123");
		
		//5.By locators + getElement + actions generic function
		
//		By firstName = By.id("input-firstname");
//		By lastName = By.id("input-lastname");
//		By email = By.id("input-email");
//		By telephone = By.id("input-telephone");
//		By password = By.id("input-password");
//		By pwdConfirm = By.id("input-confirm");
//		
//		doSendKeys(firstName,"Aarthi");
//		doSendKeys(lastName,"Sundar");
//		doSendKeys(email,"aarthi@gmail.com");
//		doSendKeys(telephone,"4372559071");
//		doSendKeys(password,"aarthi@123");
//		doSendKeys(pwdConfirm,"aarthi@123");
		
		//6.By locator + ElementUtil --> generic functions
		
//		By firstName = By.id("input-firstname");
//		By lastName = By.id("input-lastname");
//		By email = By.id("input-email");
//		By telephone = By.id("input-telephone");
//		By password = By.id("input-password");
//		By pwdConfirm = By.id("input-confirm");
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(firstName, "Aarthi");
//		eleUtil.doSendKeys(lastName, "Sundar");
//		eleUtil.doSendKeys(email, "aarthi@gmail.com");
//		eleUtil.doSendKeys(telephone, "4372559071");
//		eleUtil.doSendKeys(password, "aarthi@123");
//		eleUtil.doSendKeys(pwdConfirm, "aarthi@123");
		
		//7. By locators + BrUtil + EleUtil
		
	}
	
	public static void doSendKeys(By locator, String value) {
		
		getElement(locator).sendKeys(value);
	}
	
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}

}
