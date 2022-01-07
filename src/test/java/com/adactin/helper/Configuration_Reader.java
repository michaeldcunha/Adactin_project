 package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class Configuration_Reader {
	
	public static Properties p;
	public Configuration_Reader() throws IOException {
		
		File f =new File("C:\\Users\\dcunh\\eclipse\\java-2021-06\\eclipse\\Adactin_cucumber\\src\\test\\java\\com\\adactin\\properties\\configuration.properties");
         
		FileInputStream fis = new FileInputStream(f);
		
		 p = new Properties();
		p.load(fis);
	
	}
	
	
	public String getBrowser() {
		
		String browser = p.getProperty("browser");
		
		return browser;
  
		
	}
	
	public String getUrl() {
		
		String Url = p.getProperty("url");
		
		return(Url);

	}

}
