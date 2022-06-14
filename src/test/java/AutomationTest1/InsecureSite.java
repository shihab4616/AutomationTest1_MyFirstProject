package AutomationTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class InsecureSite {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "c://geckodriver.exe");
		FirefoxOptions obj= new FirefoxOptions();
		obj.setAcceptInsecureCerts(true);
		
		// jokhon link ta copy kore google kora hoy tokhon direct login page ase naa but run korle ase
		
		//******Class No_17th********** (1.03 min)
		
		driver= new FirefoxDriver();
		driver.get("https://buportal.cloudapp.net/LoginPage.aspx");
		System.out.println(driver.getTitle());
	}

}

