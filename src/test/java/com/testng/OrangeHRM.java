package com.testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

 
public class OrangeHRM {
	
	WebDriver driver;
	WebDriver element;
	
	@Test
	public  void LaunchApp() {
		
     
        WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123"); 
		driver.findElement(By.id("btnLogin")).click();
		
		
	}
	

	@Test (priority=4)
	public void NavigateToMyInfo() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewMyDetails");
		
	}
	
	

	@Test (priority=2)
	public void NavigateToMyInfo2() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/recruitment/viewCandidates");
		
	}
	
	

	@Test (priority=3)
	public void NavigateToMyInfo3() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/time/viewEmployeeTimesheet");
		
	}
	
	

	@Test (priority=1)
	public void NavigateToMyInfo4() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList");
		
	}
	
	
	
	
	/*
	
	@Test (priority=2)
	public void NavigateToMyInfo() {
		
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		
		if (driver.getPageSource().contains("Personal Details"))
		{
			System.out.println("Personal Details successful");
		}
		else {
			
			System.out.println("Personal Details Failed");
		}
		
	}
	
	
	@Test (priority=1)
	public void VarifyMyInfo() {
		
		System.out.println(driver.findElement(By.id("employee-details")).isDisplayed());
		driver.quit();
	}
	
	@Test
	public void VarifyLogin() {
		
		System.out.println(driver.findElement(By.id("welcome")).isDisplayed());
		//System.out.println(element.getTitle());
		driver.quit();
	}
	
	*/

}