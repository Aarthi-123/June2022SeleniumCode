package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterBrowserUtil {

	private WebDriver driver;

	public WebDriver launchBrowser(String browser) throws Exception {
		System.out.println("browser name is: " + browser);

		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
			break;

		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("plz pass the right browser....");
			throw new Exception("WRONGBROWSER");

		}

		return driver;
	}

	public void launchUrl(String url) throws Exception {
		if (url == null) {
			System.out.println("url is null");
			throw new Exception("URLISNULL");
		}

		if (url.length() == 0) {
			System.out.println("url is blank");
			throw new Exception("URLBLANKEXCEPTION");
		}

		if (url.indexOf("http") != 0 && url.indexOf("https") != 0) {

			System.out.println("http(s) is missing");
			throw new Exception("HTTP(s)MISSINGEXCEPTION");
		}

		driver.get(url);
	}
	
	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		if (title != null) {
			return title;
		} else {
			System.out.println("getting null title....");
			return null;
		}
	}
	
	public String getPageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println("page url: " + url);
		
		if(url!=null) {
			return url;
		}else {
			System.out.println("getting null url....");
			return null;
		}
	}
	
	public void closeBrowser() {
		if(driver!=null) {
			driver.close();
			System.out.println("browser is closed....");
		}
	}
	
	public void quitBrowser() {
		if(driver!=null) {
			driver.quit();
			System.out.println("browser is closed....");
		}
	}

}
