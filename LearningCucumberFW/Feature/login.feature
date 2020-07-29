Feature: Test the login_logout functionality of rediff mail
  
	@Login
  Scenario Outline: Login_Logout Functionality with valid credentials
    Given user is on homepage
    When user navigates to loginpage
    And User enters "<username>" And "<password>"
    And user click on signout button
    Then Message displayed logout successfully
    And close the browser
    
    Examples:
    
     
    |       username		 			|     password    |
    |vamshi.gsr@gmail.com			|     S100286     |
    |nandini.merugu6@gmail.com|     S100286     |
    
   