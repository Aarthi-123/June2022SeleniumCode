package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlerWithEachWindows {
		static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent window
		Thread.sleep(5000);
		
		
		

//		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[1]")).click();
//		Thread.sleep(2000);
//		
//		Set<String> handles = driver.getWindowHandles();
//		
//		Iterator<String> it = handles.iterator();
//		
//		String parentWindowId = it.next();
//		System.out.println("parent window id is: " + parentWindowId);
//		
//		String childWindowId = it.next();
//		System.out.println("child window id is: " + childWindowId);
//		
//		driver.switchTo().window(childWindowId);
//		Thread.sleep(2000);
//		System.out.println("child window title : " + driver.getTitle());
//		driver.close();
//		driver.switchTo().window(parentWindowId);
//		System.out.println("parent window title : " + driver.getTitle());
		
		//--------------------------------------------------------------------------
		
//		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[2]")).click();
//		Thread.sleep(2000);
//		
//		Set<String> handles1 = driver.getWindowHandles();
//		
//		Iterator<String> it1 = handles1.iterator();
//		
//		String parentWindowId1 = it1.next();
//		System.out.println("parent window id is: " + parentWindowId1);
//		
//		String childWindowId1 = it1.next();
//		System.out.println("child window id is: " + childWindowId1);
//		
//		driver.switchTo().window(childWindowId1);
//		Thread.sleep(2000);
//		System.out.println("child window title : " + driver.getTitle());
//		driver.close();
//		driver.switchTo().window(parentWindowId1);
//		System.out.println("parent window title : " + driver.getTitle());
		
		//-------------------------------------------------------------------------------------------
	
		doClickLink();

	}

	
	public static void doClickLink() throws InterruptedException {
		for(int i=1; i<=getRowCount(); i++) {
		String xpath = "(//div[@class='orangehrm-login-footer-sm']/a)["+ i +"]";
		driver.findElement(By.xpath(xpath)).click();
		
		Thread.sleep(5000);
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String parentWindowId = it.next();
		System.out.println("parent window id is: " + parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("child window id is: " + childWindowId);
		
		driver.switchTo().window(childWindowId);
		Thread.sleep(2000);
		System.out.println("child window title : " + driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowId);
		Thread.sleep(2000);
		System.out.println("parent window title : " + driver.getTitle());
		}
	}
	
	public static int getRowCount() {
		int rows = driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']/a")).size();
		return rows;
	}

}
