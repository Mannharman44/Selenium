package com.class3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.util.CommonMethods;

public class RadioButtonDemo extends CommonMethods {
	public static final String SYNTAX_PRACTICE_URL="http://166.62.36.207/syntaxpractice/index.html" ;
public static void main(String[] args) throws InterruptedException {
	
	CommonMethods.setUp("chrome",SYNTAX_PRACTICE_URL);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Input Forms']/following::a[3]")).click();
	WebElement maleRadio=driver.findElement(By.xpath("//input[@name='optradio'and @value='Male']"));
	System.out.println(maleRadio.isSelected());
	maleRadio.click();
	System.out.println(maleRadio.isSelected());
	
	List<WebElement> radioButtons=driver.findElements(By.name("optradio"));
	
	for(int i=0;i<radioButtons.size();i++) {
		boolean isSelected=radioButtons.get(i).isSelected();
		if(!isSelected) {
			radioButtons.get(i).click();
			System.out.println(isSelected);
			Thread.sleep(1000);
		}
	}
	
	driver.close();
	
	
	
	
	
}
}
