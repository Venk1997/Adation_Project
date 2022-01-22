package com.adation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class BaseEx2 {
	
	public static WebDriver driver; 
	
	public static WebDriver getBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+("\\Driver\\chromedriver.exe"));
		driver= new ChromeDriver();
		return driver;
		

	}
	public static WebDriver get(String url) {
		driver.get(url);
		return driver;
		
	}
  public static void sendkey(WebElement findElement,String input) {
	findElement.sendKeys(input);
	

}
  public static void click(WebElement findElement) {
	  findElement.click();
	  
	  }
  public static void close() {
	  try {
		driver.close();
	} catch (Exception e) {
		
		e.printStackTrace();
	}

}
  public static void dropdown(WebElement findElement,String element) {
	  Select s = new Select(findElement);
	  int parseInt = Integer.parseInt(element);
	  s.selectByIndex(parseInt);
	}
  public static void screenshot() throws IOException {
	  TakesScreenshot shot = (TakesScreenshot) driver;
	  File from = shot.getScreenshotAs(OutputType.FILE);
	  File to = new File("C:\\Users\\GH\\eclipse-workspace\\Selenium Program\\photos\\name.png");
	  FileUtils.copyFile(from, to);
	  

}
  public static void maxi () {
	driver.manage().window().maximize();

}
 public static void quit() {
	driver.quit();

} 
 public static void clear(WebElement findElement,String value) {
	 findElement.clear();
	 findElement.sendKeys(value);

}
 public static void alert() {
	 Alert click = driver.switchTo().alert();
	 click.accept();
	 }
 public static void getTitle() {
	 String title = driver.getTitle();
	 System.out.println(title);
	

}
 public static void getCurrenturl() {
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);

}
 public static void getAttribute(WebElement findElement) {
	 String attribute = findElement.getAttribute("value");
	 System.out.println(attribute);

}
 public static void wait(int time) {
	driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
 public static void getText(WebElement findElement) {
	 String text = findElement.getText();
	 System.out.println(text);
	 }
 public static void submit(WebElement findElement) {
	 findElement.submit();
}
 public static void navigateTo(String url) {
	 driver.navigate().to(url);
	 }
 
 public static void navigateBack() {
	driver.navigate().back();

}
 public static void navigateForward() {
	driver.navigate().forward();

}
 public static void navigateRefresh() {
	driver.navigate().refresh();
 }
 public static void mouseAction(WebElement findElement) {
	Actions action = new Actions(driver);
	action.moveToElement(findElement).build().perform();

}
 public static void mouseActionClick(WebElement findElement) {
	Actions action = new Actions(driver);
	action.moveToElement(findElement).click().build().perform();
 }

  
	

}



















