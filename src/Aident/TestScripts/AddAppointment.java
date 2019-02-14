package Aident.TestScripts;

import java.awt.List;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.internal.seleniumemulation.ShiftKeyDown;
import org.openqa.selenium.internal.seleniumemulation.ShiftKeyUp;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Aident.Globallibrary.GenericFunction;
import Aident.Globallibrary.GlobalFunction;
import Aident.Globallibrary.GlobalVariables;
import Aident.PageObject.AppointmentInformation;
import Aident.PageObject.MenuOption;
import Aident.PageObject.RestingScheduler;
import Aident.PageObject.SigninPage;




public class AddAppointment {
	
	@BeforeTest
	public void setUp() throws Exception {
		File file = new File("C:/Users/Savan/Desktop/selenium-2.33.0/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		GenericFunction.GetTestData("login","LoginData.xml");
		GenericFunction.GetTestData("Appointment","Scheduler.xml");
		GlobalVariables.oDriver = new InternetExplorerDriver();
	     GlobalVariables.oDriver.get(GlobalVariables.LoginURL);
		
	}
	
	@Test
	public void testAddAppointments() throws Exception {
		try
		{
			 SigninPage sp = new SigninPage();
			 sp.loginValidUser(GlobalVariables.testData.get("username"),GlobalVariables.testData.get("password"));
			 MenuOption mo = new MenuOption();
			 mo.SelectScheduler(GlobalVariables.testData.get("scheduler"));
			 AppointmentInformation ai = new AppointmentInformation();
			 ai.ClickonNewAppointment();
			 ai.AddPatientDetails(GlobalVariables.testData.get("firstname"),GlobalVariables.testData.get("lastname"),GlobalVariables.testData.get("dob"));
			 ai.ResponsibleParty(GlobalVariables.testData.get("referralgroup"),GlobalVariables.testData.get("referredby"));
			 ai.InsuranceInformation(GlobalVariables.testData.get("group"),GlobalVariables.testData.get("name"),GlobalVariables.testData.get("insuranceid"));
			 ai.AddPrefferedComm(GlobalVariables.testData.get("cellno"),GlobalVariables.testData.get("preffcomm"));
			 ai.AddAppointmentDetails(GlobalVariables.testData.get("apptresource"),GlobalVariables.testData.get("appttype"),GlobalVariables.testData.get("apptcategory"),GlobalVariables.testData.get("expprod"));
			 ai.ClickonSave();
	         String str = GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_RadPatientScheduler_ctl133_lblName")).getText();
	         Assert.assertEquals("TestAuto123,, TestAuto123  (NEW)",str);
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
