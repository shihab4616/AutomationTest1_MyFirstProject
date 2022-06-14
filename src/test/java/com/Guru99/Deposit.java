package com.Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Opencart.BaseClass;

public class Deposit extends BaseClass {
	
	public static void main(String[] args) {
		launch_chrome();
		open_URL("https://demo.guru99.com/V4/manager/DepositInput.php");
		deposit_amount();
		
	}
	
	public static void deposit_amount() {
		
		WebElement UserID= driver.findElement(By.name("uid"));
		UserID.clear();
		UserID.sendKeys("mngr395113");
		
		WebElement Password= driver.findElement(By.name("password"));
		Password.clear();
		Password.sendKeys("epUpEpY");
		
		WebElement LogIn= driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		LogIn.click();
		
	
		WebElement Deposit= driver.findElement(By.linkText("Deposit"));
		Deposit.click();
		
		WebElement AccountNo= driver.findElement(By.name("accountno"));
		AccountNo.clear();
		AccountNo.sendKeys("1234567890");
		
		WebElement Amount= driver.findElement(By. name("ammount"));
		Amount.clear();
		Amount.sendKeys("120000");
		
		WebElement Description= driver.findElement(By.name("desc"));
		Description.clear();
		Description.sendKeys("i Am shihab ahmed");
		
		
		WebElement Submit= driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input[1]"));
		Submit.click();
	}
}
