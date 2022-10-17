package seleniumsessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		// open browser:chrome
		// launch url:google.com
		// get the title
		// verify the title:act vs exp
		// close the browser

		// download chromedriver.exe file--configure it

		// mac:
//		System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");

		// windows:s

		// automation steps:
		System.setProperty("webdriver.chrome.driver", "c:\\Users\\aarth\\Desktop\\chromedriver\\chromedriver.exe");// mention the
																										// chrome driver
																										// path
		WebDriver driver = new ChromeDriver();// launch the chrome browser--it will open the the browser it is the
												// replica browser its not the original browser //top casting---- driver
												// is the reference variable----new ChromeDriverwill launch the
												// constructor
		driver.get("https://www.google.com");//enter the url---u have to pass the protocol mandatory https-- otherwise it wont work it will show error
		
		String title = driver.getTitle();//get the title
		System.out.println("page title:" + title);
		
		//verification point:act vs exp result //checkpoint
		if(title.equals("Google")) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String source = driver.getPageSource();
//		System.out.println(source);//source code will display
		if(source.contains("Copyright The Closure Library Authors")) {
			System.out.println("PASS");
		}
		
		//close the browser
		driver.quit();
//		driver.close();
	}

}

//view the image refer the git hub selenium

//SearchContext(Interface---FE,FES(findelement, findelements)(no method body)
//from SearchContext extends it is the child of WebDriver(Interface---get,url,getTitle,close,switch()no method body)
//from WebDriver it will implements the Remote WebDriver(Class-------override the methods from WebDriver and SearchContext)
//from Remote WebDriver child will be Chromium Driver(browser protocol)
//											|
//											/\
//								ChromeDriver  and EdgeDriver
//from RemoteWebDriver extends child of FirefoxDriver and SafariDriver
//Remote WebDriver will launch the browser.... so WebDriver in the form of interface....

//u can top cast the grandchild from grandparents and parents

//from the client script(sel,java,c#,py,rb,php) it will go to the server(will interact with the browser) and then it will open the browser url chrome etc.
//from the client script u cant interact directly with the browser thru server oly u can interact with the browser
//in the client script we have to configure the executable file and then in the server driver executable file will be there
//in the server for chrome---chromedriver.exe, Firefox---geckodriver.exe, Edege---edgedriver.exe, IE--iedriver.exe---these will be provided by browser vendors(google,mozilla,microsoft,microsoft) not selenium
//whatever the user is requesting it sent to the server(chromedriver.exe) & then it will interact with chrome

//so first we have to download the chrome driver from google "https://chromedriver.chromium.org/downloads"