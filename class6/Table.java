package com.class6;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.util.CommonMethods;
import com.util.Constants;

public class Table extends CommonMethods {
public static void main(String[] args) {
	
	setUp("chrome", Constants.SYNTAX_URL);
	driver.findElement(By.linkText("Table")).click();
	driver.findElement(By.linkText("Table Data Search")).click();
	List<WebElement> row=driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
	System.out.println("Number of rows: "+row.size());
	for(WebElement rows:row) {
		String rowText=rows.getText();
		System.out.println(rowText);
		
	
		
	}
	
	
	
	
	List<WebElement>col=driver.findElements(By.xpath("//table[@class='table']/thead/tr/th"));
	System.out.println("number of col: "+col.size());
	Iterator<WebElement>it=col.iterator();
	while(it.hasNext()) {
		String colText=it.next().getText();
		System.out.println(colText);
		
	}
	
	List<WebElement>cells=driver.findElements(By.xpath("//table[@class='table']/thead/tr/td"));
	for(WebElement cell: cells) {
		String text=cell.getText();
		System.out.println(text);
		
	}
	
	
	
	
	
	
	
}
}
