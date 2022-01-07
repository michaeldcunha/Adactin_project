package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {

	



	public static WebDriver driver;
	
	@FindBy(id="location")
	
	private WebElement location;
	
	
	@FindBy(id="hotels")
	
	private WebElement Hotel;
	
	@FindBy(id="room_type")
	
	private WebElement room;
	
	@FindBy(id="room_nos")
	
	private WebElement numberroom;
	
	
	@FindBy(id="Submit")
	
	private WebElement Search;
	
	
	public SearchHotel(WebDriver driver2) {
		
		this.driver =driver2;
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="adult_room")
	
	private WebElement Adult;
	
	

	public WebElement getAdult() {
		return Adult;
	}


	public WebElement getChild() {
		return child;
	}


	@FindBy (id="child_room")
	
	private WebElement child;


	public WebElement getLocation() {
		return location;
	}


	public WebElement getHotel() {
		return Hotel;
	}


	public WebElement getRoom() {
		return room;
	}


	public WebElement getNumberroom() {
		return numberroom;
	}


	public WebElement getSearch() {
		return Search;
	}
	
	
	
	
}
