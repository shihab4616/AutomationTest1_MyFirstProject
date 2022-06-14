package com.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Browser2 {

	public static WebDriver driver;

	public static void main(String[] args) {

		//chrome_launch();
		//chrome_close();
		firefox_launch();
		//firefox_close();

	}

	public static void chrome_launch() {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	    
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

	}

	public static void firefox_launch() {

		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		driver = new  FirefoxDriver();
		driver.get("https://www.google.com");	
	}
	
	public static void opera_launch() {

		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
		driver = new  OperaDriver();
		driver.get("https://www.google.com");	
	}
	

	public static void chrome_close() {
		driver.close();

	}

	public static void firefox_close() {
		driver.close();

	}
	
	public static void open_URL(String URL) 
	{ 
		driver.get(URL);		
	}


}
