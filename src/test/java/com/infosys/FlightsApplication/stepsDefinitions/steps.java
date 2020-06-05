package com.infosys.FlightsApplication.stepsDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.infosys.FlightsApplication.browserFactory.BrowserFactory;
import com.infosys.FlightsApplication.pages.LoginPage;
import com.infosys.FlightsApplication.utils.CommonMethods;
import com.infosys.FlightsApplication.utils.PageInitializer;
import com.infosys.FlightsApplication.webBase.BaseClass;


import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class steps extends PageInitializer{
	 
	

	@Given("^User navigates to the login pages$")
	public void user_navigates_to_the_login_pages() throws Throwable {
		BrowserFactory.setUp();
	     	}
	@When("^User enter the valid userName \"([^\"]*)\"$")
	public void user_enter_the_valid_userName(String userName) throws Throwable {
		//LoginPage lp= new LoginPage();
	    CommonMethods.sendText(login1.username, userName);
	}

	@When("^User enter the valid passowrd \"([^\"]*)\"$")
	public void user_enter_the_valid_passowrd(String password) throws Throwable {
		//LoginPage lp= new LoginPage();
	   // CommonMethods.sendText(lp.password, password);
	}

	@When("^USer clicked on the login button$")
	public void user_clicked_on_the_login_button() throws Throwable {
		//LoginPage lp= new LoginPage();
	  //  CommonMethods.clicAction(lp.loginButton);
	}

	@Then("^User should be able to login into the application$")
	public void user_should_be_able_to_login_into_the_application() throws Throwable {
       CommonMethods.verifyTitle("Find a Flight: Mercury Tours");
       CommonMethods.switchToFrame(1);
       CommonMethods.closeBrowser();
       
}
}