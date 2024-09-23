package com.SwagLabs.TestCases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.SwagLabs.baseTest.BaseTest;

public class CheckoutPageTest extends BaseTest {
	
	
	@BeforeTest
	public void pageSetup() {
		lp.doLogin(prop.getData("un"), prop.getData("pwd"));
		ip.addProductToCart(prop.getData("pname1"));
		ip.gotocart();
		cp.doCheckout();
	}
	
	
	
  @Test
  public void validateDetails() {
	  
	  ch.doContinue(prop.getData("fn"), prop.getData("ln"), prop.getData("zc"));
	  
  }
}
