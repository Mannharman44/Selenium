package com.class4;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.util.CommonMethods;

public class DropDownDemo extends CommonMethods {
public static final String URL="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";	
	
public static void main(String[] args) throws InterruptedException {
	
	CommonMethods.setUp("chrome", URL);
	driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Select Dropdown List")).click();
	WebElement weekDropDown=driver.findElement(By.id("select-demo"));
	
	Select sel=new Select(weekDropDown);
	sel.selectByIndex(4);
	Thread.sleep(2000);
	sel.selectByVisibleText("Monday");
	Thread.sleep(2000);
	sel.selectByValue("Sunday");
	Thread.sleep(2000);
	List<WebElement>obj= sel.getOptions();
	System.out.println("The size is :"+obj.size());
	
	Iterator<WebElement>it=obj.iterator();
	while(it.hasNext()) {
		it.next().click();
		Thread.sleep(2000);
	}
	
	System.out.println(sel.isMultiple());
	
	
	
	
}
}
