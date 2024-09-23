package com.SwagLabs.TestCases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.SwagLabs.baseTest.BaseTest;

public class CartPageTest extends BaseTest {
	
	@BeforeTest
	public void pageSetup() {
		lp.doLogin(prop.getData("un"), prop.getData("pwd"));
		ip.addProductToCart(prop.getData("pname1"));
		ip.gotocart();
		
		
	}
	@Test(priority=1)
	public void validateRemove() {
		cp.doRemove();
	}
	@Test(priority=2)
	public void validateCntShopping() {
		ip=cp.continueShopping();
		addWait();
		ip.addProductToCart(prop.getData("pname2"));
		addWait();
		ip.gotocart();
		addWait();
	
	}
	@Test(priority=3)
		public void validateCheckout() {
			cp.doCheckout();
			addWait();
		}
  
  }
