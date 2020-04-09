package com.Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.TestBase.Test_Base;
import com.Util.Util;

public class OrderHistoryPages extends Test_Base {
	Util util = new Util();

	public String Get_ProductPrice() {

		String HistoryOrderprice = driver.findElement(By.xpath("//td[@class='history_price']//span")).getText();
		System.out.println("HistoryOrderprice--" + HistoryOrderprice);
		String Histprice = util.Split(HistoryOrderprice, "$");
		return Histprice;
		
	}

}
