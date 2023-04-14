package com.anu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class SimpleInputFormPageFactorypage 
{
WebDriver driver;
public SimpleInputFormPageFactorypage(WebDriver driver)
{
	this.driver= driver;
	PageFactory.initElements(driver, this);
}

	@FindBy(xpath="//input[@id='single-input-field']")
	WebElement singleInputFieldTextBoxElement;
	
	@FindBy(xpath="//button[@id='button-one']")
	WebElement showMessageButtonElement;
	
	@FindBy(xpath="//div[@id='message-one']")
	WebElement singleInputFieldTextMessageElement;
	
	public void enterValueSingleInputField(String input)
	{
		PageUtility.sendKey(singleInputFieldTextBoxElement, input);
	}
	
	public void clickShowMessageButton()
	{
		
		PageUtility.clickOnElement(showMessageButtonElement);
	}
	
	public String singleInputFieldTextMessage()
	{
		
		
		String actualInputMessage = PageUtility.getElementText(singleInputFieldTextMessageElement);
		return actualInputMessage;
	}
	
	public boolean showMessagebuttonisEbnabled()
	{
	return PageUtility.isElementEnabled(showMessageButtonElement);
	}
	
	public String backGroundColorOfShowMessageButton()
	{
		return PageUtility.getCssValueofElement(showMessageButtonElement,"background-color");
	}
	
	public String fontColorOfShowMessageButton()
	{
		return PageUtility.getCssValueofElement(showMessageButtonElement, "font-size");
	}
	
}
