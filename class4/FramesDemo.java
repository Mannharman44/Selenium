package com.class4;

import org.openqa.selenium.By;

import com.util.CommonMethods;

public class FramesDemo extends CommonMethods {
public static final String URL="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";	
	
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUp("chrome", URL);
		driver.findElement(By.linkText("Others")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Iframe")).click();
		Thread.sleep(2000);
		
		String mainText=driver.findElement(By.xpath("//h2[text()='IFrame practice']")).getText();
		System.out.println(mainText);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		
		String insideText=driver.findElement(By.xpath("//h4[text()='Practice Selenium Automation Testing Online']")).getText();
		System.out.println(insideText);
		Thread.sleep(2000);
		
		
		
		
	}
}
