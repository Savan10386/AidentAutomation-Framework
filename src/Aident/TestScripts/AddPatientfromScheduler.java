package Aident.TestScripts;

import static org.junit.Assert.assertTrue;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Aident.Globallibrary.GlobalVariables;
import Aident.PageObject.AppointmentInformation;
import Aident.PageObject.MenuOption;
import Aident.PageObject.PatientInformation;
import Aident.PageObject.SigninPage;

public class AddPatientfromScheduler {
	
	@BeforeClass
	public void setUp() throws Exception {
		File file = new File("C:/Users/Savan/Desktop/selenium-2.33.0/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		GlobalVariables.oDriver = new InternetExplorerDriver();
	     GlobalVariables.oDriver.get(GlobalVariables.LoginURL);
		
	}
	
	@Test
	public void testAddAppointments() throws Exception {
		try
		{
			 SigninPage sp = new SigninPage();
			 sp.loginValidUser("2","1234567");
			 MenuOption mo = new MenuOption();
			 mo.SelectScheduler("Scheduler");
			 AppointmentInformation ai = new AppointmentInformation();
			 ai.EditAppointment();
			 ai.ClickonAddPatientButton();
			 PatientInformation Pi = new PatientInformation("Aident > Patient Management > Add Patient");
             Pi.AddPatientinformation("", "", "","Male","English", "SINGLE");
             // Add Address
			 Pi.Addadress("Street No 5","AK","Akiachak","99551","Owned");
			 //Add provider information
			 Pi.AddProvider("Cornerr Johnn","GARCIA, ANITA");
			 //Add preffered method of communication
			// Pi.AddPrefferedComm("","N/A");
			 //Add appointment
			 Pi.AddAppointment("3 Months");
			 //Add responsible party
			 Pi.AddResponsibleparty("Self","FAMILY/FRIEND REFERRAL","FRIEND");
			 //click on next button
			 Pi.ClickonNext();
			 //validate Employer page
			 assertTrue("Add Emergency",GlobalVariables.oDriver.getTitle().equals("Aident > Patient Management > Add Patient"));
			 //Enter Employer tab.
			 Pi.AddEmployerInformation("2K GAMES/TAKE TWO INTER.","Bussinessman","5");
			 //Enter Emergency tab
			 Pi.AddEmergency("Male","tester","tester","125-689-8556","Son");
			 //Click on next button
			 Pi.ClickonNextEmployer();
			 // validate insurance page
			 assertTrue("Add Insurance",GlobalVariables.oDriver.getTitle().equals("Aident > Patient Management > Add Patient"));
			 //Enter primary information
			// Pi.AddPrimaryInsuranceInformation("HMO","AETNA (AETNA4)","337","Self","3 D SYSTEMS INC");
			 Pi.ClickonSave();
		String str =GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_Insurance_userControl_lblRegistrationMessage")).getText();
			 Assert.assertEquals("Insurance details saved successfully",str);
			 
			 
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
