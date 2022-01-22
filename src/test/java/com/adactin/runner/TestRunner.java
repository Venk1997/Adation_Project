package com.adactin.runner;


import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adation.BaseEx2;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature//Adactin.feature" ,
glue = "com\\adactin\\stepdefinition",
tags = ("@LoginTest"),
monochrome = true,
 dryRun = false)
 //strict = true)

public class TestRunner {
	public static WebDriver driver;
	 
	@BeforeClass
	public static void getBrowser() {
		driver = BaseEx2.getBrowser();

	}

}
