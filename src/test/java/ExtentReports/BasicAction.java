package ExtentReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.gson.GsonExtentTypeAdapterBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BasicAction {

	public static WebDriver driver;
	//Extent Implementation;
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/BasicAction.html");

	@Test
	public static void chrome_launch() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Test
	public void Valid_LoginTest_001() {

		//Author Description
		ExtentTest test1= extent.createTest("This Test Case For LogIn VAlidation")
				.assignAuthor("Shihab")
				.assignCategory("Smoke Test")
				.assignDevice("Chrome");
		
       // Extent Info
		test1.info("This test for valid login");
		test1.log(Status.PASS, "This case is passed");

		//Login Orange HRM
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123"); 
		driver.findElement(By.id("btnLogin")).click(); 

	}

	@Test
	public void InValid_LoginTest_002() {

		//Author Description
		ExtentTest test2= extent.createTest("This Test Case For InValid LogIn ")
				.assignAuthor("Asmin")
				.assignCategory("Sanity Test")
				.assignDevice("Edge");
		
		//Extent Info
		test2.info("This test for Invalid login");
		test2.log(Status.FAIL, "This case is Failed");
		
		//Email varification Orange HRM
		driver.findElement(By.id("txtUsername")).sendKeys("bbb");
		driver.findElement(By.id("txtPassword")).sendKeys("bnb"); 
		driver.findElement(By.id("btnLogin")).click();
	} 

	@BeforeTest 		
	public void BeforeTest() {
		extent.attachReporter(spark);

	}

	@AfterTest
	public void AfterTest() {
		extent.flush();
		driver.quit();

	}

}
