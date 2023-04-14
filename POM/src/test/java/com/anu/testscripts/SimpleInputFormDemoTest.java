package com.anu.testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.anu.pages.SimpleInputFormDemoPage;

import utilities.ExcelUtility;
import utilities.FakerUtility;

public class SimpleInputFormDemoTest extends Base
{
	SimpleInputFormDemoPage simpleinputformdemopage;
	
	@Test
	@Parameters({"inputMessage"})
	public void verifySingleInputTextField(String inputMessage) throws IOException
	{
	// ExcelUtility.getString(0, 0, System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestData.xlsx","SingleInputdemo");
	// String inputMessage = ExcelUtility.getString(0, 0, System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestData.xlsx","SimpleInputdemo");	
	 String expectedInputMessage = "Your Message : "+inputMessage;
	 simpleinputformdemopage = new SimpleInputFormDemoPage(driver);
	 simpleinputformdemopage.enterValueSingleInputField(inputMessage);
	 assertTrue(simpleinputformdemopage.showMessagebuttonisEbnabled(),"Show Message button is not enabled");
	 simpleinputformdemopage.clickShowMessageButton();
	  assertEquals(expectedInputMessage,simpleinputformdemopage.singleInputFieldTextMessage(),"Text message is wrong as per the input");
	}
	@Test
	public void verifyBackgroundColorofShowMessageButton() throws IOException
	{
		String expectedBackgroundColor = ExcelUtility.getString(5, 1, System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestData.xlsx","SimpleInputdemo");
		simpleinputformdemopage = new SimpleInputFormDemoPage(driver);
		assertEquals(expectedBackgroundColor,simpleinputformdemopage.backGroundColorOfShowMessageButton(),"Background color of show message button is not matching with the expected");
	}
	@Test
	public void verifyFontSizeOfShowMessageButton() throws IOException
	{
		String expectedFontSize = ExcelUtility.getString(5, 2, System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestData.xlsx","SimpleInputdemo");
		simpleinputformdemopage = new SimpleInputFormDemoPage(driver);
		assertEquals(expectedFontSize,simpleinputformdemopage.fontColorOfShowMessageButton(),"font Color of ShowMessage button is not matching");
	}
	@Test
	public void verifySingleInputTextFieldtest() 
	{
	// ExcelUtility.getString(0, 0, System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestData.xlsx","SingleInputdemo");
	// String inputMessage = ExcelUtility.getString(0, 0, System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestData.xlsx","SimpleInputdemo");	
	 String inputMessage = FakerUtility.emailID(); 
	 String expectedInputMessage = "Your Message : "+inputMessage;
	 simpleinputformdemopage = new SimpleInputFormDemoPage(driver);
	 simpleinputformdemopage.enterValueSingleInputField(inputMessage);
	 assertTrue(simpleinputformdemopage.showMessagebuttonisEbnabled(),"Show Message button is not enabled");
	 simpleinputformdemopage.clickShowMessageButton();
	  assertEquals(expectedInputMessage,simpleinputformdemopage.singleInputFieldTextMessage(),"Text message is wrong as per the input");
	}
	@Test(dataProvider="inputProvider")
	public void verifySingleInputTextFieldusingDataProvider(String inputMessage) 
	{
	// ExcelUtility.getString(0, 0, System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestData.xlsx","SingleInputdemo");
	// String inputMessage = ExcelUtility.getString(0, 0, System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\TestData.xlsx","SimpleInputdemo");	
	 String expectedInputMessage = "Your Message : "+inputMessage;
	 simpleinputformdemopage = new SimpleInputFormDemoPage(driver);
	 simpleinputformdemopage.enterValueSingleInputField(inputMessage);
	 assertTrue(simpleinputformdemopage.showMessagebuttonisEbnabled(),"Show Message button is not enabled");
	 simpleinputformdemopage.clickShowMessageButton();
	  assertEquals(expectedInputMessage,simpleinputformdemopage.singleInputFieldTextMessage(),"Text message is wrong as per the input");
	}
	
	@DataProvider(name="inputProvider")
	public Object[][] getDataFromDataprovider()
	{
	    return new Object[][] 
	    	{
	            { "Renju"},
	            { "Anu"},
	            { "swapna"}	
	    	};
	    }

}
