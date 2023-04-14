package com.anu.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.WaitUtility;

public class Base
{
	public WebDriver driver;
	@BeforeMethod(alwaysRun =true)
	public  void initializeBrowser()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\chromedriver.exe");//driver initialization
		//if the browser is edge key will be - webdriver.edge.driver
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		WaitUtility.implicitWait(driver);
		driver.manage().window().maximize();
		WaitUtility.pageLoadWait(driver);
	}
	@AfterMethod(alwaysRun =true)
	public void afterTest()
	{
		driver.quit();
	}

}
