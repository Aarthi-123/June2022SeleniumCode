package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowser {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "c:\\Users\\aarth\\Desktop\\chromedriver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();//launch the chrome browser
		
//		System.setProperty("webdriver.gecko.driver", "c:\\Users\\aarth\\Desktop\\firefoxdriver\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
//		WebDriver driver = new SafariDriver();//no need of system set property for safari
		
//		cross browser logic:
		
		String browser = "firefox";
		
		switch (browser.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "c:\\Users\\aarth\\Desktop\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver",  "c:\\Users\\aarth\\Desktop\\firefoxdriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
			
		case "safari":
			driver = new SafariDriver();
			break;

		default://if the case comes to default it will show null pointer exception NPE 
			System.out.println("plz pass the right browser....");
			break;
		}
		
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("page title: "+ title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		//close the browser:
		driver.quit();

	}

}
