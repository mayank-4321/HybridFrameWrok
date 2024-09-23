package com.SwagLabs.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
	
	WebDriver driver;
	public InventoryPage(WebDriver driver) 
	{
	
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}

	//locators
	
	@FindBy(xpath="//div[@class='inventory_item_name ']")
	List<WebElement>allProducts;
	
	@FindBy(id="add-to-cart")
	WebElement addtocartBtn;
	
	@FindBy(xpath="//div//a[@class='shopping_cart_link']")
	WebElement cartBtn;
	
	
	//Actions
	
	public int getNoOfProducts() {
	return	allProducts.size();
	}
	
	public void  geProductDetails() {
		
		for(WebElement i:allProducts) {
			i.getText() ;
				
			
			
		}
		
	}
	
	public void addProductToCart(String pr) {
		
		for(WebElement i:allProducts) {
			if(i.getText().contains(pr)) {
				i.click();
				break;
			}
			
		}
		addtocartBtn.click();
		System.out.println("Product added to cart:"+pr);
	}
	
	
	
	public CartPage gotocart() {
		cartBtn.click();
		return new CartPage();
	}
	
}
