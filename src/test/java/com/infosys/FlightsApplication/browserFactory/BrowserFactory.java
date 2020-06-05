package com.infosys.FlightsApplication.browserFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.infosys.FlightsApplication.utils.ConfigReader;
import com.infosys.FlightsApplication.utils.Constants;
import com.infosys.FlightsApplication.utils.PageInitializer;
import com.infosys.FlightsApplication.webBase.BaseClass;

public class BrowserFactory extends BaseClass{

	



	public static WebDriver setUp() {
		ConfigReader.readProperties(Constants.CONFIG_FILEPATH);
		 driver=BaseClass.getDriver();
	
		 
		 if(ConfigReader.getKeyValue("browserName").equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
		      driver= new ChromeDriver();
		 }
		 else if(ConfigReader.getKeyValue("browserName").equalsIgnoreCase("firefox")) {
			 System.setProperty("webdriver.firefox.driver", Constants.FIREFOX_DRIVER_PATH);
		      driver= new FirefoxDriver();;
		 }
		 else if(ConfigReader.getKeyValue("browserName").equalsIgnoreCase("ie")) {
			 System.setProperty("webdriver.ie.driver", Constants.IE_DRIVER_PATH);
		      driver= new InternetExplorerDriver();
		 }
		 else {
			 System.out.println("invalid browser Selected");
		 }
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		 driver.get(ConfigReader.getKeyValue("URL"));
		 PageInitializer.initialize();
		 return driver;
		
	}

}
