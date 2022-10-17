package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureValidationText {

		static WebDriver driver;
		
	public static void main(String[] args) {
		
		//
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By continueBtn = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
		//
		doClick(continueBtn);
		
		By valiFirstName = By.xpath("//*[@id=\"account\"]/div[2]/div/div");
		By valiLastName = By.xpath("//*[@id=\"account\"]/div[3]/div/div");
		By valiEmail = By.xpath("//*[@id=\"account\"]/div[4]/div/div");
		By valiTelePhone = By.xpath("//*[@id=\"account\"]/div[5]/div/div");
		By valiPassword = By.xpath("//*[@id=\"content\"]/form/fieldset[2]/div[1]/div/div");
		
		
		String valiFirstNameText = doGetText(valiFirstName);		
		String valiLastNameText = doGetText(valiLastName);
		String valiEmailText = doGetText(valiEmail);
		String valiTelePhoneText = doGetText(valiTelePhone);
		String valiPasswordText = doGetText(valiPassword);
		
		
		System.out.println(valiFirstNameText + "\n" + valiLastNameText + "\n" + valiEmailText + "\n" + valiTelePhoneText + "\n" + valiPasswordText );
		
		
	}
	
	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
