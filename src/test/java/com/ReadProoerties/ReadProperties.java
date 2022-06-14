package com.ReadProoerties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.Opencart.BaseClass;

public class ReadProperties extends BaseClass {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream("./ src/PropertiesFiles/config.properties");
		
		Properties prop= new Properties();
		prop.load(fis);
		
		System.out.println(prop.getProperty("valid_Email"));
		
	}

}
