package com.Pages;

import org.openqa.selenium.By;

import com.TestBase.Test_Base;

public class PaymentPage extends Test_Base {
	
	public void click_PayByCheck() {
		
		driver.findElement(By.xpath("//a[@title='Pay by check.']//span")).click();
	}
	
	public void click_ConfirmMyOrder() {

		driver.findElement(By.xpath("//span[text()='I confirm my order']//parent::button")).click();
	}
	
	public void click_BacktoOrder() {
		driver.findElement(By.xpath("//a[@title='Back to orders']//i")).click();
	}
}
