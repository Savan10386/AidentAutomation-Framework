package Aident.TestScripts;


import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Aident.Globallibrary.GenericFunction;
import Aident.Globallibrary.GlobalVariables;
import Aident.PageObject.AdvanceSearch;
import Aident.PageObject.PatientTabPopUp;
import Aident.PageObject.SigninPage;

public class AddressSearchPopup {
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
			 Assert.assertTrue(GlobalVariables.oDriver.getTitle().equals("Aident > Patient Management > Add Patient"));
		     PatientTabPopUp pt = new PatientTabPopUp();
		     pt.AddressPopup(GlobalVariables.testData.get("pstate"),GlobalVariables.testData.get("pcity"));
		     pt.UseSpecificAddress();
		     pt.SelectAddresstoUse();
		     GlobalVariables.oElement = GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rgAddressSearch_ctl00__0"));
				java.util.List<WebElement> options = GlobalVariables.oElement.findElements(By.tagName("td"));
				for (WebElement option : options) {
			        if ("6406 IVY LN".equals(option.getText())) 
			        	 Assert.assertEquals("6406"+" "+"IVY"+" "+"LN",option.getText());
			        
			       else if ("GREENBELT1".equals(option.getText())) 
			        	Assert.assertEquals("GREENBELT",option.getText());
			           
			        
			        else if ("MD1".equals(option.getText())) 
			        	Assert.assertEquals("MD",option.getText());   	    
				}
				
		     pt.ClickonUsethisAddress();
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


