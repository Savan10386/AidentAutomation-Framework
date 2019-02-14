package Aident.TestScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Aident.Globallibrary.GlobalVariables;
import Aident.PageObject.FindAppointment;
import Aident.PageObject.MenuOption;
import Aident.PageObject.SigninPage;

public class DayView {
	
	@BeforeClass
	public void setUp() throws Exception {
		
		GlobalVariables.oDriver = new InternetExplorerDriver();
	     GlobalVariables.oDriver.get(GlobalVariables.LoginURL);
		
	}
	
	@Test
	public void testFilterView() throws Exception {
		try
		{
			 SigninPage sp = new SigninPage();
			 sp.loginValidUser("2","1234567");
			 Assert.assertTrue(GlobalVariables.oDriver.getTitle().equals("Advance Search"));
			 MenuOption mo = new MenuOption();
			 mo.SelectScheduler("Scheduler");
			 FindAppointment fa = new FindAppointment();
			 fa.DayviewSearch();
			 GlobalVariables.oDriver.findElement(By.id("dnn_ctr451_ResourceFilter_rbtnDayView")).click();
				GlobalVariables.oElement = GlobalVariables.oDriver.findElement(By.className("rsHorizontalHeaderTable"));
				java.util.List<WebElement> options = GlobalVariables.oElement.findElements(By.tagName("div"));
				for (WebElement option : options) {
			        if ("NEW PT EXAM".equals(option.getText())) {
			        	 Assert.assertEquals("NEW"+" "+"PT"+" "+"EXAM",option.getText());
			            break;
			        }
			        else
			        	Assert.assertFalse(false);
				}
		
			 
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	@AfterClass
	public void tearDown() throws Exception {
		//GlobalVariables.oDriver.quit();
    		}

}
