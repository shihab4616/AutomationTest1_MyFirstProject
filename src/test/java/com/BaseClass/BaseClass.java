package com.BaseClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BaseClass {

	public static  WebDriver driver;
	public static String TestEmail= "testemail132093w@gmail.com";


	public static void main(String[] args) {
		launch_chrome();
		//launch_firefox();
		//launch_opera();
		//close_chrome();
		//close_firefox();


	}

	public static void launch_chrome() {


		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		//width: 1050 Height: 708


	}

	public static void launch_firefox() {


		System.setProperty("webdriver.gecko.driver", "c://geckodriver.exe");
		driver = new  FirefoxDriver();
		driver.get("https://www.google.com");


	}

	public static void launch_opera() {

		System.setProperty("webdriver.opera.driver", "c://operadriver.exe");
		driver = new OperaDriver();
		driver.get("https://www.youtube.com");


	}

	public static void close_chrome() { driver.close();}

	public static void close_firefox() { driver.close();}
	
	
	public static void open_URL(String URL) 
	{ 
		driver.get(URL);		
	}	
	



}
