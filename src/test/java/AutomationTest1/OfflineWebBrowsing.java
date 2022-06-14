package AutomationTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OfflineWebBrowsing {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/User/eclipse-workspace/DemoOpenchart/Your Store.html");

	}

}
