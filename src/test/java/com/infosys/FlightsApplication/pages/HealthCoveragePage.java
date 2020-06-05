package com.infosys.FlightsApplication.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.infosys.FlightsApplication.webBase.BaseClass;

public class HealthCoveragePage {

	
	@FindBy(xpath="//a[text()='Shop Plans']")
	public WebElement clickonShopPlan;
	@FindBy(xpath="//div[text()='Individuals and families']")
	public WebElement individualFamilyScroll;
	
	@FindBy(xpath="(//div[@id='individual-and-family-plans']//button[contains(text(),'Learn more')])[2]")
	public WebElement clicklearnmore;
	@FindBy(xpath="//a[@data-analytics-click='View our plans']")
	public WebElement viewYourPlans;
	@FindBy(xpath="//p[text()='Compare all our health plan options to find one that fits your needs.']")
	public WebElement comparePlan;
	@FindBy(xpath="//input[@id='viewPlansDate2Zip']")
	public WebElement enterPincode;
	@FindBy(xpath="//select[@id='getPlanCountyView']//option")
	public List<WebElement> verifyCounty;
	
	
	public HealthCoveragePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
}
