package com.pomadactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass5 {
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@name = 'my_itinerary']")
    private WebElement myitinerary;

	public PomClass5(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMyitinerary() {
		return myitinerary;
	}

	
	
}
