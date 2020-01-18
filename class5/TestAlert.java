package com.class5;

import org.openqa.selenium.By;

import com.util.CommonMethods;

public class TestAlert extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome", "http://jiravm.centralus.cloudapp.azure.com:8081/javascript-alert-box-demo.html");
		//driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		
		String text=getText();
		System.out.println(text);
		
		acceptAlert();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
