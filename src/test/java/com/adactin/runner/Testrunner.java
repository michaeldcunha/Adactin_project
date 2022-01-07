package com.adactin.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.Baseclass.Base;
import com.adactin.helper.File_Reader_Manager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;





@RunWith(Cucumber.class)

@CucumberOptions(features = "src//test//java//com//acactin//Feature//Adactin.feature",
glue = "com\\adactin\\stepdefinition" , 
dryRun = false,// without running it will check if every feature file has a method false will launch browser, true will run just the code

monochrome = true,// remove unnecessary options in console

plugin = {"pretty","html:Report\\CucumberReport","json:Report\\Cucumber.json"}// pretty will give you output clear
		
		)









public class Testrunner {
	
	public static WebDriver driver;
	

	

	
	@BeforeClass
	
	public static void Set_up() throws Throwable {
		
		String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();
		

		
         driver = Base.getDriver(browser);
	}

}
