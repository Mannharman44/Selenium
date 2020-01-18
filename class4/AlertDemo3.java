package com.class4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.util.CommonMethods;

public class AlertDemo3 extends CommonMethods {
public static final String URL="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";	
	
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUp("chrome", URL);
		driver.findElement(By.xpath("//a[@href='#' and text()='Alerts & Modals']")).click();;
		
		driver.findElement(By.linkText("Javascript Alerts")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
		Thread.sleep(3000);
		
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Joe");
		Thread.sleep(2000);
		alert.accept();
		
		
		
		
	}
	
}
