package com.loadtesting.tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Load.Testing.pages.HomePage;

import utility.BasePage;

public class GooglePageTest extends BasePage{
	HomePage home;

	public GooglePageTest(){
		super();
	}
	

	@BeforeMethod
	public void setUp(){
    BasePage.initilization();
	home = new HomePage();

	}

	
	@Test(priority=1)
	public void traveeling_mode() throws InterruptedException{
		System.out.println(driver.getCurrentUrl());
		home.navigateTo("laptops");
     }
	
	
	@Test(priority=2)
	public void googleSearch2() throws InterruptedException{
		home.navigateTo("Autocad");
    }
	
	@Test(priority=3)
	public void googleSearch3() throws InterruptedException{
		home.navigateTo("overdrive");
    }
	
   

	@AfterMethod
	public void getResult(){
	      driver.close();

	}


}