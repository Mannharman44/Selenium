package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsDemo1 {
	
	public static final String URL="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get(URL);
	
	WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
	username.sendKeys("Admin");
	
	username.clear();
	username.sendKeys("Joe");
	
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("helan@123");
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	
}
}
