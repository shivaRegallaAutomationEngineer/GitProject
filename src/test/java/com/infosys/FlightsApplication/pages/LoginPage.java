package com.infosys.FlightsApplication.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.infosys.FlightsApplication.webBase.BaseClass;

public class LoginPage extends BaseClass{

	@FindBy(name="userName")
	public WebElement username;
    @FindBy(name="password")
    public WebElement password;
    @FindBy(xpath="//input[@value='Login']")
    public WebElement loginButton;
    
   public LoginPage() {
	   PageFactory.initElements(BaseClass.getDriver(), this);
   }
   
//   public LoginPage(WebDriver driver) {
//	   super(driver);
//   }
  
  

}
