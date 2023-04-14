package com.anu.testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.anu.pages.SimpleInputFormDemoPage;
import com.anu.pages.SimpleInputFormPageFactorypage;

import utilities.ExcelUtility;

public class SimpleInputFormPageFacoryTest extends Base
{
	SimpleInputFormPageFactorypage simpleInputFormpagefactorypage;
	@Test
	public void verifySingleInputTextField() throws IOException
	{
	
	 String inputMessage = ExcelUtility.getString(0, 0, System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestData.xlsx","SimpleInputdemo");	
	 String expectedInputMessage = "Your Message : "+inputMessage;
	 simpleInputFormpagefactorypage = new SimpleInputFormPageFactorypage(driver);
	 simpleInputFormpagefactorypage.enterValueSingleInputField(inputMessage);
	 assertTrue(simpleInputFormpagefactorypage.showMessagebuttonisEbnabled(),"Show Message button is not enabled");
	 simpleInputFormpagefactorypage.clickShowMessageButton();
	  assertEquals(expectedInputMessage,simpleInputFormpagefactorypage.singleInputFieldTextMessage(),"Text message is wrong as per the input");
	}
	
	public void verifyBackgroundColorofShowMessageButton() throws IOException
	{
		String expectedBackgroundColor = ExcelUtility.getString(5, 1, System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestData.xlsx","SimpleInputdemo");
		simpleInputFormpagefactorypage = new SimpleInputFormPageFactorypage(driver);
		assertEquals(expectedBackgroundColor,simpleInputFormpagefactorypage.backGroundColorOfShowMessageButton(),"Background color of show message button is not matching with the expected");
	}
	
	public void verifyFontSizeOfShowMessageButton() throws IOException
	{
		String expectedFontSize = ExcelUtility.getString(5, 2, System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestData.xlsx","SimpleInputdemo");
		simpleInputFormpagefactorypage = new SimpleInputFormPageFactorypage(driver);
		assertEquals(expectedFontSize,simpleInputFormpagefactorypage.fontColorOfShowMessageButton(),"font Color of ShowMessage button is not matching");
	}
}
