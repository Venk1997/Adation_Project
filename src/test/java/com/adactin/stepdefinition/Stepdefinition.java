package com.adactin.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.runner.TestRunner;
import com.adation.BaseEx2;
import com.pom_manager.Pom_Manager;
import com.pomadactin.PomClass;
import com.pomadactin.PomClass2;
import com.pomadactin.PomClass3;
import com.pomadactin.PomClass4;
import com.pomadactin.PomClass5;
import com.pomadactin.PomClass6;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;






public class Stepdefinition extends BaseEx2 {
	public static WebDriver driver = TestRunner.driver;
	//PomClass pom1 = new PomClass(driver);
	Pom_Manager pm = new Pom_Manager(driver);
	PomClass2 pom2 = new PomClass2(driver);
	PomClass3 pom3 = new PomClass3(driver);
	PomClass4 pom4 = new PomClass4(driver);
	PomClass5 pom5 = new PomClass5(driver);
	//PomClass6 pom6 = new PomClass6(driver);
	
	
	
	
	@Given("^user launch the application and navigate to login page$")
	public void user_launch_the_application_and_navigate_to_login_page()   {
		get("https://adactinhotelapp.com/");
	     
	     
	}

	@When("^user enters the valid username \"([^\"]*)\" in the username field$")
	public void user_enters_the_valid_username_in_the_username_field(String username) throws Throwable {
	   sendkey(pm.getPc().getUsername(), username);
	    
	}

	@When("^user enters the valid password \"([^\"]*)\" in the password field$")
	public void user_enters_the_valid_password_in_the_password_field(String password) throws Throwable {
		sendkey(pm.getPc().getPassword(), password);
	  
	}

	@When("^user is able to click the login button$")
	public void user_is_able_to_click_the_login_button()   {
		click(pm.getPc().getLogin());
	      
	     
	}

	@Then("^Verify that  user goes to homepage and lands on to search hotel$")
	public void verify_that_user_goes_to_homepage_and_lands_on_to_search_hotel()   {
	     
	     
	}

	@When("^user able to selects the location$")
	public void user_able_to_selects_the_location()   {
		dropdown(pom2.getLocation(),"2");
	
		
	     
	     
	}

	@When("^user able to selects the hotel$")
	public void user_able_to_selects_the_hotel()   {
	     dropdown(pom2.getHotels(), "3");
	     
	}

	@When("^user able to selects the room type$")
	public void user_able_to_selects_the_room_type()   {
		dropdown(pom2.getRoomtype(), "3");
	     
	     
	}

	@When("^user able to selects the no of room required$")
	public void user_able_to_selects_the_no_of_room_required()   {
		dropdown(pom2.getRoomnos(), "4");
	     
	     
	}

	@When("^user enters the check in date$")
	public void user_enters_the_check_in_date()   {
		clear(pom2.getDatepick(), "12/1/2022");
		//sendkey(pom2.getDatepick(), "12/1/2022");
	
	     
	     
	}

	@When("^user enters the check out date$")
	public void user_enters_the_check_out_date()   {
		clear(pom2.getDateout(), "14/1/2022");
	     
	     
	}

	@When("^user able to selects the adults per room$")
	public void user_able_to_selects_the_adults_per_room()   {
		dropdown(pom2.getAdultroom(),"2");
	     
	     
	}

	@When("^user able to selects the children per room$")
	public void user_able_to_selects_the_children_per_room()   {
		dropdown(pom2.getChildroom(), "1");
	     
	     
	}

	@When("^user able to click the search button$")
	public void user_able_to_click_the_search_button()   {
		click(pom2.getSubmit());
	     
	     
	}

	@Then("^user verify the search hotel page navigate to select hotel page$")
	public void user_verify_the_search_hotel_page_navigate_to_select_hotel_page()   {
	     
	     
	}

	@When("^user select the hotel$")
	public void user_select_the_hotel()   {
		click(pom3.getClick());
	     
	     
	}

	@When("^verify user able to click continue button$")
	public void verify_user_able_to_click_continue_button()   {
		click(pom3.getContinuebutton());
	     
	     
	}

	@Then("^user verify  select hotel page navigate to book a hotel page$")
	public void user_verify_select_hotel_page_navigate_to_book_a_hotel_page()   {
	     
	     
	}

	@When("^user verify the hotel name$")
	public void user_verify_the_hotel_name()   {
	String actual = "Hotel Hervey";
	//System.out.println(actual);
	  WebElement findElement = driver.findElement(By.id("hotel_name_dis"));
	 String expected =  findElement.getAttribute("value");
	// System.out.println(expected);
	if (actual.equalsIgnoreCase(expected)) {
		System.out.println("user verify the hotel");
		
	}else {
		System.out.println("user not verify the hotel");
	}
	     
	     
	}

	@When("^user verify the location$")
	public void user_verify_the_location()   {
	     
	     
	}

	@When("^user verify the room type$")
	public void user_verify_the_room_type()   {
	     
	     
	}

	@When("^user verify the no of rooms$")
	public void user_verify_the_no_of_rooms()   {
	     
	     
	}

	@When("^user verify the total days$")
	public void user_verify_the_total_days()   {
	     
	     
	}

	@When("^user verify the price per night$")
	public void user_verify_the_price_per_night()   {
	     
	     
	}

	@When("^user verify the total price$")
	public void user_verify_the_total_price()   {
	     
	     
	}

	@When("^user verify the GST$")
	public void user_verify_the_GST()   {
	     
	     
	}

	@When("^user verify the final billed price$")
	public void user_verify_the_final_billed_price()   {
	     
	     
	}

	@When("^user enters firstname in firstname field$")
	public void user_enters_firstname_in_firstname_field()   {
		sendkey(pom4.getFirstname(), "venkatesan");
	     
	     
	}

	@When("^user enters lastname in lastname field$")
	public void user_enters_lastname_in_lastname_field()   {
		sendkey(pom4.getLastname(), "kumar");
	     
	     
	}

	@When("^user enters billing adress in adress field$")
	public void user_enters_billing_adress_in_adress_field()   {
		sendkey(pom4.getAdress(), "4/kannandahalli");
	     
	     
	}

	@When("^user enters valid credit card no in credit card field$")
	public void user_enters_valid_credit_card_no_in_credit_card_field()   {
		sendkey(pom4.getCard(), "1234567891234567");
		
	     
	     
	}

	@When("^user selects credit card type$")
	public void user_selects_credit_card_type()   {
		dropdown(pom4.getCardtype(), "2");
	     
	     
	}

	@When("^user selects expiry month$")
	public void user_selects_expiry_month()   {
		dropdown(pom4.getExpmonth(),"6");
	     
	     
	}

	@When("^user selects expiry year$")
	public void user_selects_expiry_year()   {
		dropdown(pom4.getExpyear(), "9");
	     
	     
	}

	@When("^user enters valid cvv number in cvv number field$")
	public void user_enters_valid_cvv_number_in_cvv_number_field()   {
		sendkey(pom4.getCvv(), "234");
	     
	     
	}

	@When("^verify user able to click book now button$")
	public void verify_user_able_to_click_book_now_button()   {
		click(pom4.getBooknow());
	     
	     
	}

	@Then("^user verify book a hotel page navigate to booking confirmation page$")
	public void user_verify_book_a_hotel_page_navigate_to_booking_confirmation_page()   {
	     
	     
	}

	@When("^user verify the arrival date$")
	public void user_verify_the_arrival_date()   {
	     
	     
	}

	@When("^user verify the departure date$")
	public void user_verify_the_departure_date()   {
	     
	     
	}

	@When("^user verify the total room$")
	public void user_verify_the_total_room()   {
	     
	     
	}

	@When("^user verify the adults per room$")
	public void user_verify_the_adults_per_room()   {
	     
	     
	}

	@When("^user verify the children per room$")
	public void user_verify_the_children_per_room()   {
	     
	     
	}

	@When("^user verify the firstname$")
	public void user_verify_the_firstname()   {
	     
	     
	}

	@When("^user verify the lastname$")
	public void user_verify_the_lastname()   {
	     
	     
	}

	@When("^user verify the billing adress$")
	public void user_verify_the_billing_adress()   {
		wait(3000);
	     
	     
	}

	@When("^verify user able to click my ltinerary button$")
	public void verify_user_able_to_click_my_ltinerary_button()   {
		click(pom5.getMyitinerary());
	     
	     
	}

	@Then("^user verify booking confirmation page navigate to booked ltinerary page$")
	public void user_verify_booking_confirmation_page_navigate_to_booked_ltinerary_page()   {
	     
	     
	}

	@When("^verify user has booked hotel$")
	public void verify_user_has_booked_hotel()   {
		wait(3000);
	     
	     
	}

	@When("^verify user able to click logout button$")
	public void verify_user_able_to_click_logout_button()   {
	      click(pm.getPc6().getLogout());
	     
	}

	@Then("^verify user successfully logout of the application$")
	public void verify_user_successfully_logout_of_the_application()   {
	   
	     
	}





}
