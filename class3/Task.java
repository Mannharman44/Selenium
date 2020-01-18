package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.util.CommonMethods;

public class Task extends CommonMethods {
	public static final String URL="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	
public static void main(String[] args) throws InterruptedException {
	CommonMethods.setUp("chrome",URL);
	driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
	
	driver.findElement(By.linkText("Radio Buttons Demo")).click();	
	
	Thread.sleep(3000);
	
//	WebDriverWait wait = new WebDriverWait(driver,10);
//	
//	wait.until(ExpectedConditions.)
	
	
	
	WebElement maleButton=driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[1]/div[2]/label[1]/input"));
	maleButton.click();
	
	boolean isThere=maleButton.isSelected();
	System.out.println(isThere);
	Thread.sleep(3000);
	//driver.close();
	
}
}
