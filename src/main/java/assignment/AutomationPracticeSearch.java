package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPracticeSearch {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

//		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
//		Thread.sleep(3000);
//		
//		List<WebElement> suggList = driver.findElements(By.xpath("//div[@class='ac_results']//li"));
//		System.out.println(suggList.size());
//		for(WebElement e:suggList) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("Casual Dresses > Printed Dress")) {
//				e.click();
//				break;
//			}
//		}

		By searchKey = By.id("search_query_top");
		By suggestions = By.xpath("//div[@class='ac_results']//li");
		automationPracticeSearch(searchKey, "Dress", suggestions, "Casual Dresses > Printed Dress");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void automationPracticeSearch(By searchLocator, String searchKey, By suggLocator, String value)
			throws InterruptedException {
		getElement(searchLocator).sendKeys(searchKey);
		Thread.sleep(3000);

		List<WebElement> suggList = getElements(suggLocator);
		System.out.println(suggList.size());

		for (WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);

			if (text.equals(value)) {
				e.click();
				break;
			}

		}
		if (value.contains("Printed Dress")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

	}

}
