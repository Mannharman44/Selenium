package com.class6;


import org.openqa.selenium.By;

import com.util.CommonMethods;
import com.util.Constants;

public class Task extends CommonMethods {

	public static void main(String[] args) {
	
	
		setUp("chrome", Constants.HRMS_URL);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
		
		
		
		
	}

}
