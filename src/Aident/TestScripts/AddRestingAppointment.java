package Aident.TestScripts;



import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Aident.Globallibrary.GlobalVariables;
import Aident.PageObject.MenuOption;
import Aident.PageObject.RestingScheduler;
import Aident.PageObject.SigninPage;

public class AddRestingAppointment {
	@BeforeClass
	public void setUp() throws Exception {
		
		GlobalVariables.oDriver = new InternetExplorerDriver();
	     GlobalVariables.oDriver.get(GlobalVariables.LoginURL);
		
	}
	
	@Test
	public void testAddAppointment() throws Exception {
		try
		{
			SigninPage sp = new SigninPage();
			 sp.loginValidUser("2","1234567");
			 Assert.assertTrue(GlobalVariables.oDriver.getTitle().equals("Advance Search"));
			 MenuOption mo = new MenuOption();
			 mo.SelectScheduler("Scheduler");
			 RestingScheduler sch = new RestingScheduler();
			 sch.AddNewAppointment();
			 sch.PatientDetails("TestAuto","TestAuto","1/10/1989");
			 sch.ResponsibleParty("FAMILY/FRIEND REFERRAL","FRIEND");
			 sch.InsuranceInformation("HMO","AETNA (AETNA4)","337");
			 sch.AddPrefferedComm("113-698-6935","N/A");
			 sch.AddAppointmentDetails("NEW PT EXAM","B&B","Treatment","Low","13","7:00 AM");
			 sch.ClickonSave();
			 Assert.assertEquals("TestAuto"+" "+"TestAuto",GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_rgResting_ctl00_ctl04_lblPatient")).getText()); 
			
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





