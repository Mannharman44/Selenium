package com.class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.util.CommonMethods;

public class Task2 extends CommonMethods {
public static void main(String[] args) throws InterruptedException {
	
	setUp("chrome", "http://facebook.com");
	WebElement drop=driver.findElement(By.id("month"));
	Select sel=new Select(drop);
	sel.selectByVisibleText("Mar");
	
	
	WebElement day=driver.findElement(By.id("day"));
	Select sel1=new Select(day);
	sel1.selectByIndex(20);
	Thread.sleep(3000);
	
	
	WebElement year=driver.findElement(By.id("year"));
	Select sel2=new Select(year);
	sel.selectByVisibleText("2000");
}
}
