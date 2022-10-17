package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
//		WebElement sourceEle = driver.findElement(By.id("draggable"));
//		WebElement targetEle = driver.findElement(By.id("droppable"));
		
//		Actions act = new Actions(driver);//builder pattern each method returning the current class property
//		act
//			.clickAndHold(sourceEle)
//				.moveToElement(targetEle)
//					.release()	
//						.build().perform();
		
//		act.dragAndDrop(sourceEle, targetEle).build().perform();
		
		By sourceEle = By.id("draggable");
		By targetEle = By.id("droppable");
		dragAndDrop(sourceEle,targetEle);

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void  dragAndDrop(By sourceElement, By targetElement) {
		Actions act = new Actions(driver);
		act
		.clickAndHold(getElement(sourceElement))
			.moveToElement(getElement(targetElement))
				.release()	
					.build().perform();
		
	}
}
