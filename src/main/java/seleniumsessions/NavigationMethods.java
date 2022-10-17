package seleniumsessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {

	public static void main(String[] args) throws MalformedURLException {
		
//		System.setProperty("webdriver.chrome.driver", "c:\\Users\\aarth\\Desktop\\chromedriver\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.amazon.com");
		
//		driver.navigate().to(new URL("https://www.amazon.com"));
//		
//		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		
		System.out.println(driver.getTitle());

		driver.navigate().back();

		System.out.println(driver.getTitle());
		
		//refresh
		driver.navigate().refresh();
	}

}

//navigation is back and forward button in the browser -> <-
//navigate and get() method both are same 
//from script it go to 'to method' inside the to method get method oly written , so navigate and get method both are same
//when each time calling internally it goes to the get method oly
//to and get method both are synonyms
//driver.navigate().to method is the method overloading method
//there are 2 methods
//driver.navigate().to("https://www.amazon.com");
//driver.navigate().to(new URL("https://www.amazon.com"));
//with url and without url
//with navigate u can do back and forward
//with get u cant do back and forward that is the difference


