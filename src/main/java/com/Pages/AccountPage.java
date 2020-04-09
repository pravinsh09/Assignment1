package com.Pages;

import org.openqa.selenium.By;

import com.TestBase.Test_Base;
import com.Util.Util;

public class AccountPage extends Test_Base {

	Util util = new Util();

	public void clickSign_menu() {
		
		util.wait_elementClickable("//a[@title='Log in to your customer account']", driver, 10);
		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
	}

	public void accountCreate() throws InterruptedException {
		
		util.wait_elementClickable("//input[@name='email_create']", driver, 10);
		
		String Email = "testtg" + util.RandomNumbers() + "@test.com";
		driver.findElement(By.xpath("//input[@name='email_create']")).sendKeys(Email);

		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
	}

	public void submit_Personalinfo() throws InterruptedException {
		
        
        util.wait_elementClickable("//input[@id='id_gender1']", driver, 5);
        
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Dummyfirstname");
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Dummylastname");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Useraddress");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("UserCity");
		driver.findElement(By.xpath("//select[@name='id_state']")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("10021");
		driver.findElement(By.xpath("//input[@name='phone_mobile']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@name='alias']")).sendKeys("Address_refrence");

		driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
	}
	
	

}
