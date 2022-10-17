package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumsessions.ElementUtil;

public class RegisterPageTest {

	public static void main(String[] args) throws Exception {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		System.out.println(brUtil.getPageTitle());
		System.out.println(brUtil.getPageUrl());
		
		By firstName = By.id("input-firstname");
		By lastName = By.name("lastname");
		By email = By.xpath("//*[@id=\"input-email\"]");
		By telephone = By.cssSelector("#input-telephone");
		By password = By.id("input-password");
		By pwdConfirm = By.name("confirm");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(firstName, "Aarthi");
		eleUtil.doSendKeys(lastName, "Sundar");
		eleUtil.doSendKeys(email, "aarthi@gmail.com");
		eleUtil.doSendKeys(telephone, "4372559071");
		eleUtil.doSendKeys(password, "aarthi@123");
		eleUtil.doSendKeys(pwdConfirm, "aarthi@123");

	}

}
