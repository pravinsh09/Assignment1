package com.Pages;

import org.openqa.selenium.By;

import com.TestBase.Test_Base;
import com.Util.Util;

public class SummaryPage extends Test_Base {
	
	
	Util util = new Util();
	
	public void click_SummaryProceedcheckout() throws InterruptedException{
		
		util.wait_elementClickable("//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']", driver, 5);
		driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']")).click();
	}
	
	public String Get_SummaryTotalProducts() {
		
		util.wait_elementVisible("//td[@id='total_product']", driver, 5);
		String SummaryTotalProducts = driver.findElement(By.xpath("//td[@id='total_product']")).getText();		
		String tp = util.Split(SummaryTotalProducts, "$");		
		return tp;

	}

	public String Get_SummaryTotalwithoutTax_Price() {

		String SummaryTotalwithoutTax_Price = driver.findElement(By.xpath(" //td[@id='total_price_without_tax']"))
				.getText();
		String tw = util.Split(SummaryTotalwithoutTax_Price, "$");
		return tw;

	}

	public String Get_SummaryAllTotalProducts_Price() {
		
		String SummaryAllTotalProducts_Price = driver.findElement(By.xpath("//span[@id='total_price']")).getText();
		String At = util.Split(SummaryAllTotalProducts_Price, "$");
		return At;

	}
	
	

}
