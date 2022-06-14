package com.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Before_AfterMethods {


	@BeforeTest
	private static void browserConfig() {

		System.out.println("Successfully browser config");	
	}

	@AfterTest
	private static void CloseTest() {

		System.out.println("Browser Closed");	
	}
	
	@BeforeMethod
	private static void OpenTestURL() {

		System.out.println("Browser Launched");	
	}
	
	@AfterMethod
	private static void Varification() {

		System.out.println("Varification Done");	
	}


	@Test
	private static void TestCase_001() {

		System.out.println("Test case 1 Executed");	
	}

	@Test
	private static void TestCase_002() {

		System.out.println("Test case 2 Executed");	
	}

}
