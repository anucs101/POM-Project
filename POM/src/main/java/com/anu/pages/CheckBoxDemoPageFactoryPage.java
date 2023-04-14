package com.anu.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class CheckBoxDemoPageFactoryPage 
{
	WebDriver driver;
	public CheckBoxDemoPageFactoryPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='gridCheck']")
	WebElement singleCheckBoxElement;
	
	@FindBy(xpath="//div[@id='message-one']")
	WebElement singleCheckBoxTextFieldElement;
	
	public boolean singleCheckBoxElementIsSelected()
	{
		return PageUtility.isElementSelected(singleCheckBoxElement);
	}
	
	public void clicksingleCheckBoxElement()
	{
		PageUtility.clickOnElement(singleCheckBoxElement);
	}
	
	public String getTextOfsingleCheckBoxTextFieldElement()
	{
		return PageUtility.getElementText(singleCheckBoxTextFieldElement);
	}
	
	public String sizeOfSingleCheckBox()
	{
		return PageUtility.getCssValueofElement(singleCheckBoxElement,"box-sizing");
	}
	
	public String fontWeightOfsingleCheckBoxTextField()
	{
		return PageUtility.getCssValueofElement(singleCheckBoxTextFieldElement,"font-weight");
	}
	
	
	
	
	
	
	
	
}
