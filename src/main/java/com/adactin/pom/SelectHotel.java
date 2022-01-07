package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	
	
	public static WebDriver driver ;
	
	@FindBy(id ="radiobutton_0")
	
	private WebElement radiobutton;
	
	@FindBy(id="continue")
	
	private WebElement conti;

	public SelectHotel(WebDriver driver2) {
		this.driver =driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getConti() {
		return conti;
	}
	
	
	

}
