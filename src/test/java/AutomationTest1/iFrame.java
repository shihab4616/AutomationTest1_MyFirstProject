package AutomationTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Opencart.BaseClass;

public class iFrame extends BaseClass {
	
	public static void main(String[] args)  {
		
		launch_chrome();
		open_URL("https://the-internet.herokuapp.com/iframe");
		iFrame_test();
 	}
	
	public static void iFrame_test()  {
		
		driver.switchTo().frame("mce_0_ifr");
		WebElement frameBody= driver.findElement(By.id("tinymce"));
		frameBody.clear();
		frameBody.sendKeys("For Test iframe pppppp");
		//Thread.sleep(3000); //eita add dile kaj kore naa next time dekhte hobe problem kiii...?
		
	}

}
