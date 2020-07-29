package CucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {
	
	public static WebDriver driver;

//	@Before("@Login")
//	public void startexecuting() {
//		System.out.println("test started");
//		
//	}
//	
//	@After
//	public void endexecution() {
//		System.out.println("execution ended");
//	}

@Given("^user is on homepage$")
public void user_is_on_homepage() throws Throwable {
	 System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
	  String browser="Firefox"; 
	  if(browser.equalsIgnoreCase("Firefox")) {
	  driver = new FirefoxDriver();  
	  }else if(browser.equalsIgnoreCase("chrome")){
	  driver= new ChromeDriver();  
	  }else if (browser.equalsIgnoreCase("ie")){
	  driver= new InternetExplorerDriver();
		  
	  }
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("http://in.rediff.com/");
	  driver.findElement(By.xpath("//a[@class=\'moneyicon relative\']")).click();
	
    
}
@When("^user navigates to loginpage$")
public void user_navigates_to_loginpage() throws Throwable {
	
	driver.findElement(By.xpath("//span[@id=\'signin_info\']/a[1]")).click();
}

//@Given("^User enters username And password$")
//public void user_enters_username_And_password() throws Throwable {
//	
//	driver.findElement(By.id("useremail")).sendKeys("vamshi.gsr@gmail.com");
//	driver.findElement(By.id("userpass")).sendKeys("S100286");
//	driver.findElement(By.id("loginsubmit")).click();
//}

@When("^User enters \"([^\"]*)\" And \"([^\"]*)\"$")
public void user_enters_And(String username, String password) throws Throwable {
	driver.findElement(By.id("useremail")).sendKeys(username);
	driver.findElement(By.id("userpass")).sendKeys(password);
	driver.findElement(By.id("loginsubmit")).click();
    
}
@And("^user click on signout button$")
public void user_click_on_signout_button() throws Throwable {
	driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div[1]/div[2]/span[2]/a")).click();
	
}
@Then("^Message displayed logout successfully$")
public void Message_displayed_logout_successfully() throws Throwable {
	
	System.out.println("Logout success");
   
}

@And("^close the browser$")
public void close_the_browser() throws Throwable {
	driver.close();
	
}

}
