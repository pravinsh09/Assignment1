package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.TestBase.Test_Base;
import com.Util.Util;

public class HomePage extends Test_Base {
	
	Util util = new Util();
	public String productname="Faded Short Sleeve T-shirts' and @class='product_img_link";
	
	public void click_WomenMenu() {
		
		driver.findElement(By.xpath(OR.getProperty("WomenMenuByXpath"))).click();
		
	}
	
	public void click_ProductQuickview() throws InterruptedException{
		 		
		 WebElement element =driver.findElement(By.xpath("//a[@title='"+productname+"']//parent::div//span[text()='Quick view']"));
         JavascriptExecutor executor = (JavascriptExecutor)driver; executor. executeScript("arguments[0]. click();", element);
         
		
	}
	
	public void AddQuantity_inCart() throws InterruptedException{
		
		 util.wait_elementClickable("//input[@id='quantity_wanted']", driver, 5);
		 
         driver.findElement(By.xpath("//input[@id='quantity_wanted']")).clear();
         driver.findElement(By.xpath("//input[@id='quantity_wanted']")).sendKeys("2");
         
         driver.findElement(By.xpath("//button[@name='Submit']")).click();
         
	}
	
	public void click_Proceedcheckout() throws InterruptedException{		
		 //in add cart below
         driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
	}
	
	public String Get_LeftGridTotalProducts_Price(){
		
		util.wait_elementVisible("//span[@id='layer_cart_product_price']", driver, 5);
		String LeftGridTotalProducts_Price = driver.findElement(By.xpath("//span[@id='layer_cart_product_price']")).getText();										
		String c = util.Split(LeftGridTotalProducts_Price, "$");		
		return c;
				
	}
	
	public String Get_CartTotalProducts_Price(){
		
		String CartTotalProducts_Price = driver.findElement(By.xpath("//span[@class='ajax_block_products_total']")).getText();				
		String a = util.Split(CartTotalProducts_Price, "$");
		return a;
		
		
	}
	
	public String Get_CartFinalTotalPrdsPrice(){
		String CartFinalTotalPrdsPrice = driver.findElement(By.xpath("//span[@class='ajax_block_cart_total']"))
				.getText();
		String b = util.Split(CartFinalTotalPrdsPrice, "$");
		return b;
			
	}
	
	
	
}
