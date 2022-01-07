package com.adactin.stepdefinition;

import java.io.IOException;

import com.adactin.Baseclass.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;


public class Hooks extends Base {
	
	@Before
	public void beforeHooks(Scenario scenario) {
		
		
		String name = scenario.getName();
		
		System.out.println("Scenario Title :" + name);
		

	}
	
	@After 
	
	public void afterHooks(Scenario scenario) throws Throwable {
		
		Status status = scenario.getStatus();
		
		System.out.println("Scenario status:"+status);
		
		
		if (scenario.isFailed()) {
			
			screenshot("C:\\Users\\dcunh\\eclipse\\java-2021-06\\eclipse\\Adactin_cucumber\\Screenshot\\Image.png");
		}
	}

}
