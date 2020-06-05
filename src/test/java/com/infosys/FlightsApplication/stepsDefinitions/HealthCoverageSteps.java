package com.infosys.FlightsApplication.stepsDefinitions;

import com.infosys.FlightsApplication.browserFactory.BrowserFactory;
import com.infosys.FlightsApplication.pages.HealthCoveragePage;
import com.infosys.FlightsApplication.utils.CommonMethods;
import com.infosys.FlightsApplication.utils.PageInitializer;
import com.infosys.FlightsApplication.webBase.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HealthCoverageSteps extends PageInitializer  {

	@Given("^User navigative to the application$")
	public void user_navigative_to_the_application() throws Throwable {
		BrowserFactory.setUp();
	}

	@Given("^User should HomePage$")
	public void user_should_HomePage() throws Throwable {
	    
		CommonMethods.verifyTitle("Custom Care & Coverage Just For You | Kaiser Permanente");
	}

	@Given("^User click ShopPlan$")
	public void user_click_ShopPlan() throws Throwable {
	//	HealthCoveragePage hcp= new HealthCoveragePage();
		CommonMethods.clicAction(hcp.clickonShopPlan);
	}

	@Given("^User scroll down$")
	public void user_scroll_down() throws Throwable {
		//HealthCoveragePage hcp= new HealthCoveragePage();
	   CommonMethods.scrollUntilElementVisible(hcp.individualFamilyScroll);
	}

	@When("^User click on individual and family$")
	public void user_click_on_individual_and_family() throws Throwable {
		//HealthCoveragePage hcp= new HealthCoveragePage();
		CommonMethods.clicAction(hcp.individualFamilyScroll);
	}

	@When("^User click learn more$")
	public void user_click_learn_more() throws Throwable {
		//HealthCoveragePage hcp= new HealthCoveragePage();
		CommonMethods.clicAction(hcp.clicklearnmore);
	}

	@When("^User click view ours plan$")
	public void user_click_view_ours_plan() throws Throwable {
		//HealthCoveragePage hcp= new HealthCoveragePage();
		CommonMethods.waitTime(5000);
		CommonMethods.clicAction(hcp.viewYourPlans);
		CommonMethods.verifyText(hcp.comparePlan, "Compare all our health plan options to find one that fits your needs.");
	}

	@When("^User Click geta Qutoe$")
	public void user_Click_geta_Qutoe() throws Throwable {
		System.out.println("implmented new changes here");
	}

	@When("^User enter zipcode$")
	public void user_enter_zipcode() throws Throwable {
		//HealthCoveragePage hcp= new HealthCoveragePage();
		CommonMethods.sendText(hcp.enterPincode, "22201");
		CommonMethods.clickEnter(hcp.enterPincode);
		CommonMethods.waitTime(5000);
		CommonMethods.verifyDropDownValu(hcp.verifyCounty, "Arlington");
	}

	@Then("^User select country$")
	public void user_select_country() throws Throwable {
		
		//CommonMethods.switchWindow("Title of the Window");
		CommonMethods.closeBrowser();
	}
	
	

}
