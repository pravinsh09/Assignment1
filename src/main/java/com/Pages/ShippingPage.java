package com.Pages;

import org.openqa.selenium.By;

import com.TestBase.Test_Base;

public class ShippingPage extends Test_Base {

	
	public void click_ShippingProceedcheckout() {
		
		driver.findElement(By.xpath("//div[@id='uniform-cgv']//input")).click();
		driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
	}
}
