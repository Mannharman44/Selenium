package com.class8;


import org.openqa.selenium.By;

import com.util.CommonMethods;
import com.util.Constants;

public class Task1 extends CommonMethods{
public static void main(String[] args) {
	
	setUp("chrome", Constants.HRMS_URL);
	
	driver.findElement(By.xpath("//div[@class='textInputContainer']/input")).sendKeys("Admin");
	driver.findElement(By.xpath("//span[text()='Password']/preceding-sibling::input")).sendKeys("Hum@nhrm123");
	driver.findElement(By.xpath("//div[@id='divLoginButton']/input")).click();
	
	
	
	
	
}
}
