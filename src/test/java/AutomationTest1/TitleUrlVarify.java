package AutomationTest1;

import com.Opencart.BaseClass;

public class TitleUrlVarify extends BaseClass {
	
	public static void main(String[] args) {

		launch_chrome();
 		open_URL("https://google.com");
		title_varification();
	

	}

	public static void title_varification() {

		String ExpectedTitle= "Facebook";
		String ActualTitle= driver.getCurrentUrl();

		if (ExpectedTitle.equals(ActualTitle)){

			System.out.println("Title Matched.Test Passed");
		}

		else {
			System.out.println("Title did  Not Match.Test Failed...!!!!");
		
		}

		//same as url varification just url likhlei hobe 	

	}



}




	