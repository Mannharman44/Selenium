package com.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonMethods {
public static WebDriver driver;
	/**
	 * use this method in need of opening browser and target url
	 * @param browser the desired browser
	 * @param url the desired url
	 */
	public static void setUp(String browser,String url) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
		}else {
			System.out.println("Browser not supported");
		}
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	public static void acceptAlert() {
		try {
			
			Alert a=driver.switchTo().alert();
			
			a.accept();
		}catch(NoAlertPresentException e) {
			System.out.println("Alert is not present");
		}
		
	}
	
	public static void dismissAlert() {
		
		try {
			Alert alert=driver.switchTo().alert();
			alert.dismiss();
			
		}catch(NoAlertPresentException e) {
			System.out.println("Alert is not present");
		}
	}
	
	public static String getText() {
		String text=null;
		try {
			Alert alert=driver.switchTo().alert();
			text=alert.getText();
			
		
		}catch(NoAlertPresentException e) {
			System.out.println("Alert is not present");
				
		}
		return text;
		
	}
	
	
	public static void switchToFrame(String nameOrId) {
		
		try {
			driver.switchTo().frame(nameOrId);
		}catch(NoSuchFrameException e) {
			System.out.println("Frame is not present");
		}
	}
	
	public static void switchToFrame(WebElement element) {
		
		try {
			driver.switchTo().frame(element);
		}catch(NoSuchFrameException e) {
			System.out.println("Frame is not present");
		}
		
		
	}
	
	public static void switchToFrame(int index) {
		try {
			driver.switchTo().frame(index);
		}catch(NoSuchFrameException e) {
			System.out.println("Frame is not present");
		}
		
	}
		
	public static void jsClick(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].click()", element);
		
	}
	
	public static void scrollIntoElement(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].scroolIntoView(true)", element);
		
	}
	
	public static void scrollDown(int pixel) {
		JavascriptException js=(JavascriptException)driver;
		//js.executeScript("window.scrollBt(0,"+pixel+")" );
		
		
		
	}
}
