package Aident.TestScripts;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Aident.Globallibrary.GenericFunction;
import Aident.Globallibrary.GlobalVariables;
import Aident.PageObject.AdvanceSearch;
import Aident.PageObject.PatientTabPopUp;
import Aident.PageObject.PatientInformation;
import Aident.PageObject.SigninPage;

public class EditPatient {
	

	@BeforeTest
	public void setUp() throws Exception {
		
		File file = new File("C:/Users/Savan/Desktop/selenium-2.33.0/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		GenericFunction.GetTestData("login","LoginData.xml");
		GenericFunction.GetTestData("Patient","LoginData.xml");
		GlobalVariables.oDriver = new InternetExplorerDriver();
	     GlobalVariables.oDriver.get(GlobalVariables.LoginURL);
		
	}
	
	@Test
	public void testSearchPatient() throws Exception {
		try
		{
			SigninPage sp = new SigninPage();
			sp.loginValidUser(GlobalVariables.testData.get("username"),GlobalVariables.testData.get("password"));
			AdvanceSearch as = new AdvanceSearch();
			as.SearchPatient(GlobalVariables.testData.get("search"));
			PatientInformation pi = new PatientInformation("Aident > Patient Management > Add Patient");
			PatientTabPopUp epd = new PatientTabPopUp();
			// Add Address
			pi.Addadress(GlobalVariables.testData.get("address"),GlobalVariables.testData.get("state"),GlobalVariables.testData.get("city"),GlobalVariables.testData.get("zip"),GlobalVariables.testData.get("house"));
			 //Add preffered method of communication
			 pi.AddPrefferedComm(GlobalVariables.testData.get("cellno"),GlobalVariables.testData.get("preffcomm"));
			//click on next button
			  pi.ClickonNext();
			 epd.ClickonEmployerEmergencyTab();
			//Enter Employer tab.
			 pi.AddEmployerInformation(GlobalVariables.testData.get("empname"),GlobalVariables.testData.get("occupation"),GlobalVariables.testData.get("years"));
			 pi.ClickonNextEmployer();
			 epd.ClickonInsuranceTab();
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
