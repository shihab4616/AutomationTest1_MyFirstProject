package AutomationTest1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Opencart.BaseClass;

public class Screenshot extends BaseClass{
	
	public static void main(String[] args) throws IOException   {
			
		launch_chrome();
		open_URL("https://demo.opencart.com");
		getVisiblePartScreenshots();

	}
public static void getVisiblePartScreenshots() throws IOException {
		
		//Screenshot capture
		File screenshotFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//save Screenshot
		FileUtils.copyFile(screenshotFile, new File("./src/ScreenshotImages/visibleImage.jpeg"),true);
		
	}
	
}