package Aident.TestScripts;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Aident.Globallibrary.GenericFunction;
import Aident.Globallibrary.GlobalVariables;
import Aident.PageObject.AddNotes;
import Aident.PageObject.AdvanceSearch;
import Aident.PageObject.FindAppointment;
import Aident.PageObject.MenuOption;
import Aident.PageObject.SigninPage;

public class AddNotesAlert {
	
	@BeforeClass
	public void setUp() throws Exception {
	
		File file = new File("C:/Users/Savan/Desktop/selenium-2.33.0/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		GenericFunction.GetTestData("login","LoginData.xml");
		GenericFunction.GetTestData("Patient","LoginData.xml");
		GenericFunction.GetTestData("Notes","Alerts.xml");
		GlobalVariables.oDriver = new InternetExplorerDriver();
	     GlobalVariables.oDriver.get(GlobalVariables.LoginURL);
		
	}
	
	@Test
	public void testFilterView() throws Exception {
		try
		{
			SigninPage sp = new SigninPage();
			 sp.loginValidUser(GlobalVariables.testData.get("username"),GlobalVariables.testData.get("password"));
			 Assert.assertTrue(GlobalVariables.oDriver.getTitle().equals("Advance Search"));
			 AdvanceSearch as = new AdvanceSearch();
			 as.SearchPatient(GlobalVariables.testData.get("search"));
	         Assert.assertTrue(GlobalVariables.oDriver.getTitle().equals("Aident > Patient Management > Add Patient"));
		     AddNotes an = new AddNotes();
		     an.ClickonNotesIcon();
		     an.AddNewNotes(GlobalVariables.testData.get("category"),GlobalVariables.testData.get("subcategory"),GlobalVariables.testData.get("template"));
		     an.ClickOnSave();
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
