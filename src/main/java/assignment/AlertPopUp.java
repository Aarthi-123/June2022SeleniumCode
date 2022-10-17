package assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUp {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		//alertPopUp
		
//		driver.findElement(By.name("alertbox")).click();
//		Thread.sleep(4000);
//		
//		
//		Alert alert = driver.switchTo().alert();
//		String alertText = alert.getText();
//		System.out.println(alertText);
//		
//		//accept
//		alert.accept();
		
		//ConfirmPopUp:
//		driver.findElement(By.name("confirmalertbox")).click();
//		Thread.sleep(4000);
//		
//		Alert alert = driver.switchTo().alert();
//		String alertText = alert.getText();
//		System.out.println(alertText);
//	
//		//dismiss
//		alert.dismiss();
		
		//Prompt PopUp
		driver.findElement(By.name("promptalertbox1234")).click();
		Thread.sleep(4000);
		
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		
		alert.sendKeys("Yes");
		
		//accept
		alert.accept();
	}

}
