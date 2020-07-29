package CucumberTest;


import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookFlightSteps {
	
//	@Before
//	public void startexecuting() {
//		System.out.println("test started");
//		
//	}
//	
//	@After
//	public void endexecution() {
//		System.out.println("execution ended");
//	}
	@Given("^user is on bookflighthomepage$")
	public void user_is_on_bookflighthomepage() throws Throwable {
	    System.out.println("on homepage");
	}

	@When("^user navigates to login page$")
	public void user_navigates_to_login_page() throws Throwable {
		System.out.println("on Loginpage");
	}

	@When("^user enters the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_and(String username, String password) throws Throwable {
		System.out.println("enter user name:" +username);
		System.out.println("enter pwd:" +password);
		System.out.println( "loginsuccess:" +username);
	    
	}

	@Then("^user logged in successfully$")
	public void user_logged_in_successfully() throws Throwable {
	    System.out.println("welcomepage");
	}

	@Then("^user clicked on booked flight option$")
	public void user_clicked_on_booked_flight_option() throws Throwable {
	    System.out.println("user is on bookflightpage");
	}

	@Then("^user selected from and to places$")
	public void user_selected_from_and_to_places(List<String> place) throws Throwable {
	    System.out.println("user selected:"+place.toString());
		
	}

	@Then("^user entered passengerdetails$")
	public void user_entered_passengerdetails(List<Map<String, String>>passengerdetails) throws Throwable {
	    System.out.println("user entered the detials"+passengerdetails.toString());
	}


	@Then("^user selected flight and booked ticket$")
	public void user_selected_flight_and_booked_ticket() throws Throwable {
	   System.out.println("Booked Ticket");
	}


	

}
