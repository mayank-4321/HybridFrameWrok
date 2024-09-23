package com.SwagLabs.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SwagLabs.baseTest.BaseTest;

public class OverviewPage extends BaseTest {

	

	public OverviewPage() {
		
		PageFactory.initElements(driver,this);
		
	}
	
	//Locators
	
	@FindBy(id="finish")
	WebElement Finish;
	
	@FindBy(id="cancel")
	WebElement Cancel;
	
	@FindBy(xpath="//button[text()='Open Menu']")
	WebElement Menu;
	
	@FindBy(xpath="//div//a[@class='bm-item menu-item']")
	List<WebElement> menuItem;
	
	@FindBy(id="checkout_summary_container")
	WebElement orderDetail;
	
	@FindBy(tagName="h2")
	WebElement text;
	
	
	
	//Actions Methods
	
	public void orderDetails() {
		String odr=orderDetail.getText();
		System.out.println("**************Order Summary is : ******** "+odr);
	}
	
	public void doFinish() {
		
		Finish.click();
//		System.out.println("Final order status:"+text.getText());
	}
	
	public void docancel() {
		Cancel.click();
	}

	public void listMenu() {
		Menu.click();
		System.out.println("No. of Menu are:"+menuItem.size());
		System.out.println("Following are the Menu Available");
		for(WebElement i:menuItem) {
				
				System.out.println(i.getText());
			
			
		}}
	public InventoryPage selectMenu() {
		
		for(WebElement j:menuItem) {
			if(j.getText().contains("All items")) {
				j.click();
				break;
			}
		}
		return new InventoryPage(driver);
		
	}
	
	
	
	
	
}
