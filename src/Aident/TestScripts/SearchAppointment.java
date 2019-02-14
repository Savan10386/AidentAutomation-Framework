package Aident.TestScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Aident.Globallibrary.GlobalVariables;
import Aident.PageObject.FindAppointment;
import Aident.PageObject.MenuOption;
import Aident.PageObject.SigninPage;

public class SearchAppointment {
	
	@BeforeClass
	public void setUp() throws Exception {
		
		GlobalVariables.oDriver = new InternetExplorerDriver();
	     GlobalVariables.oDriver.get(GlobalVariables.LoginURL);
		
	}
	
	@Test
	public void testSearchAppointment() throws Exception {
		try
		{
			SigninPage sp = new SigninPage();
			 sp.loginValidUser("2","1234567");
			 Assert.assertTrue(GlobalVariables.oDriver.getTitle().equals("Advance Search"));
			 MenuOption mo = new MenuOption();
			 mo.SelectScheduler("Scheduler");
			 FindAppointment fa = new FindAppointment();
			 fa.SearchCategory();
			 fa.EnterPatientID();
			 fa.ClickonSearch();
		     String str1 = GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_AppointmentList_rgAppointment_ctl00_ctl06_lblPatientName")).getText();
			 Assert.assertEquals("test1"+" "+"test",str1);
			 
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	@AfterClass
	public void tearDown() throws Exception {
		GlobalVariables.oDriver.quit();
    		}

}
