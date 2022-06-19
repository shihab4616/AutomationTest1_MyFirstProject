package com.ExtentReports;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent_Basic {
	 
	//Create ExtentReports and attached report
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");

	@Test 
	public void Extent_TC_001() {
		//For author name test name and browser name detail's
		ExtentTest test1= extent.createTest("This Extent For TC_001").assignAuthor("Shihab").
         assignCategory("Functional Test").assignDevice("Google chrome");
		
		test1.info("This is for Web browser Launch");
		test1.log(Status.PASS,"Web browser successfully launch");
		
	}
	
	@Test 
	public void Extent_TC_002() {
		//For author name test name and browser name detail's
		ExtentTest test2= extent.createTest("Login User ID And Password").assignAuthor("Mamun").
        assignCategory("Smoke Test").assignDevice("Safari Browser");
		
		test2.log(Status.FAIL, "You are fail log in");
		test2.info("This LogIn Failure test case");
		
	}
	
	@Test 
	public void Extent_TC_003() {
		//For author name test name and browser name detail's
		ExtentTest test3= extent.createTest("For skipping test case").assignAuthor("Nittyan").
        assignCategory("Sanity Test").assignDevice("FireFox Browser");
		
		test3.skip("Skip This Test case");
		test3.warning("Please open other browser");
			 
	}	  
	
	@Test 
	public  void Extent_TC_004() {
		//For author name test naem and browser name detail's
		ExtentTest test= extent.createTest("Varify LogOut").assignAuthor("Asmin Khan")
				.assignCategory("Regression Test").assignDevice("Opera");
		test.pass("LogOut is succussful");

	}

@BeforeTest
public void beforeTest() {
	
	extent.attachReporter(spark);
	
}	

@AfterTest
public void afterTest() {
 extent.flush();
	
}

}
