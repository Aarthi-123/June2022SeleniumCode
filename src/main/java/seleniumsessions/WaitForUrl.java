package seleniumsessions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForUrl {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent window
//		driver.manage().window().maximize();

		By ytLink = By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[4]");
		
//		By ytLink = By.xpath("(//div[@class='orangehrm-login-footer-sm1111']/a)[4]");//no such element 
		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.waitForElementVisible(ytLink, 10).click();
		//(tried for 10 second(s) with 500 milliseconds interval)
		
		//window switch code
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ytLink));
		
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[4]")).click();//YT
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String parentWindowId = it.next();
		System.out.println("parent window id is: " + parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("child window id is: " + childWindowId);
		
		driver.switchTo().window(childWindowId);
		System.out.println("child window title : " + driver.getTitle());
		WebDriverWait waitToGetUrl = new WebDriverWait(driver, Duration.ofSeconds(10));
		if(waitToGetUrl.until(ExpectedConditions.urlContains("OrangeHRMInc"))) {
			System.out.println(driver.getCurrentUrl());
		}
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window title : " + driver.getTitle());
		
		

	}
	public static String waitForUrlContains(int timeOut, String urlFraction) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.urlContains(urlFraction))) {//contains-- partial text can be given
			return driver.getCurrentUrl();
		}
		else {
			return null;
		}
	}
	
	public static String waitForUrlIs(int timeOut, String urlValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.urlToBe(urlValue))) {
			return driver.getCurrentUrl();
		}
		else {
			return null;
		}
	}

}
