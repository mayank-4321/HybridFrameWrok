package com.SwagLabs.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SwagLabs.baseTest.BaseTest;

public class CheckoutPage extends BaseTest {
	
	
	
	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}

	
	//Locators
	@FindBy(id="first-name")
	WebElement Fname;
	
	@FindBy(id="last-name")
	WebElement Lname;
	
	@FindBy(id="postal-code")
	WebElement Zpcode;
	
	@FindBy(id="cancel")
	WebElement Cncl;
	
	@FindBy(id="continue")
	WebElement Cnt;
	
	//Action Methods
	
	
	
	public void doCancel() {
		Cncl.click();
	}
	
	public OverviewPage doContinue(String fn,String ln,String zc) {
		Fname.sendKeys(fn);
		Lname.sendKeys(ln);
		Zpcode.sendKeys(zc);
		
		Cnt.click();
		return new OverviewPage();
	}
	
	
	
	
}
