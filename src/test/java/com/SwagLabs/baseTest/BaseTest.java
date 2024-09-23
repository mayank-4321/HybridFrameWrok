package com.SwagLabs.baseTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.SwagLabs.Pages.CartPage;
import com.SwagLabs.Pages.CheckoutPage;
import com.SwagLabs.Pages.InventoryPage;
import com.SwagLabs.Pages.LoginPage;
import com.SwagLabs.Pages.OverviewPage;
import com.SwagLabs.Utility.PropertiesReader;

public class BaseTest 
{
	
	public static WebDriver driver;
	public LoginPage lp;
	public InventoryPage ip;
	public CartPage cp;
	public CheckoutPage ch;
	public PropertiesReader prop;
	public OverviewPage op;
	@BeforeTest
	public void setUp() {
		prop=new PropertiesReader();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getData("url"));
		lp=new LoginPage(driver);
		ip=new InventoryPage(driver);
		cp=new CartPage();
		ch=new CheckoutPage();
		op=new OverviewPage();
		
	}
		public void addWait() {
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
	
	}

