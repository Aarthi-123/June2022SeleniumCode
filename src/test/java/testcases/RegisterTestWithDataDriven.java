package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterTestWithDataDriven {
	
	//data driven approach
	//testNG dataprovider
			
			WebDriver driver;
			
			@BeforeTest
			public void setup() {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.manage().deleteAllCookies();
				driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			}
			
			@DataProvider
			public Object[][] getNegativeRegisterData() {
					return new Object[][] {
					
					{"aarthi", "S", "aarthi@gmail.com","8825562190", "#a#a#a"},
					{"sundar", "Aarthi", "sun@gmail.com", "123","4356"},
					{"    ", "test@123", "@com","4372559170","5455"},
					{"test@gmail.@.com", "test@121212", "email", "%^$&", "()(("},
					{"S", "A","@", "123", "2#$"}
				};
			}
			
			@Test(dataProvider = "getNegativeRegisterData")
			public void registerNegativeTest(String firstname, String lastname, String email, String telephone, String password) {
				Assert.assertEquals(doRegister(firstname, lastname, email, telephone, password), true);
			}
			
			public boolean doRegister(String firstname, String lastname, String email, String telephone, String password) {
				driver.findElement(By.id("input-firstname")).clear();
				driver.findElement(By.id("input-firstname")).sendKeys(firstname);
				
				driver.findElement(By.id("input-lastname")).clear();
				driver.findElement(By.id("input-lastname")).sendKeys(lastname);
				
				driver.findElement(By.id("input-email")).clear();
				driver.findElement(By.id("input-email")).sendKeys(email);
				
				driver.findElement(By.id("input-telephone")).clear();
				driver.findElement(By.id("input-telephone")).sendKeys(telephone);
				
				driver.findElement(By.id("input-password")).clear();
				driver.findElement(By.id("input-password")).sendKeys(password);
				
				driver.findElement(By.id("input-confirm")).clear();
				driver.findElement(By.id("input-confirm")).sendKeys(password);
				
				driver.findElement(By.name("agree")).click();
				
				driver.findElement(By.xpath("//input[@value='Continue']")).click();
				
				return driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).isDisplayed();
				
			}
			
			@AfterTest
			public void tearDown() {
				//driver.quit();
			}

}
