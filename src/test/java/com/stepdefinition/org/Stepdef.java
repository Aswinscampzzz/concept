package com.stepdefinition.org;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef {
    WebDriver driver;
	
	@Given("^User is on Homepage$")
	public void user_is_on_Homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	          driver=new ChromeDriver(); 
	        System.setProperty("webdriver.chrome.driver", null);
	        driver.get("https://www.facebook.com/");
	          
	}

	@When("^User nagivate to Loginpage$")
	public void user_nagivate_to_Loginpage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	        driver.findElement(By.name("e"));
	}

	@When("^User enters Credentials to login$")
	public void user_enters_Credentials_to_login(CharSequence[] search) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		  driver.findElement(By.name("q")).sendKeys(search);
	}

	@Then("^Message displayed Login Sucessfully$")
	public void message_displayed_Login_Sucessfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(null);
	}



}
