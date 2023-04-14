package com.anu.testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.anu.pages.RadioButtonDemoPage;
import com.anu.pages.RadioButtonDemoPageFactoryPage;
import com.anu.pages.SelectCategory;

import utilities.ExcelUtility;

public class RadioButtonDemoPageFactoryTest extends Base
{
	RadioButtonDemoPageFactoryPage radiobuttondemopagefactorypage;
	@Test
	public void verifyRadioButtonDemo() throws IOException
	{	
		String input = ExcelUtility.getString(3, 0, System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestData.xlsx","RadioButtondemo");
		String expectedradioButtonTextFieldElement = "Radio button "+input+" is checked";
		SelectCategory selectcategory = new SelectCategory(driver);
		selectcategory.navigateToCategory("Radio Buttons Demo");
		radiobuttondemopagefactorypage = new RadioButtonDemoPageFactoryPage(driver);
		assertFalse(radiobuttondemopagefactorypage.radioButtonFemaleElementIsSelected()&&radiobuttondemopagefactorypage.radioButtonMaleElementIsSelected(),"Buttons are selected");
		radiobuttondemopagefactorypage.clickradioButtonFemaleElement();
		assertTrue(radiobuttondemopagefactorypage.showSelectedValueButtonElementIsEnabled(),"Button is diabled");
		radiobuttondemopagefactorypage.clickshowSelectedValueButtonElement();
		assertEquals(expectedradioButtonTextFieldElement,radiobuttondemopagefactorypage.getTextOfradioButtonTextFieldElement(),"Text is wrong as per the input given");
	}
	@Test
	public void verifyShapeOfShowSelectedValueButton() throws IOException
	{
		String expectedShapeOfshowSelectedValueButton = ExcelUtility.getString(7, 1, System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestData.xlsx","RadioButtondemo");
		SelectCategory selectcategory = new SelectCategory(driver);
		selectcategory.navigateToCategory("Radio Buttons Demo");
		radiobuttondemopagefactorypage = new RadioButtonDemoPageFactoryPage(driver);
		assertEquals(expectedShapeOfshowSelectedValueButton,radiobuttondemopagefactorypage.ShapeOfshowSelectedValueButton(),"Shape is not matching");
	}
	@Test
	public void verifyBorderColorOfShowSelectedValueButton() throws IOException
	{
		String expectedBorderColorOfshowSelectedValueButton = ExcelUtility.getString(7, 2, System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestData.xlsx","RadioButtondemo");
		SelectCategory selectcategory = new SelectCategory(driver);
		selectcategory.navigateToCategory("Radio Buttons Demo");
		radiobuttondemopagefactorypage = new RadioButtonDemoPageFactoryPage(driver);
		assertEquals(expectedBorderColorOfshowSelectedValueButton,radiobuttondemopagefactorypage.BorderColorOfshowSelectedValueButton(),"Border color not matching");
	}

}
