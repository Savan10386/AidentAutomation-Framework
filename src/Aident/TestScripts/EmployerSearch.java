package Aident.TestScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Aident.Globallibrary.GenericFunction;
import Aident.Globallibrary.GlobalVariables;
import Aident.PageObject.AdvanceSearch;
import Aident.PageObject.PatientTabPopUp;
import Aident.PageObject.SigninPage;

public class EmployerSearch {
	@BeforeClass
	public void setUp() throws Exception {
		
		GenericFunction.GetTestData("login","LoginData.xml");
		GenericFunction.GetTestData("Patient","LoginData.xml");
		GenericFunction.GetTestData("PopUp","PatientPopup.xml");
		GlobalVariables.oDriver = new InternetExplorerDriver();
	     GlobalVariables.oDriver.get(GlobalVariables.LoginURL);
		
	}
	
	@Test
	public void testLogin() throws Exception {
		try
		{
			SigninPage sp = new SigninPage();
			sp.loginValidUser(GlobalVariables.testData.get("username"),GlobalVariables.testData.get("password"));
			 Assert.assertTrue(GlobalVariables.oDriver.getTitle().equals("Advance Search"));
			 AdvanceSearch as = new AdvanceSearch();
			 as.SearchPatient(GlobalVariables.testData.get("search"));
			 PatientTabPopUp pt = new PatientTabPopUp();
			 pt.ClickonEmployerEmergencyTab();
			 pt.ClkonEmployerSrchBtton();
			 pt.EnterEmployer();
		    
			
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
