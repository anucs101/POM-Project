package com.anu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.PageUtility;

public class RadioButtonDemoPage

{
	WebDriver driver;
	public RadioButtonDemoPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By radioButtonMale = By.xpath("//input[@id='inlineRadio1']");
	By radioButtonFemale = By.xpath("//input[@id='inlineRadio2']");
	By showSelectedValueButton = By.xpath("//button[@id='button-one']");
	By radioButtonTextField = By.xpath("//div[@id='message-one']");
	
	public WebElement radioButtonMaleElement()
	{
		WebElement radioButtonMaleElement = driver.findElement(radioButtonFemale);
		return radioButtonMaleElement;
	}
	
	public WebElement radioButtonFemaleElement()
	{
		WebElement radioButtonFemaleElement = driver.findElement(radioButtonFemale);
		return radioButtonFemaleElement;
	}
	
	public WebElement radioButtonTextFieldElement()
	{
		WebElement radioButtonTextFieldElement = driver.findElement(radioButtonTextField);
		return radioButtonTextFieldElement;
	}
	
	public WebElement showSelectedValueButtonElement()
	{
		WebElement showSelectedValueButtonElement = driver.findElement(showSelectedValueButton);
		return showSelectedValueButtonElement;
	}
	
	
	public boolean radioButtonMaleElementIsSelected()
	{
		return PageUtility.isElementSelected(radioButtonMaleElement());
		//return radioButtonFemaleElement().isSelected();
	}
	
	public boolean radioButtonFemaleElementIsSelected()
	{
		return PageUtility.isElementSelected(radioButtonFemaleElement());
		//return radioButtonFemaleElement().isSelected();
	}
	
	public void clickradioButtonFemaleElement()
	{
		PageUtility.clickOnElement(radioButtonFemaleElement());
		//radioButtonFemaleElement().click();
	}
	
	public String getTextOfradioButtonTextFieldElement()
	{
		
		return PageUtility.getElementText(radioButtonTextFieldElement());
		//return radioButtonTextFieldElement().getText();
	}
	
	public boolean showSelectedValueButtonElementIsEnabled() 
	{
		return PageUtility.isElementEnabled(showSelectedValueButtonElement());
		//return showSelectedValueButtonElement().isEnabled();
	}
	
	public void clickshowSelectedValueButtonElement() 
	{
		PageUtility.clickOnElement(showSelectedValueButtonElement());
		//showSelectedValueButtonElement().click();
	}
	
	public String ShapeOfshowSelectedValueButton()
	{
		return PageUtility.getCssValueofElement(showSelectedValueButtonElement(),"border-radius");
	}
	
	public String BorderColorOfshowSelectedValueButton()
	{
		return PageUtility.getCssValueofElement(showSelectedValueButtonElement(),"border-color");
	}

}
