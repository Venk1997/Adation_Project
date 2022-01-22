package com.pomadactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass3 {
	public PomClass3(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver,this);
	}

	public WebElement getClick() {
		return click;
	}

	public WebElement getContinuebutton() {
		return continuebutton;
	}

	public static WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement click;

	@FindBy(id = "continue")
	private WebElement continuebutton;
}
