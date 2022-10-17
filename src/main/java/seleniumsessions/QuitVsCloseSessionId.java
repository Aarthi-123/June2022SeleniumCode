package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsCloseSessionId {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\Users\\aarth\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch chrome browser//123(session id)
		driver.get("https://www.google.com");// enter url//123(session id)

		String title = driver.getTitle();// get the title//123(session id)
		System.out.println("page title : " + title);//Google

		// close the browser: 
		//NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		//driver.quit();//123(session id)
		
		//System.out.println(driver.getTitle());//if it is quit it will show null(session id) -- nosuchsessionid exception after quitting the session u r asking the title
		driver.close();
		
		//System.out.println(driver.getTitle());//if it is close it will show same session id 123(session id) -- invalid exception
		
		//to again get the title u have to relaunch the browser:
		driver = new ChromeDriver();// launch chrome browser//456 - new session id
		driver.get("https://www.google.com");//456
		System.out.println(driver.getTitle());//456
		driver.quit();//456
	}

}

//for quit null session ID---//NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
//for close same session ID 
