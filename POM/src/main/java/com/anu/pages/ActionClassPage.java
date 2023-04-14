package com.anu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.PageUtility;

public class ActionClassPage 
{	
	WebDriver driver;
	public ActionClassPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By sourcetoDrag = By.xpath("//span[text()='Draggable n°1']");
	By destinationtoDrop = By.xpath("//div[@id='mydropzone']");
	
	public WebElement sourceElement()
	{
		WebElement sourceElement = driver.findElement(sourcetoDrag);
		return sourceElement;
	}
	
	public WebElement destinationElement()
	{
		WebElement destinationElement = driver.findElement(destinationtoDrop);
		return destinationElement;
	}
	
	public void dragAndDropSourceElement()
	{
		PageUtility.dragAndDrop(driver, sourceElement(), destinationElement());
	}
	
}
