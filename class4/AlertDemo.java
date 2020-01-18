package com.class4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.util.CommonMethods;

public class AlertDemo extends CommonMethods {
	public static final String URL="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";	
	
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUp("chrome", URL);
		driver.findElement(By.xpath("//a[@href='#' and text()='Alerts & Modals']")).click();;
		
		driver.findElement(By.linkText("Javascript Alerts")).click();
		
		driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
		
		 
		Alert alert= driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		
		Thread.sleep(2000);
		alert.accept();
		
		String text=driver.findElement(By.xpath("//p[text()='Click the button to display and alert box:']")).getText();
		System.out.println(text);
		
	}
	
}
