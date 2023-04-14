package com.anu.testscripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.anu.pages.SelectCategory;
import com.anu.pages.SelectInputPage;

import utilities.ExcelUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class SelectInputTest extends Base

{
	SelectInputPage selectinputpage;
	@Test(priority = 3)
	public void verifySelectInputDemo() throws IOException
	{
		String inputcolor = ExcelUtility.getString(1, 1, System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestData.xlsx","SelectInput");
		String expectedSelectColorTextFieldElement = "Selected Color : "+inputcolor;
		SelectCategory selectcategory = new SelectCategory(driver);
		selectcategory.navigateToCategory("Select Input");
		selectinputpage = new SelectInputPage(driver);
		String visibleText = ExcelUtility.getString(1, 0, System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestData.xlsx","SelectInput");
		selectinputpage.selectByTextfromDropDownMenu(visibleText);
		assertEquals(expectedSelectColorTextFieldElement,selectinputpage.getTextofselectColorTextFieldElement(),"Text is wrong as per the input given");
	}
	@Test(priority = 1)
	public void verifyWidthOfselectColorDropDownMenu() throws IOException
	{
		String ExpectedWidth = ExcelUtility.getString(7, 1, System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestData.xlsx","SelectInput");
		SelectCategory selectcategory = new SelectCategory(driver);
		selectcategory.navigateToCategory("Select Input");
		selectinputpage = new SelectInputPage(driver);
		assertEquals(ExpectedWidth,selectinputpage.colorOfselectColorDropDownMenu(),"Color is not matching with the expected");
	}
	@Test(priority = 2)
	public void verifyFontSizeOfselectColorTextField() throws IOException
	{
		String ExpectedFontSize = ExcelUtility.getString(11, 1, System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestData.xlsx","SelectInput");
		SelectCategory selectcategory = new SelectCategory(driver);
		selectcategory.navigateToCategory("Select Input");
		selectinputpage = new SelectInputPage(driver);
		assertEquals(ExpectedFontSize,selectinputpage.sizeOfselectColorTextField(),"Font Size is not matched with expected");
	}

}
