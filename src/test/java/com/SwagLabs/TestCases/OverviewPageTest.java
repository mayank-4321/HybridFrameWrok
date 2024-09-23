package com.SwagLabs.TestCases;


import org.testng.annotations.Test;





import org.testng.annotations.*;


import com.SwagLabs.baseTest.BaseTest;

public class OverviewPageTest extends BaseTest {
	
	
	@BeforeMethod
	public void pageSetup() {
		
		lp.doLogin(prop.getData("un"),prop.getData("pwd"));
		ip.addProductToCart(prop.getData("pname1"));
		cp=ip.gotocart();
		cp.doCheckout();
		ch.doContinue(prop.getData("fn"), prop.getData("ln"), prop.getData("zc"));
		
	}
	
		
 

  @Test(priority=1)
  public void validateFinish() 
  {
	  op.doFinish();
  }
  
  
  
  
}
