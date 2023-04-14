package com.anu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.PageUtility;
import utilities.WaitUtility;

public class SelectInputPage 

{
	WebDriver driver;
	public SelectInputPage(WebDriver driver)
	{
		this.driver = driver;
	}
	By selectColorDropDownMenu = By.xpath("//select[@id='single-input-field']");
	By selectColorTextField = By.xpath("//div[@id='message-one']");
	
	public WebElement selectColorDropDownMenuElement()
	{
		WebElement selectColorDropDownMenuElement = driver.findElement(selectColorDropDownMenu);
		return selectColorDropDownMenuElement;
	}
	
	public WebElement selectColorTextFieldElement()
	{
		WebElement selectColorTextFieldElement = driver.findElement(selectColorTextField);
		return selectColorTextFieldElement;
	}
	
	
	public String getTextofselectColorTextFieldElement()
	{
	//	WaitUtility.waitForElement(driver, selectColorTextFieldElement());
		return PageUtility.getElementText(selectColorTextFieldElement());
		//return selectColorTextFieldElement().getText();
	}
	
	public void selectByTextfromDropDownMenu(String text)
	{
		PageUtility.selectDropdownbyText(selectColorDropDownMenuElement(),text);
	}
	
	public String colorOfselectColorDropDownMenu()
	{
		return PageUtility.getCssValueofElement(selectColorDropDownMenuElement(),"color");
	}
	
	public String sizeOfselectColorTextField()
	{
		return PageUtility.getCssValueofElement(selectColorTextFieldElement(),"font-size");
	}

}
