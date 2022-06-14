//amra jodi mvn repostory web site theke webdrivermanager er dependency copy kore pomxml e dei tahole web driver update deyar jhamela thakbe na so eita khub easy 

package com.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomaticBaseClass {
	public static WebDriver driver;
	

	public static void main(String[] args) {

		

	}

	public static void launch_browser(String browserName) {

		if (browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			driver.get("https://google.com");
		}
		
		else if (browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromiumdriver().setup();
			driver=new ChromeDriver(); 
			driver.manage().window().maximize();
		}
		
		else if (browserName.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver(); 
			driver.manage().window().maximize();
		}
		
		else
		{
			System.out.println("Please enter valid browser");
		}
		
	}
	
	  public static void browser_close(String browserName) {
		  driver.close();
		
	}
		
		public static void open_Url(String Url){
			driver.get(Url);
		}
		
		
	}
