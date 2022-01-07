package com.pom.manager;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookHotelpage;
import com.adactin.pom.Loginpage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;

public class PageObjectManager {
	
	public static WebDriver driver;
	
	private Loginpage lp;
	
	private SearchHotel sh;
	
	private SelectHotel sp;
	
	private BookHotelpage bp;

	
	
	
	public BookHotelpage getBp() {
		
		bp = new BookHotelpage(driver);
		return bp;
	}






	public SelectHotel getSp() {
		
		sp = new SelectHotel(driver);
		return sp;
	}



	public static WebDriver getDriver() {
		return driver;
	}


	public PageObjectManager(WebDriver driver2) {

	this.driver = driver2;
	}

	
	public Loginpage getLp() {
		
		lp = new Loginpage(driver);
		
		return lp;
	}
    
	public SearchHotel getSh() {
		
		sh =new SearchHotel(driver);
		
		return sh;
	}
	

	}
	
	
	
	
	
	
	

	

