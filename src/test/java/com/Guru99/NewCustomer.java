package com.Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Opencart.BaseClass;

public class NewCustomer extends BaseClass {

	public static void main(String[] args) {
		
		launch_chrome();
		open_URL("https://demo.guru99.com/V4/manager/addcustomerpage.php");
		deposit_amount();
		
	}
	
public static void deposit_amount() {
		
		WebElement UserID= driver.findElement(By.name("uid"));
		UserID.clear();
		UserID.sendKeys("mngr399944");
		
		WebElement Password= driver.findElement(By.name("password"));
		Password.clear();
		Password.sendKeys("bUnuhEs");
		
		WebElement LogIn= driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		LogIn.click();
		
		
		WebElement NewCustomer= driver.findElement(By.linkText("New Customer"));
		NewCustomer.click();
		
		WebElement CustomerName= driver.findElement(By.name("name"));
		CustomerName.clear();
		CustomerName.sendKeys("John");
		
		WebElement Gender= driver.findElement(By.name("rad1"));
		Gender.click();
		
		WebElement dob=driver.findElement(By.id("dob"));
		dob.click();
	    // 18 | type | id=dob | 2023-04-18
	   dob.sendKeys("18-08-2012");
		
		
		
		
   }
}
