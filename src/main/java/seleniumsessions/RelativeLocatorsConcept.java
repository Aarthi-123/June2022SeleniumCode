package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorsConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		
		

//		WebElement ele = driver.findElement(By.linkText("Saskatoon, Canada"));
//		
//		// right of ele --> tagname(p)
//				String rightIndex = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
//				System.out.println(rightIndex);
//
//		// left of ele:
//				String leftRank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
//				System.out.println(leftRank);
//
//		// below of ele:
//				String belowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
//				System.out.println(belowCity);
//				
//		//above of ele:
//				String aboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
//				System.out.println(aboveCity);
//				
//		//near of ele:
//				String nearEle = driver.findElement(with(By.tagName("p")).near(ele)).getAttribute("class");
//				System.out.println(nearEle);
//				

				

				By getDetailsOfCityName = By.linkText("Whistler, Canada");
				cityName(getDetailsOfCityName);
	}
	
	public static WebElement getElement(By locator) {

		return driver.findElement(locator);

	}
	
	public static void cityName(By locator) {

		System.out.println(locator);
		WebElement ele = getElement(locator);
		System.out.println(ele);
		
		String rightIndex = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(rightIndex);
		
		String leftRank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftRank);
		
		String belowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowCity);
		
		String aboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveCity);
		
		String nearEle = driver.findElement(with(By.tagName("p")).near(ele)).getAttribute("class");
		System.out.println(nearEle);

		
	}
	


	

}
