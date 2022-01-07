package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelpage {
	
	public static WebDriver driver;
	
	
	
	@FindBy(id="first_name")
	
	private WebElement firstname;
	
	@FindBy(id="last_name")
	
	private WebElement lastname;
	
	@FindBy(id="address")
	

	private WebElement Address;

	public BookHotelpage(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return Address;
	}
	
	@FindBy(id="cc_num")
	
	private WebElement Creditcard;
	
	@FindBy(id="cc_type")
	
	private WebElement credittype;
	
	@FindBy(id="cc_exp_month")
	
	private WebElement Expirymonth;
	
	@FindBy(id="cc_exp_year")
	
	private WebElement Expiryyear;
	
	@FindBy(id="cc_cvv")
	
	private WebElement CVV;
	
	@FindBy(id="book_now")
	
	private WebElement booknow;
	
	@FindBy(id="logout")
	
	private WebElement logout;
	
	
	@FindBy(xpath ="//*[@id=\"booking_form\"]/table/tbody/tr[1]/td")
	
	private WebElement confirmation;

	public WebElement getConfirmation() {
		return confirmation;
	}

	public WebElement getLogout() {
		return logout;
	}

	
	public WebElement getCreditcard() {
		return Creditcard;
	}

	public WebElement getCredittype() {
		return credittype;
	}

	public WebElement getExpirymonth() {
		return Expirymonth;
	}

	public WebElement getExpiryyear() {
		return Expiryyear;
	}

	public WebElement getCVV() {
		return CVV;
	}

	public WebElement getBooknow() {
		return booknow;
	}
	
	

}
