package com.class5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.util.CommonMethods;

public class PageLoadandImplicitWait extends CommonMethods{
public static void main(String[] args) {
	
	setUp("chrome", "http://google.com");
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.name("wrongName")).sendKeys("iPhone");
	
	
	
	driver.quit();
	
	
}
}
