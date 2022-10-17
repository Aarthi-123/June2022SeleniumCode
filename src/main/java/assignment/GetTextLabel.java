package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextLabel {
	
		static WebDriver driver;
		
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By fName = By.xpath("//*[@id=\"account\"]/div[2]/label");
		By lName = By.xpath("//*[@id=\"account\"]/div[3]/label");
		By email = By.xpath("//*[@id=\"account\"]/div[4]/label");
		By tphone = By.xpath("//*[@id=\"account\"]/div[5]/label");
		By pwd = By.xpath("//*[@id=\"content\"]/form/fieldset[2]/div[1]/label");
		By pwdcfrm = By.xpath("//*[@id=\"content\"]/form/fieldset[2]/div[2]/label");
		
		String regFormLabel1 = doGetText(fName);
		String regFormLabel2 = doGetText(lName);
		String regFormLabel3 = doGetText(email);
		String regFormLabel4 = doGetText(tphone);
		String regFormLabel5 = doGetText(pwd);
		String regFormLabel6 = doGetText(pwdcfrm);
		
		System.out.println(regFormLabel1 + "\n" + regFormLabel2 + "\n" + regFormLabel3 + "\n" + regFormLabel4 + "\n" + regFormLabel5 + "\n" + regFormLabel6 );

	}
	
	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}
	
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}
}
