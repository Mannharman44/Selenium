package com.class4;

import org.openqa.selenium.By;

import com.util.CommonMethods;

public class Task2 extends CommonMethods{
public static final String URL="https://www.amazon.com/";
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", URL);
		driver.findElement(By.xpath("//a[@tabindex='48']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@alt='Funko Pop! Star Wars: The Mandalorian - The Child']")).click();
		Thread.sleep(2000);
		
		
		driver.close();
	}
	
	
	
}
