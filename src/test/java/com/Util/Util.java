package com.Util;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class Util 
{
   
	
	public String Split(String Input,String Regex){
		
			String Output=Input.replace(Regex,"");
			
			String Str =Output.trim();
			System.out.println("Str--"+Str);
			return Str;
	}
	
	public int RandomNumbers() {
		
		int randomNumber = 0;
		Random objGenerator = new Random();
		for (int iCount = 0; iCount < 1; iCount++) {
			 randomNumber = objGenerator.nextInt(9000);
			System.out.println("Random No : " + randomNumber);
			

		}
		return randomNumber;
	}
	
	public void VerifyValue(String Value1,String Value2){
		
		Assert.assertEquals(Value1,Value2);
		
	}
	
	public void wait_elementClickable(String Element,WebDriver driver,int timeseconds){
		
		WebDriverWait wait = new WebDriverWait(driver, timeseconds);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Element)));
	}
	
	public void wait_elementVisible(String Element,WebDriver driver,int timeseconds){
			WebDriverWait wait = new WebDriverWait(driver,timeseconds);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Element)));
	}

}
