package com.class4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.util.CommonMethods;

public class Task extends CommonMethods{

public static final String URL="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";	
public static void main(String[] args) throws InterruptedException {
	
	CommonMethods.setUp("chrome", URL);
	driver.findElement(By.xpath("//a[@href='#' and text()='Alerts & Modals']")).click();;
	
	driver.findElement(By.linkText("Javascript Alerts")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
	Alert alert=driver.switchTo().alert();
	Thread.sleep(3000);
	String text=alert.getText();
	System.out.println(text);

	alert.accept();
	
	driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
	Alert alert1=driver.switchTo().alert();
	Thread.sleep(3000);
	String text1=alert.getText();
	System.out.println(text1);
	
	alert1.accept();
	
	driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
	Alert alert2=driver.switchTo().alert();
	Thread.sleep(3000);
	alert2.sendKeys("Joe");
	alert2.accept();
	
	
	
	
	
}
}
