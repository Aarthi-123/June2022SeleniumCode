package assignment;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableCheckbox {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		Thread.sleep(3000);
		
//		String selChckBox ="//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@id='ohrmList_chkSelectRecord_21']";
//		driver.findElement(By.xpath(selChckBox)).click();
		
		Thread.sleep(3000);
		
		selectContact("Joe.Root");
		
//		List<WebElement> empRoleList = driver.findElements(By.xpath("//a[text()='Joe.Root']/parent::td/following-sibling::td"));
//		
//		for(WebElement e:empRoleList) {
//			String text = e.getText();
//			if(text.length()!=0) {
//				System.out.println(text);
//			}
//		}
		
		getEmpInfo("Joe.Root");
	}
	
	public static void selectContact(String userName) {
		String selChckBox ="//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@id='ohrmList_chkSelectRecord_21']";
		driver.findElement(By.xpath(selChckBox)).click();
	}
	
	public static ArrayList<String> getEmpInfo(String userName){
		List<WebElement> empRoleList = driver.findElements(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td"));
		ArrayList<String> empList = new ArrayList<String>();
		
		for(int i=0;i<empRoleList.size();i++) {
			String text = empRoleList.get(i).getText();
			System.out.println(text);
			empList.add(text);
		}
		return empList;
		
	}
	
	

}
