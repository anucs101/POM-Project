package com.anu.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.PageUtility;

public class DynamicTablePage
{
	WebDriver driver;
	public DynamicTablePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By table = By.xpath("//table[@id='dtBasicExample']");
	By tableDataList = By.xpath("//tr//td");
	
	public WebElement tableElement()
	{
		WebElement tableElement = driver.findElement(table);
		return tableElement;
	}
	
	public List<WebElement> tableDataListElements()
	{
		List<WebElement> tableDataListElements = tableElement().findElements(tableDataList);
		return tableDataListElements;
	}
	
	public String checkingElement(String expectedElement)
	{
		String actualElement = null;
		for(WebElement tableDataListElement:tableDataListElements())
		{
			if(PageUtility.getElementText(tableDataListElement).equals(expectedElement))
			{
				actualElement = PageUtility.getElementText(tableDataListElement);
				break;
			}
		}
		return actualElement;
	}
	
	
}
