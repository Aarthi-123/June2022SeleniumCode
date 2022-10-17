package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrame {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();//browser - ch

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");//page
		
		//frame
		//iframe
		
		driver.switchTo().frame(2);
		driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.name("main")));
		
		String header = driver.findElement(By.xpath("/html/body/h2")).getText();
		System.out.println(header);

	}

}

//frame is also a webElement
//frame is also have own html DOM
//frame is used to secure the web element from hackers
//driver will reach the web element but driver cant reach the web element inside the frame
//so we have to switch the driver to inside the frame to operate the frame web elements
//to come out from frame use method defaultContent()
