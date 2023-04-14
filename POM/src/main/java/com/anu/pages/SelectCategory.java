package com.anu.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectCategory 
{
	WebDriver driver;
	public SelectCategory(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void navigateToCategory(String input) 
	{
		List<WebElement> inputCategories = driver.findElements(By.xpath("//li[@class='list-group-item']//a"));
		for(WebElement category : inputCategories)
		{
			if(category.getText().equals(input))
			{
				category.click();
				break;
			}
		}
	}

}
