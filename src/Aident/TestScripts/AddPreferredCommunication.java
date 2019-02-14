package Aident.TestScripts;

import static org.junit.Assert.assertTrue;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.junit.Assert;
import Aident.Globallibrary.GenericFunction;
import Aident.Globallibrary.GlobalVariables;
import Aident.PageObject.AdvanceSearch;
import Aident.PageObject.PatientTabPopUp;
import Aident.PageObject.SigninPage;

public class AddPreferredCommunication {
	
	@BeforeClass
	public void setUp() throws Exception {
		File file = new File("C:/Users/Savan/Desktop/selenium-2.33.0/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		GenericFunction.GetTestData("login","LoginData.xml");
		GenericFunction.GetTestData("Patient","LoginData.xml");
		GenericFunction.GetTestData("PopUp","PatientPopup.xml");
		GlobalVariables.oDriver = new InternetExplorerDriver();
	     GlobalVariables.oDriver.get(GlobalVariables.LoginURL);
		
	}
	
	@Test
	public void testSearchPatient() throws Exception {
		try
		{
			 SigninPage sp = new SigninPage();
			 sp.loginValidUser(GlobalVariables.testData.get("username"),GlobalVariables.testData.get("password"));
			 Assert.assertTrue(GlobalVariables.oDriver.getTitle().equals("Advance Search"));
			 AdvanceSearch as = new AdvanceSearch();
			 as.SearchPatient(GlobalVariables.testData.get("search"));
		     assertTrue("Search Patient",GlobalVariables.oDriver.getTitle().equals("Aident > Patient Management > Add Patient"));
		     PatientTabPopUp pt = new PatientTabPopUp();
		     pt.AddPrefferedmethod();
		     Assert.assertTrue(GlobalVariables.oDriver.getTitle().equals("Aident > Patient Management > Add Patient"));  
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
