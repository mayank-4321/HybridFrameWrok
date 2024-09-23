package com.SwagLabs.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SwagLabs.baseTest.BaseTest;

public class CartPage extends BaseTest {
	
	public CartPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Locators
	
	@FindBy(xpath="//button[text()='Remove']")
	WebElement rbtn;
	
	@FindBy(id="continue-shopping")
	WebElement cbtn;
	
	@FindBy(id="checkout")
	WebElement chbtn;
	

	//Action Methods
	
	public void doRemove() {
		
		rbtn.click();
		System.out.println("Product Removed from the Cart");
	}
	
	public InventoryPage continueShopping() {
		cbtn.click();
		return new InventoryPage(driver);
	}
	public CheckoutPage doCheckout() {
		chbtn.click();
		return new CheckoutPage();
	}
	
}
