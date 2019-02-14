package Aident.TestScripts;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import Aident.Globallibrary.GenericFunction;
import Aident.Globallibrary.GlobalVariables;
import Aident.PageObject.AdvanceSearch;
import Aident.PageObject.DentalAlliance;
import Aident.PageObject.SigninPage;
import org.testng.annotations.*;

public class AddDentalAlliance {
	@BeforeClass
	public void setUp() throws Exception {
		
		File file = new File("C:/Users/Savan/Desktop/selenium-2.33.0/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		GenericFunction.GetTestData("login","LoginData.xml");
		GenericFunction.GetTestData("Patient","LoginData.xml");
		GlobalVariables.oDriver = new InternetExplorerDriver();
	     GlobalVariables.oDriver.get(GlobalVariables.LoginURL);
		
	}
	
	@org.testng.annotations.Test
	public void testDentalAlliance() throws Exception {
		try
		{
			SigninPage sp = new SigninPage();
			sp.loginValidUser(GlobalVariables.testData.get("username"),GlobalVariables.testData.get("password"));
			org.testng.Assert.assertTrue(GlobalVariables.oDriver.getTitle().equals("Advance Search"));
			 AdvanceSearch as = new AdvanceSearch();
			 as.ClickonAdvanceSearch();
			 org.testng.Assert.assertTrue(GlobalVariables.oDriver.getTitle().equals("Advance Search"));
			 
			 as.SearchPatient(GlobalVariables.testData.get("search"));
			 org.testng.Assert.assertTrue(GlobalVariables.oDriver.getTitle().equals("Aident > Patient Management > Add Patient"));
			 DentalAlliance da = new DentalAlliance();
			 da.ClickonDentalallianceTab();
			 //assertEquals("Plan Information",GlobalVariables.oDriver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[2]/td/div/div/table/tbody/tr/td[3]/div/div/div[2]/div/div[2]/div/div/table/tbody/tr[2]/td/table/tbody/tr/td/div/div/div/div/div/div/div[2]/div/div/div/span")).getText());
			 da.AddDentalInformation(GlobalVariables.testData.get("plantype"),GlobalVariables.testData.get("planamount"),GlobalVariables.testData.get("planyear"),GlobalVariables.testData.get("plansoldby"));
			 da.ClickonSaveDental();
			String str= GlobalVariables.oDriver.findElement(By.className("SuccessfulRegistrationMessage1")).getText();
			org.testng.Assert.assertEquals("Dental Alliance saved successfully",str);
			
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

