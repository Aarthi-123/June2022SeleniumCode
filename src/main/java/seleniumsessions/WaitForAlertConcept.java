package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForAlertConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();// browser - ch

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());//until method return Alert

		System.out.println(alert.getText());
		alert.accept();
		driver.switchTo().defaultContent();
		
		

	}
	
	// JS alert + wait
			public static Alert waitForAlert(int timeout) {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
				return wait.until(ExpectedConditions.alertIsPresent());
			}
			
			public static String getAlertText(int timeout) {
				return waitForAlert(timeout).getText();
			}
			
			public static void acceptAlert(int timeOut) {
				 waitForAlert(timeOut).accept();
			}
			
			public static void dismissAlert(int timeOut) {
				 waitForAlert(timeOut).dismiss();
			}
			
			public static void alertSendKeys(int timeOut, String value) {
				 waitForAlert(timeOut).sendKeys(value);
			}

}
