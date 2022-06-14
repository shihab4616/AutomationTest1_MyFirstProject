package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTestNG {

	public static WebDriver driver;

	//Before and After method use korle browser alada alada vabe login korbe 
	//Amra jehetu Before and After class use korechi tai ekoi browser e login dui bar hobe 

	@BeforeClass
	public static void launch_chrome() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Before Clss Execute");

	}

	@AfterClass
	public static void close_chrome()
	{ 
		driver.close();
		System.out.println("After Clss Execute");
	}

	@BeforeTest
	private static void beforeTest() {

		System.out.println("Before Test Execute");	
	}

	@AfterTest
	private static void AfterTest() {

		System.out.println("After Test Execute");	
	}

	@BeforeMethod
	private static void beforeMethod() {

		System.out.println("Before Method Execute");	
	}

	@AfterMethod
	private static void AfterMethod() {

		System.out.println("After Method Execute");	
	}

	@Test
	public static void Valid_TestCase() {

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123"); 
		driver.findElement(By.id("btnLogin")).click();

	}

	@Test
	public static void inValid_TestCase() {

		driver.findElement(By.id("txtUsername")).sendKeys("assssss");
		driver.findElement(By.id("txtPassword")).sendKeys("wwwwww"); 
		driver.findElement(By.id("btnLogin")).click();

	}

}
