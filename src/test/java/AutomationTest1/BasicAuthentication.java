package AutomationTest1;

import com.Opencart.BaseClass;

public class BasicAuthentication extends BaseClass{
	
	public static void main(String[] args) {
		
	launch_firefox();
	basic_auth();
	System.out.println(driver.getTitle());
	}
	
	public static void basic_auth() {
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		//https://userName:Pass@https er baki parttttt
	}

}
//Basic auth tokhonoi use kora hoy jokhon secure web site testing korte hoy tokhon 