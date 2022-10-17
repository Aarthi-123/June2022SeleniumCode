package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		

//		driver.findElement(By.linkText("Register")).click();
//		driver.navigate().back();
//		driver.findElement(By.linkText("Forgotten Password")).click();
//		driver.navigate().back();
//		driver.findElement(By.linkText("My Account")).click();
//		driver.navigate().back();
//		driver.findElement(By.linkText("Address Book")).click();
//		driver.navigate().back();
//		driver.findElement(By.linkText("Wish List")).click();
//		driver.navigate().back();
//		driver.findElement(By.linkText("Order History")).click();
//		driver.navigate().back();
//		driver.findElement(By.linkText("Downloads")).click();
//		driver.navigate().back();
//		driver.findElement(By.linkText("Recurring payments")).click();
//		driver.navigate().back();
//		driver.findElement(By.linkText("Reward Points")).click();
//		driver.navigate().back();
//		driver.findElement(By.linkText("Returns")).click();
//		driver.navigate().back();
//		driver.findElement(By.linkText("Transactions")).click();
//		driver.navigate().back();
//		driver.findElement(By.linkText("Newsletter")).click();
//		driver.navigate().back();

		
		//By locators:
//		By login = By.linkText("Login");
		By register = By.linkText("Register");
		By forgPwd = By.linkText("Forgotten Password");
		By acc = By.linkText("My Account");
		By addBook = By.linkText("Address Book");
		By wishList = By.linkText("Wish List");
		By orderHist = By.linkText("Order History");
		By downloads = By.linkText("Downloads");
		By recuPay = By.linkText("Recurring payments");
		By rewPoints = By.linkText("Reward Points");
		By returns = By.linkText("Returns");
		By trans = By.linkText("Transactions");
		By newsletter = By.linkText("NewsLetter");
		
//		doClick(login);
		doClick(register);
		doClick(forgPwd);
		doClick(acc);
		doClick(addBook);
		doClick(wishList);
		doClick(orderHist);
		doClick(downloads);
		doClick(recuPay);
		doClick(rewPoints);
		doClick(returns);
		doClick(trans);
		doClick(newsletter);
		
	}
	
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}
	
	public static void doClick(By locator)  {
		
		getElement(locator).click();

		naviBack();
		
	}
	
	public static void naviBack() {
		driver.navigate().back();
	}

}
