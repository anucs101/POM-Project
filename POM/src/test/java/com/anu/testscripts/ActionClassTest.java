package com.anu.testscripts;

import org.testng.annotations.Test;

import com.anu.pages.ActionClassPage;

public class ActionClassTest extends Base
{
	ActionClassPage actionclasspage;
	@Test
	public void verifyDragAndDrop()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		actionclasspage = new ActionClassPage(driver);
		actionclasspage.dragAndDropSourceElement();
				
	}

}
