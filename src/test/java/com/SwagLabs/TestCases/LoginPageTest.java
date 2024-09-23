package com.SwagLabs.TestCases;

import org.testng.annotations.Test;

import org.testng.Assert;


import com.SwagLabs.baseTest.BaseTest;

public class LoginPageTest extends BaseTest {
  @Test
  public void validateLogin() 
  {
	  lp.doLogin(prop.getData("un"), prop.getData("pwd"));
	  Assert.assertTrue(driver.getTitle().contains("Labs"),"Login fail....");
	  System.out.println("Login Successfull !!!");
	  
  
  
  }
}
