package com.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChromeBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		Thread.sleep(1000);
		driver.navigate().to("https://espn.com"); 
		driver.navigate().back();
		driver.navigate().forward();
		
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		//driver.close();
		
	}
}
