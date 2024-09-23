package com.SwagLabs.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	//Locators
	@FindBy(id="user-name")
	WebElement usrname;
	
	@FindBy(id="password")
	WebElement pswrd;
	
	@FindBy(id="login-button")
	WebElement btn;
	
	
	//Actions Method
	
	public void doLogin(String un,String pwd) {
		usrname.sendKeys(un);
		pswrd.sendKeys(pwd);
		btn.click();
	}
	
	
	

}
