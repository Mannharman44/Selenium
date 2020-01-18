package com.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.util.CommonMethods;

public class task extends CommonMethods{
	
	public static void main(String args[]) throws InterruptedException {
		
		setUp("chrome", "http://google.com");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Wegmans",Keys.ENTER);
		driver.findElement(By.cssSelector("h3[class='sA5rQ']")).click();
		
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
	
		
		
		
		Thread.sleep(2000);
		driver.close();
		
	}
	

}
