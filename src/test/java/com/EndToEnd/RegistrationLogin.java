package com.EndToEnd;

import com.Opencart.BaseClass;
import com.Opencart.LoginTest;
import com.Opencart.Registration;

public class RegistrationLogin extends  BaseClass {
	
	public static void main(String[] args) {
		
		launch_chrome();
		open_URL("https://demo.opencart.com");
		Registration.TC_Registration_001();
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/login");
		LoginTest.TC_Login_001();
	}

}
