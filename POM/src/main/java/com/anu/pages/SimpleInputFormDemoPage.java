package com.anu.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.PageUtility;
import utilities.WaitUtility;

public class SimpleInputFormDemoPage
{
	WebDriver driver;
	public SimpleInputFormDemoPage(WebDriver driver)
	{
		this.driver = driver;
	}
	By singleInputFieldTextBox = By.xpath("//input[@id='single-input-field']");
	By showMessageButton = By.xpath("//button[@id='button-one']");
	By singleInputFieldTextMessage = By.xpath("//div[@id='message-one']");
	
	public WebElement singleInputFieldTextBoxElement() 
	{
		WebElement SingleInputFieldTextBoxElement = driver.findElement(singleInputFieldTextBox);
		WaitUtility.waitForElement(driver, SingleInputFieldTextBoxElement);
		return SingleInputFieldTextBoxElement;
	}
	
	public WebElement showMessageButtonElement()
	{
		
		WebElement showMessageButtonElement = driver.findElement(showMessageButton);
		return showMessageButtonElement;
	}
	
	public WebElement singleInputFieldTextMessageElement()
	{
	WebElement singleInputFieldTextMessageElement = driver.findElement(singleInputFieldTextMessage);
	return singleInputFieldTextMessageElement;
	}
	
	public void enterValueSingleInputField(String input)
	{
		//singleInputFieldTextBoxElement().sendKeys(input);
		PageUtility.sendKey(singleInputFieldTextBoxElement(), input);
	}
	
	public void clickShowMessageButton()
	{
		WaitUtility.fluentWait(driver, showMessageButton);
		PageUtility.clickOnElement(showMessageButtonElement());
		//showMessageButtonElement().click();
	}
	
	public String singleInputFieldTextMessage()
	{
		//String actualInputMessage = singleInputFieldTextMessageElement().getText();
		WaitUtility.waitForElementIsPresent(driver, singleInputFieldTextMessageElement());
		String actualInputMessage = PageUtility.getElementText(singleInputFieldTextMessageElement());
		return actualInputMessage;
	}
	
	public boolean showMessagebuttonisEbnabled()
	{
	//return showMessageButtonElement().isEnabled();
		return PageUtility.isElementEnabled(showMessageButtonElement());
		
	}
	
	public String backGroundColorOfShowMessageButton()
	{
		return PageUtility.getCssValueofElement(showMessageButtonElement(),"background-color");
	}
	
	public String fontColorOfShowMessageButton()
	{
		return PageUtility.getCssValueofElement(showMessageButtonElement(), "font-size");
	}
	
}

