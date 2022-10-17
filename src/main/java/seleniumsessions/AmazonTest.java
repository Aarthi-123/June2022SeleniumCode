package seleniumsessions;

public class AmazonTest {

	public static void main(String[] args) throws Exception {
		
		String browser = "chrome";
		
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.launchBrowser(browser);
		
		brUtil.launchUrl("https://www.amazon.com");
		
		String title = brUtil.getPageTitle();
		if(title.contains("Amazon")) {
			System.out.println("CORRECT TITLE----PASS");
		}else {
			System.out.println("INCORRECT TITLE----FAIL");
		}
		brUtil.getPageUrl();
		brUtil.closeBrowser();
	}

}
