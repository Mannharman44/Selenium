package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class task {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://facebook.com");
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("hello");
	driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("12345");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@value='Log In']")).click();
	
	System.out.println(driver.findElement(By.xpath("//*[@role='alert']")).getText());
	
}
}
