package com.pomadactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass6 {
	public static WebDriver driver;
	
	@FindBy(id = "logout")
	private WebElement logout;

	public PomClass6(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver,this);
	}

	public WebElement getLogout() {
		return logout;
	}
	

}
