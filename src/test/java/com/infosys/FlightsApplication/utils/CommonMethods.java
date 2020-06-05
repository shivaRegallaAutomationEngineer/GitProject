package com.infosys.FlightsApplication.utils;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.infosys.FlightsApplication.webBase.BaseClass;

public class CommonMethods extends BaseClass{
	
	
	
	public static WebDriverWait wait;
	public static WebElement element;
	static SoftAssert as=new SoftAssert();
	//create the reusable method for visibility
	//of element by using the explicit wait
	
	public static WebElement elementTovisible(WebElement ele) {
		 wait= new WebDriverWait(getDriver(),30);
		 element= wait.until(ExpectedConditions.visibilityOf(ele));
		return element;
	}
	
	public static WebElement elementToClickable(WebElement ele) {
		 wait= new WebDriverWait(getDriver(),30);
		 element= wait.until(ExpectedConditions.elementToBeClickable(ele));
		return element;
	}
	
	public static boolean sendText(WebElement elemen,String textValue) {
		elementTovisible(elemen);
		if(elemen==null) {
			return false;
		}else {
			elemen.sendKeys(textValue);
			return true;
		}
	}
	
	public static void clickEnter(WebElement ele) {
		ele.sendKeys(Keys.ENTER);
	}
	public static boolean clicAction(WebElement ele) {
		elementToClickable(ele);
		if(ele==null) {
			return false;
		}
		else {
			ele.click();
			return true;
		}
	}

	
	public static void verifyTitle(String expectedTitle) {
		
		String actualTitle=  getDriver().getTitle();
		System.out.println(actualTitle);
		as.assertEquals(actualTitle, expectedTitle);
	
		
//		if(actualTitle.contentEquals(expectedTitle)) {
//			System.out.println("Test case got passed");
//		}
//		else {
//			System.out.println("test case got failed");
//		}
		
		as.assertAll();
	
		
	}
	public static void acceptAlert() {
		try {
		Alert alert=getDriver().switchTo().alert();
		alert.accept();
		}
		catch(NoAlertPresentException e) {
			e.printStackTrace();
		}
	}
	
	public static void dismissAlert() {
		try {
		Alert alert=getDriver().switchTo().alert();
		alert.dismiss();
		}
		catch(NoAlertPresentException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void scrollUntilElementVisible(WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
	}
	public static void jsClick(WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].click();", ele);
	}
	public static void closeBrowser() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getDriver().close();
	}
	
	public static void waitTime(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void verifyText(WebElement ele,String expectedText) {
		
		String actualText=  ele.getText();
		System.out.println(actualText);
		as.assertEquals(actualText, expectedText);
	   as.assertAll();
	
		
	}
	
	
	public static void verifyDropDownValu(List<WebElement> ele,String value) {
		
		
	
	for(WebElement va:ele) {
		String text=    va.getText();
		System.out.println(text);
		as.assertEquals(text, value);
		as.assertAll();
		
	}
		
		
		
	}
	
	public static void switchWindow(String Expectedtitle) {
	Set<String> multipleWindows=	getDriver().getWindowHandles();
	Iterator<String> it=  multipleWindows.iterator();
	while(it.hasNext()) {
		String popWindow=  it.next();
		getDriver().switchTo().window(popWindow);
		String actualTitle=getDriver().getTitle();
		if(actualTitle.contentEquals(Expectedtitle)) {
			getDriver().switchTo().window(popWindow);
		}
		
		
	}
	
	}
	
	public static void switchToFrame(String nameOrID) {
		try {
		getDriver().switchTo().frame(nameOrID);
		}
		catch(NoSuchFrameException e) {
			e.printStackTrace();
		}
	}
	public static void switchToFrame(int index) {
		try {
		getDriver().switchTo().frame(index);
		}
		catch(NoSuchFrameException e) {
			e.printStackTrace();
		}
	}
	
	public static void switchToFrame(WebElement ele) {
		try {
		getDriver().switchTo().frame(ele);
		}
		catch(NoSuchFrameException e) {
			e.printStackTrace();
		}
	}
  
}
