package com.pom_manager;

import org.openqa.selenium.WebDriver;

import com.pomadactin.PomClass;
import com.pomadactin.PomClass6;

public class Pom_Manager {
	public static WebDriver driver;
	
	
	private PomClass pc;
	private PomClass6 pc6;
		
	


	public PomClass6 getPc6() {
		pc6 = new PomClass6(driver);
		return pc6;
	}


	public Pom_Manager(WebDriver driver2) {
		this.driver = driver2;
	}


	public PomClass getPc() {
		pc = new PomClass(driver);
		return pc;
	}




}
