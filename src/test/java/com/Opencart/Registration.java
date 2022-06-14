package com.Opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Registration extends BaseClass {
	
	
	public static void main(String[] args) {
		launch_chrome();
		open_URL("https://demo.opencart.com");
		TC_Registration_001();
		//open_URL("https://demo.opencart.com/index.php?route=account/register");
	}
	
	
	public static void TC_Registration_001() {
		
		
		WebElement MyAccount= driver.findElement(By.linkText("My Account"));
		MyAccount.click();
		
		WebElement Register= driver.findElement(By.linkText("Register"));
		Register.click();
		
		WebElement FirstName= driver.findElement(By.id("input-firstname"));
		FirstName.clear();
		FirstName.sendKeys("Shihab");
		
		WebElement LastName= driver.findElement(By.id("input-lastname"));
		LastName.clear();
		LastName.sendKeys("Ahmed");
		
		WebElement Email= driver.findElement(By.id("input-email"));
		Email.clear();
		Email.sendKeys(TestEmail);
		

		WebElement Password= driver.findElement(By.id("input-password"));
		Password.clear();
		Password.sendKeys("1234567890");
		
		
		WebElement checkbox= driver.findElement(By.name("agree"));
		checkbox.click();
		
		
		WebElement Continue= driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
		Continue.click();
		
		WebElement LogOut= driver.findElement(By.linkText("Logout"));
		LogOut.click();
	}

}
