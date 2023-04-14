package com.anu.testscripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import com.anu.pages.DynamicTablePage;

import utilities.ExcelUtility;

public class DynamicTableTest extends Base

{
	
	DynamicTablePage dynamictablepage;
	@Test
	public void verifyElementIsPresent() throws IOException 
	{
		String ExpectedElement = ExcelUtility.getString(0, 0, System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestData.xlsx", "Dynamictable");
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		dynamictablepage = new DynamicTablePage(driver);
		assertEquals(ExpectedElement,dynamictablepage.checkingElement(ExpectedElement),"Element not Detected");
	}

}
