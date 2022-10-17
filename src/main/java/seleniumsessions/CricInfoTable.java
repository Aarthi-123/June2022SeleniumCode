package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricInfoTable {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/india-women-in-england-2022-1289245/england-development-squad-women-vs-india-women-warm-up-1332750/full-scorecard");

		Thread.sleep(4000);
		
//		getWckTakerName("Shafali Verma");
//		getWckTakerName("Dayalan Hemalatha");
		
//		List<WebElement> scoreList = driver.findElements(By.xpath("//span[text()='Shafali Verma']/ancestor::td/following-sibling::td"));
//		
//		for(WebElement e: scoreList) {
//			String text = e.getText();
//			System.out.println(text);
//		}
		
		scoreList("Shafali Verma");
		
	}
	
	public static ArrayList<String> scoreList(String name){
		List<WebElement> scoreList = driver.findElements(By.xpath("//span[text()='"+name+"']/ancestor::td/following-sibling::td"));
		
		ArrayList<String> batsmanScoreList = new ArrayList<String>(); 
		for(WebElement e: scoreList) {
			String text = e.getText();
			if(text.length()!=0) {
				System.out.println(text);	
			}
			
			batsmanScoreList.add(text);
		}
		return batsmanScoreList;
	}
	
	public static String getWckTakerName(String name) {
		String wkt_xpath =  "//span[text()='"+name+"']/ancestor::td/following-sibling::td";
		
		String wkTakerName = driver.findElement(By.xpath(wkt_xpath)).getText();
		System.out.println(wkTakerName);
		return wkTakerName;
	}

	
}
