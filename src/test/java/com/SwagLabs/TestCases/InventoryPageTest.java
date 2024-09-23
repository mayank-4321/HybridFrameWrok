package com.SwagLabs.TestCases;


import org.testng.annotations.BeforeClass;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.SwagLabs.baseTest.BaseTest;

public class InventoryPageTest extends BaseTest {
	
	@BeforeClass
	public void pageSetup()
	{
		lp.doLogin(prop.getData("un"), prop.getData("pwd"));
	}
	
	
	
  @Test(priority=1)
  public void validateProductCount() 
  {
  
  
  int count=ip.getNoOfProducts();
  Assert.assertEquals(count,6,"Product count is not matching");
  System.out.println("Product count Matched !");
  }
  
  @Test(priority=2)


  public void validateProdutDetails() 
  {
  ip.geProductDetails();
  
  
  }
  

  @Test(priority=3)


  public void validateAddtoCart() 
  {
  ip.addProductToCart(prop.getData("pname1"));
  
  
  
  }
  
  @Test(priority=4)
  
  public void gotoCartpage() {
	  ip.gotocart();
	 
  }
 
  
  
  
  
  
}
