Feature: Book_Flight and Book_Hotel functionality

@Book_Flight

Scenario Outline: To verify the bookFlight functionality
			Given user is on bookflighthomepage
			When user navigates to login page
			And user enters the "<username>" and "<password>"
			
			Then user logged in successfully
			And user clicked on booked flight option
			And user selected from and to places
				
			|FromPlace|ToPlace|
			|Hyd			|delhi	|
			
			And user entered passengerdetails
			|name		|name1  |name2    |
			|vamshi |Nandu  |Bharath  |
			|25    	|23	    |22       |	
			And user selected flight and booked ticket
			
			
			Examples:
			
			|username|password|
			|vamshi  |123456  |
			|nandu   |34567   |