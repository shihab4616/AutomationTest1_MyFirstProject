package AutomationTest1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSize extends Browser {
	
	public static void main(String[] args) 
	{
		//launch_chrome();
		launch_firefox();
		ipad();
		
		//get_Browser_Maximize_size();
		
	}	
	
	
    public static void get_Browser_Maximize_size() {
    	
		int width = driver.manage().window().getSize().width; 
		int height = driver.manage().window().getSize().height; 
        System.out.println("width: "+width+ " Height: "+height);

	}
    
    public static void ipad() {
    	
    	driver.manage().window().setSize(new Dimension(768, 600));
    	int width= driver.manage().window().getSize().getWidth();
    	int height=  driver.manage().window().getSize().getHeight();
    	System.out.println("ipad Width:" +width + "ipad height: "+ height);
		
	}

}
