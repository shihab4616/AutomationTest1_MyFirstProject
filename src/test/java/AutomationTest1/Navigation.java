package AutomationTest1;

import com.Opencart.BaseClass;

public class Navigation extends BaseClass {
	
	
	public static void main(String[] args) {
		
		launch_firefox();
		open_URL("https://google.com");
		navigate_to("https://demo.guru99.com/V4/");
		navigate_back();
		System.out.println(driver.getTitle()); //Google Title
		navigate_forword();
		System.out.println(driver.getTitle()); //Guru99 Bank Home Page
	}
	
	public static void navigate_to(String Url) { 
		
		driver.navigate().to(Url);
		
	}
	
	
public static void navigate_back() { 
		
		driver.navigate().back();
		
	}

public static void navigate_forword() { 
	
	driver.navigate().forward();
	
}


public static void navigate_refresh(String Url) { 
	
	driver.navigate().refresh();
	
}

}
