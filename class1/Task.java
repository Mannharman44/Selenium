package com.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://amazon.com");
	String title=driver.getTitle();
	System.out.println(title);
	//driver.close();
	
}
}
