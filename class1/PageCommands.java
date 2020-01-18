package com.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageCommands {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.google.com");
	
	final String exTitle="Google";
	String actualTitle=driver.getTitle();
	
	if(exTitle.equals(actualTitle)) {
		System.out.println("I am on the right page");
	}else {
		System.err.println("Mismatch");
	}
	
	
	
	
	driver.close();
	
	
	
}
}
