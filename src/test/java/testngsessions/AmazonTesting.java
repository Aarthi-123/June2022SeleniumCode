package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTesting {
	
	WebDriver driver;

	@BeforeMethod//bcoz of this before method it always run for 3 times bcoz of 3 times of test cases
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/");
	}

	@Test(priority = 1)
	public void searchTest() {
		boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		System.out.println(flag);
		Assert.assertEquals(flag, true);
	}

	@Test(priority = 3)
	public void pageTitleTest() {
		String title = driver.getTitle();
		System.out.println("page title: " + title);
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");
	}

	@Test(priority = 2)
	public void logoTest() {
		// boolean flag = driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
		Assert.assertTrue(driver.findElement(By.id("nav-logo-sprites")).isDisplayed());
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

//BM is always better we will think each and every test cases it will open 3 times but crashes in the browser or some problem it will affect
//the all execution so for each and every test cases befeore and after separate method will be helpful for the test cases in the execution
//for time conception BeforeTest or BeforeSuite or BeforeClass will be useful bcoz it will execute oly one time
