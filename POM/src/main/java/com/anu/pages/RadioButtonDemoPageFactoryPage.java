package com.anu.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class RadioButtonDemoPageFactoryPage 
{
	WebDriver driver;
	public RadioButtonDemoPageFactoryPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='inlineRadio1']")
	WebElement radioButtonMaleElement;
	
	@FindBy(xpath="//input[@id='inlineRadio2']")
	WebElement radioButtonFemaleElement;
	
	@FindBy(xpath="//button[@id='button-one']")
	WebElement showSelectedValueButtonElement;
	
	@FindBy(xpath="//div[@id='message-one']")
	WebElement radioButtonTextFieldElement;
	
	public boolean radioButtonMaleElementIsSelected()
	{
		return PageUtility.isElementSelected(radioButtonMaleElement);
	}
	
	public boolean radioButtonFemaleElementIsSelected()
	{
		return PageUtility.isElementSelected(radioButtonFemaleElement);
	}
	
	public void clickradioButtonFemaleElement()
	{
		PageUtility.clickOnElement(radioButtonFemaleElement);
	}
	
	public String getTextOfradioButtonTextFieldElement()
	{
		
		return PageUtility.getElementText(radioButtonTextFieldElement);
	}
	
	public boolean showSelectedValueButtonElementIsEnabled() 
	{
		return PageUtility.isElementEnabled(showSelectedValueButtonElement);
	}
	
	public void clickshowSelectedValueButtonElement() 
	{
		PageUtility.clickOnElement(showSelectedValueButtonElement);
	}
	
	public String ShapeOfshowSelectedValueButton()
	{
		return PageUtility.getCssValueofElement(showSelectedValueButtonElement,"border-radius");
	}
	
	public String BorderColorOfshowSelectedValueButton()
	{
		return PageUtility.getCssValueofElement(showSelectedValueButtonElement,"border-color");
	}
	
	
}
