package assignment;

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
		
//		bowScrList("Linsey Smith");
		bowlingScoreList("Linsey Smith");
		
		
	}
	
	public static ArrayList<String> bowlingScoreList(String name){
		List<WebElement> scoreList = driver.findElements(By.xpath("//span[text()='"+name+"']/ancestor::td/following-sibling::td"));
		
		ArrayList<String> bowScoreList = new ArrayList<String>();
		
		for(WebElement e: scoreList) {
			String text = e.getText();
			System.out.println(text);
			bowScoreList.add(text);
		}
		return bowScoreList;
	}
	
	public static String bowScrList(String name) {
		String bowlingScrList_xpath = "//span[text()='"+name+"']/ancestor::td/following-sibling::td";
		
		String bowlingScrList = driver.findElement(By.xpath(bowlingScrList_xpath)).getText();
		System.out.println(bowlingScrList);
		return bowlingScrList;
	}

}
