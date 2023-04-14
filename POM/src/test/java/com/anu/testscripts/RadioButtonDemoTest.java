package com.anu.testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.anu.pages.RadioButtonDemoPage;
import com.anu.pages.SelectCategory;

import utilities.ExcelUtility;

public class RadioButtonDemoTest extends Base
{
	RadioButtonDemoPage radiobuttondemopage;
	@Test
	public void verifyRadioButtonDemo() throws IOException
	{	
		String input = ExcelUtility.getString(3, 0, System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestData.xlsx","RadioButtondemo");
		String expectedradioButtonTextFieldElement = "Radio button "+input+" is checked";
		SelectCategory selectcategory = new SelectCategory(driver);
		selectcategory.navigateToCategory("Radio Buttons Demo");
		radiobuttondemopage = new RadioButtonDemoPage(driver);
		assertFalse(radiobuttondemopage.radioButtonFemaleElementIsSelected()&&radiobuttondemopage.radioButtonMaleElementIsSelected(),"Buttons are selected");
		radiobuttondemopage.clickradioButtonFemaleElement();
		assertTrue(radiobuttondemopage.showSelectedValueButtonElementIsEnabled(),"Button is diabled");
		radiobuttondemopage.clickshowSelectedValueButtonElement();
		assertEquals(expectedradioButtonTextFieldElement,radiobuttondemopage.getTextOfradioButtonTextFieldElement(),"Text is wrong as per the input given");
	}
	@Test
	public void verifyShapeOfShowSelectedValueButton() throws IOException
	{
		String expectedShapeOfshowSelectedValueButton = ExcelUtility.getString(7, 1, System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestData.xlsx","RadioButtondemo");
		SelectCategory selectcategory = new SelectCategory(driver);
		selectcategory.navigateToCategory("Radio Buttons Demo");
		radiobuttondemopage = new RadioButtonDemoPage(driver);
		assertEquals(expectedShapeOfshowSelectedValueButton,radiobuttondemopage.ShapeOfshowSelectedValueButton(),"Shape is not matching");
	}
	@Test
	public void verifyBorderColorOfShowSelectedValueButton() throws IOException
	{
		String expectedBorderColorOfshowSelectedValueButton = ExcelUtility.getString(7, 2, System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestData.xlsx","RadioButtondemo");
		SelectCategory selectcategory = new SelectCategory(driver);
		selectcategory.navigateToCategory("Radio Buttons Demo");
		radiobuttondemopage = new RadioButtonDemoPage(driver);
		assertEquals(expectedBorderColorOfshowSelectedValueButton,radiobuttondemopage.BorderColorOfshowSelectedValueButton(),"Border color not matching");
	}

}
