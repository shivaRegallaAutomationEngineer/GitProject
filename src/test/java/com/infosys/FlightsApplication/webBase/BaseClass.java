package com.infosys.FlightsApplication.webBase;

import org.openqa.selenium.WebDriver;

public class BaseClass {

	public static WebDriver driver=null;
//	public  BaseClass(WebDriver driver){
//	BaseClass.driver = driver;
//	
//}
	public static WebDriver getDriver() {
		if(driver==null) {
			return driver;
		}
		else {
		return driver;
		}
	}
	
	public static void setDriver(WebDriver driver) {
		BaseClass.driver=driver;
	}
	
	
	
}
