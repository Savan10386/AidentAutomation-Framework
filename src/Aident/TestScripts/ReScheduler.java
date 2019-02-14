package Aident.TestScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Aident.Globallibrary.GlobalVariables;
import Aident.PageObject.FindAppointment;
import Aident.PageObject.MenuOption;
import Aident.PageObject.ReScheduleAppointment;
import Aident.PageObject.SigninPage;

public class ReScheduler {
	
	@BeforeClass
	public void setUp() throws Exception {
		
		GlobalVariables.oDriver = new InternetExplorerDriver();
	     GlobalVariables.oDriver.get(GlobalVariables.LoginURL);
		
	}
	
	@Test
	public void testReScheduler() throws Exception {
		try
		{
			SigninPage sp = new SigninPage();
			 sp.loginValidUser("2","1234567");
			 Assert.assertTrue(GlobalVariables.oDriver.getTitle().equals("Advance Search"));
			 MenuOption mo = new MenuOption();
			 mo.SelectScheduler("Scheduler");
			 mo.ClickReschedule();
			 ReScheduleAppointment rsp = new ReScheduleAppointment();
			 rsp.Reschedule();
			 Assert.assertEquals("Singh"+" "+"Mohit",GlobalVariables.oDriver.findElement(By.id("dnn_ctr488_ReScheduler_rgdReScheduledAppointments_ctl00_ctl04_lblPatientName")).getText()); 
			
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
