package com.class4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.util.CommonMethods;

public class AlertDemo2 extends CommonMethods{
public static final String URL="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";	
	
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUp("chrome", URL);
		driver.findElement(By.xpath("//a[@href='#' and text()='Alerts & Modals']")).click();;
		
		driver.findElement(By.linkText("Javascript Alerts")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
		Thread.sleep(3000);
		 
		Alert alert=driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(alert.getText());
		
		alert.dismiss();
		
		
		driver.close();
		
		
	
	
	}
}
