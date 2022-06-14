 package AutomationTest1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import com.Opencart.BaseClass;

import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

public class ReadProperties extends BaseClass{
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fis=new FileInputStream("./src/PropertiesFiles/config.properties");
		Properties prop= new Properties();
		prop.load(fis);
		 
		System.out.println(prop.getProperty("Valid_Email"));
		System.out.println(prop.getProperty("Valid_pass"));

	}

}
