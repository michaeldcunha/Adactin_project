package com.adactin.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.adactin.Baseclass.Base;
import com.adactin.helper.File_Reader_Manager;
import com.adactin.pom.BookHotelpage;
import com.adactin.pom.Loginpage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;
import com.adactin.runner.Testrunner;
import com.pom.manager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;





public class Stepdefinition extends Base {
	
	public static WebDriver driver= Testrunner.driver;
	
	//Loginpage lp =new Loginpage(driver);
	
	//SearchHotel sh = new SearchHotel(driver);
	
	//SelectHotel sp = new SelectHotel(driver);
	
	//BookHotelpage bp = new BookHotelpage(driver);

	
	PageObjectManager pom = new PageObjectManager(driver);

    @Given("^User is already on login page$")
	public void user_is_already_on_login_page() throws Throwable    {
    	
    	String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		
		
		getUrl(url);
	      
	}

	@When("^Title of login page is Adactin\\.com - Hotel Reservation System$")
	public void title_of_login_page_is_Adactin_com_Hotel_Reservation_System()    {
		
		
		String title = driver.getTitle();
		
	   if (title.contains("Adactin.com")) {
		   
		   System.out.println("The user is on the Login page");
	   }
	   else {
		   
		   System.out.println("User is on incorrect url");
	   }
	      
	      
	}

	@Then("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		
	  inputValueElement(pom.getLp().getUsername(),username );
	  
	  inputValueElement(pom.getLp().getPassword(), password);
		
		
		
		
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()    {
		
		clickOnElement(pom.getLp().getLogin());
	      
	}

	@Then("^User is on home page$")
	public void user_is_on_home_page()    {
	      
		String title2 = driver.getTitle();
		
		if (title2.contains("Adactin.com")) {
			
			System.out.println("User is on the home page");
		}
	      
	}
	

@When("User  selects the hotel  location, hotel name and room type")
public void user_selects_the_hotel_location_hotel_name_and_room_type() {
	
	selection(pom.getSh().getLocation(), "byvalue", "Sydney");
	selection(pom.getSh().getHotel(),"byvalue", "Hotel Sunshine");
	
	selection(pom.getSh().getRoom(), "byvalue", "Standard");
     
      
}

@Then(": User selcts the number of rooms and other informtion")
public void user_selcts_the_number_of_rooms_and_other_informtion() {
	
	
	selection(pom.getSh().getNumberroom(),"byvalue", "4");
	selection(pom.getSh().getAdult(), "byvalue", "3");
	
	selection(pom.getSh().getChild(), "byvalue", "2");
	


      
}

@Then(":User clicks on search button")
public void user_clicks_on_search_button() {
	
	clickOnElement(pom.getSh().getSearch());
     
      
}

@When("User selects the Price and Type of Room")
public void user_selects_the_price_and_type_of_room() {
	
	clickOnElement(pom.getSp().getRadiobutton());
     
      
}

@When("User clicks on Continue button")
public void user_clicks_on_continue_button() {
	
	clickOnElement(pom.getSp().getConti());
     
      
}

@When("User Enters his first name , Last name and Address")
public void user_enters_his_first_name_last_name_and_address() {
	
	inputValueElement(pom.getBp().getFirstname(), "Michael");
	
	inputValueElement(pom.getBp().getLastname(), "Dcunha");
	
	inputValueElement(pom.getBp().getAddress(), "NO:123, nethaji street, Thiruvallur-600124");
	
     
      
}

@Then("User Enters Credit Card information")
public void user_enters_credit_card_information() {
	
	inputValueElement(pom.getBp().getCreditcard(), "1234567887654321");
	
	selection(pom.getBp().getCredittype(), "byvalue", "AMEX");
	
	selection(pom.getBp().getExpirymonth(), "byvalue", "2");
	
	selection(pom.getBp().getExpiryyear(), "byvalue", "2013");
	
	inputValueElement(pom.getBp().getCVV(), "12345678");
     
      
}

@Then("User selects Click now button")
public void user_selects_click_now_button() {
     
	clickOnElement(pom.getBp().getBooknow());
      
}

@When("User takes a screenshot")
public void user_takes_a_screenshot() throws Throwable {
	
	implicit();
	
	pageDown(pom.getBp().getConfirmation());
     
	screenshot("C:\\Users\\dcunh\\eclipse\\java-2021-06\\eclipse\\Adactin_cucumber\\Screenshot\\Image.png");
      
}

@Then("User Logs out of the application")
public void user_logs_out_of_the_application() {
	
	
	
	implicit();
	
    clickOnElement(pom.getBp().getLogout());
     
	
      
}

@Then("User quits the browser")
public void user_quits_the_browser() {
	
	driver.quit();
     
      
}
	

}
