package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.util.CommonMethods;

public class Task3 extends CommonMethods{

public static final String URL="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";	
	
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUp("chrome", URL);
	
		driver.findElement(By.linkText("Input Forms")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Select Dropdown List")).click();
		WebElement wDD=driver.findElement(By.id("select-demo"));
		
		Select sel=new Select(wDD);
		sel.selectByIndex(3);
		Thread.sleep(2000);
		sel.selectByVisibleText("Monday");
		Thread.sleep(2000);
		sel.selectByValue("Friday");
		Thread.sleep(4000);
		
		driver.close();
		
		
		
		
		
		
	}
}
