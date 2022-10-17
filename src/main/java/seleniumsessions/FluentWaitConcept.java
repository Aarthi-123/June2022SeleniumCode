package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();// browser - ch

		driver.get("https://www.freshworks.com/");

		By support = By.linkText("Support11");
		
		//FW(c) ---> imp --> Wait(I)
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)//this is Fluent wait
										.withTimeout(Duration.ofSeconds(10))
										 .pollingEvery(Duration.ofSeconds(2))
										  .ignoring(NoSuchElementException.class)
										   .withMessage("element is not available on the page : " + support);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(support)).click();
		
		//WebDriverWait with Fluent features:
//		WebDriverWait wait1 = new  WebDriverWait(driver, Duration.ofSeconds(10));//this is webdriver wait 
//		wait1.pollingEvery(Duration.ofSeconds(2))
//			 .ignoring(NoSuchElementException.class);
//		
//		wait1.until(ExpectedConditions.visibilityOfElementLocated(support)).click();
		
		
	}
//u can use both type of wait fluent wait and webdriverwait
}
