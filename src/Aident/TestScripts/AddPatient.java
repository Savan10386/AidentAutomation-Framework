package Aident.TestScripts;

import java.io.File;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;
import org.testng.Assert;
import Aident.Globallibrary.GenericFunction;
import Aident.Globallibrary.GlobalVariables;
import Aident.PageObject.PatientInformation;
import Aident.PageObject.SigninPage;

public class AddPatient {
	
	@BeforeTest
	public void setUp() throws Exception {
		
		File file = new File("C:/Users/Savan/Desktop/selenium-2.33.0/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		GenericFunction.GetTestData("login","LoginData.xml");
		GenericFunction.GetTestData("Patient","LoginData.xml");
		GlobalVariables.oDriver = new InternetExplorerDriver();
	     GlobalVariables.oDriver.get(GlobalVariables.LoginURL);
		
	}
	
	@org.testng.annotations.Test
	public void testAddPatient() throws Exception {
		try
		{
			// Create login object
			SigninPage sp = new SigninPage();
			// Call Login method
			sp.loginValidUser(GlobalVariables.testData.get("username"),GlobalVariables.testData.get("password"));
			//Validate Login page
		    Assert.assertEquals("Advance Search",GlobalVariables.oDriver.getTitle());
			 // Create Patient object
			PatientInformation pi = new PatientInformation("Advance Search");
			//Click on addpatient icon
			 pi.Clickaddpatient();
			//Validate Pateint information page
			 Assert.assertEquals("Aident > Patient Management > Add Patient",GlobalVariables.oDriver.getTitle());
			 // Add Patient information
			 pi.AddPatientinformation(GlobalVariables.testData.get("firstname"),GlobalVariables.testData.get("lastname"),GlobalVariables.testData.get("dob"),GlobalVariables.testData.get("gender"),GlobalVariables.testData.get("lang"),GlobalVariables.testData.get("martialstatus"));
			 // Add Address
			 pi.Addadress(GlobalVariables.testData.get("address"),GlobalVariables.testData.get("state"),GlobalVariables.testData.get("city"),GlobalVariables.testData.get("zip"),GlobalVariables.testData.get("house"));
			 //Add provider information
			 pi.AddProvider(GlobalVariables.testData.get("provider"),GlobalVariables.testData.get("consultant"));
			 //Add preffered method of communication
			 pi.AddPrefferedComm(GlobalVariables.testData.get("cellno"),GlobalVariables.testData.get("preffcomm"));
			 //Add appointment
			 pi.AddAppointment(GlobalVariables.testData.get("recallinfo"));
			 //Add responsible party
			 pi.AddResponsibleparty(GlobalVariables.testData.get("respparty"),GlobalVariables.testData.get("referralgroup"),GlobalVariables.testData.get("referredby"));
			 //click on next button
			 pi.ClickonNext();
			 //validate Employer page
			 Assert.assertEquals("Aident > Patient Management > Add Patient",GlobalVariables.oDriver.getTitle());
			 //Enter Employer tab.
			 pi.AddEmployerInformation(GlobalVariables.testData.get("empname"),GlobalVariables.testData.get("occupation"),GlobalVariables.testData.get("years"));
			 //Enter Emergency tab
			 pi.AddEmergency(GlobalVariables.testData.get("emergender"),GlobalVariables.testData.get("emerfrstname"),GlobalVariables.testData.get("emerlstname"),GlobalVariables.testData.get("emercellno"),GlobalVariables.testData.get("emerreal"));
			 //Click on next button
			 pi.ClickonNextEmployer();
			 // validate insurance page
			 Assert.assertEquals("Aident > Patient Management > Add Patient",GlobalVariables.oDriver.getTitle());
			 //Enter primary information
			 pi.AddPrimaryInsuranceInformation(GlobalVariables.testData.get("group"),GlobalVariables.testData.get("name"),GlobalVariables.testData.get("insuranceid"),GlobalVariables.testData.get("subscribertype"),GlobalVariables.testData.get("iempname"));
			 pi.ClickonSave();
		     String str =GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_Insurance_userControl_lblRegistrationMessage")).getText();
		     Assert.assertEquals("Insurance details saved successfully",str);
		     
			
			   
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	

	@AfterTest
	public void tearDown() throws Exception {
		//GlobalVariables.oDriver.quit();
    		}

}
