package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class LoginTestNG {

	public static WebDriver driver;

	@BeforeClass
	public static void launch_chrome() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}
	
   @AfterClass
	public static void close_chrome()
	{ 
		driver.close();
	}
   
   @BeforeMethod
   public static void before_method() {

		System.out.println("Execute Before methood");

	}
   
   @AfterMethod
   public static void after_method() {

		System.out.println("Execute After methood");

	}

}
