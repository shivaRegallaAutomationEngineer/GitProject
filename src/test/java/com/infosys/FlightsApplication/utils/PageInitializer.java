package com.infosys.FlightsApplication.utils;

import com.infosys.FlightsApplication.browserFactory.BrowserFactory;
import com.infosys.FlightsApplication.pages.HealthCoveragePage;
import com.infosys.FlightsApplication.pages.LoginPage;
import com.infosys.FlightsApplication.webBase.BaseClass;

public class PageInitializer extends BaseClass {
	
	public static LoginPage login1;
	public static HealthCoveragePage hcp;

	public static void initialize() {
		
		login1=new LoginPage();
		hcp=   new HealthCoveragePage();
	}

}
