package com.Pages;

import org.openqa.selenium.By;

import com.TestBase.Test_Base;

public class AddressPage extends Test_Base {
	
	public void click_AddressProceedcheckout() throws InterruptedException{
		//Address Tab
        driver.findElement(By.xpath("//button[@name='processAddress']")).click();
	}

}
