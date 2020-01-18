package com.class2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
	
	driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("VanEarl");
	
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("VanEarl@&12");
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	WebElement logo=driver.findElement(By.xpath("//img[@src='/humanresources/symfony/web/webres_5acde3dbd3adc6.90334155/themes/default/images/syntax.png']"));
	System.out.println(logo.isDisplayed());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
