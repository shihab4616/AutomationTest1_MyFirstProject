package AutomationTest1;

import com.BaseClass.AutomaticBaseClass;

public class DynamicBrowser extends AutomaticBaseClass {
	
	public static void main(String[] args) {
		launch_browser("edge");
		open_Url("https://google.com");
		browser_close("edge");
	}
}
