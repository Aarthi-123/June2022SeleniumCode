package assignment;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PseudoElementHandle {
		
	static WebDriver driver;
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		String email_script = "return window.getComputedStyle(document.querySelector(\"label[for='input-email']\"), '::before').getPropertyValue('content')";
		checkElementIsMandatory(email_script);
		
		String tel_script = "return window.getComputedStyle(document.querySelector(\"label[for='input-telephone']\"), '::before').getPropertyValue('content')";
		checkElementIsMandatory(tel_script);
	}
	
	public static boolean checkElementIsMandatory(String jsScript) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String email_text = js.executeScript(jsScript).toString();
		
		System.out.println(email_text);
		
		if(email_text.contains("*")) {
			System.out.println("Element is mandatory");
			return true;
		}else {
			System.out.println("Element is not mandatory");
			return false;
		}
			
		
	}
	
}
