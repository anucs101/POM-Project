package com.anu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.PageUtility;

public class CheckBoxDemoPage 
{
	WebDriver driver;
	public CheckBoxDemoPage(WebDriver driver)
	{
		this.driver = driver;
	}
	By singleCheckBox = By.xpath("//input[@id='gridCheck']");
	By singleCheckBoxTextField = By.xpath("//div[@id='message-one']");
	
	public WebElement singleCheckBoxElement()
	{
		WebElement singleCheckBoxElement = driver.findElement(singleCheckBox);
		return singleCheckBoxElement;
	}
	
	public boolean singleCheckBoxElementIsSelected()
	{
		return PageUtility.isElementSelected(singleCheckBoxElement());
		//	return singleCheckBoxElement().isSelected();
	}
	
	public WebElement singleCheckBoxTextFieldElement()
	{
		WebElement singleCheckBoxTextFieldElement = driver.findElement(singleCheckBoxTextField);
		return singleCheckBoxTextFieldElement;
	}
	
	public void clicksingleCheckBoxElement()
	{
		PageUtility.clickOnElement(singleCheckBoxElement());
		//singleCheckBoxElement().click();
	}
	
	public String getTextOfsingleCheckBoxTextFieldElement()
	{
		return PageUtility.getElementText(singleCheckBoxTextFieldElement());
		//return singleCheckBoxTextFieldElement().getText();
	}
	
	public String sizeOfSingleCheckBox()
	{
		return PageUtility.getCssValueofElement(singleCheckBoxElement(),"box-sizing");
	}
	
	public String fontWeightOfsingleCheckBoxTextField()
	{
		return PageUtility.getCssValueofElement(singleCheckBoxTextFieldElement(),"font-weight");
	}
	
}
