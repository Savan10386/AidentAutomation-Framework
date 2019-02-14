package Aident.TestScripts;

import java.io.File;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import Aident.Globallibrary.GenericFunction;
import Aident.Globallibrary.GlobalFunction;
import Aident.Globallibrary.GlobalVariables;
import Aident.PageObject.AdvanceSearch;
import Aident.PageObject.PatientInformation;
import Aident.PageObject.SigninPage;
import org.testng.Assert;
import org.testng.annotations.*;

public class Login {
	
	@BeforeTest
	public void setUp() throws Exception {
		
		File file = new File("C:/Users/Savan/Desktop/selenium-2.33.0/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		GenericFunction.GetTestData("login","LoginData.xml");
		GlobalVariables.oDriver = new InternetExplorerDriver();
	     GlobalVariables.oDriver.get(GlobalVariables.LoginURL);
		
	}
	
	
 @Test
	public void testLogin() throws Exception {
		try
		{
			 SigninPage sp = new SigninPage();
			 sp.loginValidUser(GlobalVariables.testData.get("username"),GlobalVariables.testData.get("password"));
			 Assert.assertEquals("Advance Search",GlobalVariables.oDriver.getTitle());
			 GlobalFunction.Logout();
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

