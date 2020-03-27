package com.Load.Testing.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.BasePage;
import utility.TestUtil;

public class HomePage extends BasePage {

	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}

	@FindBy(name ="q")
	public WebElement googleSearch;
    
	
	
	public void navigateTo(String search_content){
		
		googleSearch.sendKeys(search_content);
		googleSearch.sendKeys(Keys.RETURN);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
	}
	
}
