package com.anu.testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import java.io.IOException;

import org.testng.annotations.Test;

import com.anu.pages.CheckBoxDemoPage;
import com.anu.pages.CheckBoxDemoPageFactoryPage;
import com.anu.pages.SelectCategory;

import utilities.ExcelUtility;

public class CheckBoxDemoPageFactoryTest extends Base
{
	CheckBoxDemoPageFactoryPage checkboxdemopagefactorypage;
	@Test
	public void verifySingleCheckBoxDemo() throws IOException
	{
		String expectedTextOfsingleCheckBoxTextFieldElement = ExcelUtility.getString(0, 0, System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestData.xlsx","CheckboxDemo");
		SelectCategory selectcategory = new SelectCategory(driver);
		selectcategory.navigateToCategory("Checkbox Demo");
		checkboxdemopagefactorypage = new CheckBoxDemoPageFactoryPage(driver);
		assertFalse(checkboxdemopagefactorypage.singleCheckBoxElementIsSelected(),"Single check box is not selected");
		checkboxdemopagefactorypage.clicksingleCheckBoxElement();
		assertEquals(checkboxdemopagefactorypage.getTextOfsingleCheckBoxTextFieldElement(),expectedTextOfsingleCheckBoxTextFieldElement,"expected text is not displayed");
	}
	@Test
	public void verifySizeOfBox() throws IOException
	{
		String ExpectedSizeOfCheckBox = ExcelUtility.getString(3, 1, System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestData.xlsx","CheckboxDemo");
		SelectCategory selectcategory = new SelectCategory(driver);
		selectcategory.navigateToCategory("Checkbox Demo");
		checkboxdemopagefactorypage = new CheckBoxDemoPageFactoryPage(driver);
		assertEquals(ExpectedSizeOfCheckBox,checkboxdemopagefactorypage.sizeOfSingleCheckBox(),"Size of check box is not matched with the expected");
	}
	@Test
	public void verifyFontWeightOfsingleCheckBoxTextField() throws IOException
	{
		String ExpectedfontWeight = ExcelUtility.getNumeric(7, 1, System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestData.xlsx","CheckboxDemo");
		SelectCategory selectcategory = new SelectCategory(driver);
		selectcategory.navigateToCategory("Checkbox Demo");
		checkboxdemopagefactorypage = new CheckBoxDemoPageFactoryPage(driver);
		assertEquals(ExpectedfontWeight,checkboxdemopagefactorypage.fontWeightOfsingleCheckBoxTextField(),"Font weight is not matching wih the expected");
	}

}
