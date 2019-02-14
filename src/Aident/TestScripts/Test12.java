package Aident.TestScripts;

import java.io.File;

import org.openqa.selenium.ie.InternetExplorerDriver;

import Aident.Globallibrary.GlobalVariables;

public class Test12 {
	
	public static void main(String args [])
	
	{
		File file = new File("C:/Users/Savan/Desktop/DESKTOP/seleniumdot net/IEDriverServer.exe");
		
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		
		GlobalVariables.oDriver = new InternetExplorerDriver();
		
		GlobalVariables.oDriver.get("http://www.gmail.com/");
		
		GlobalVariables.oDriver.findElementByCssSelector("html body div.wrapper div.main.content.clearfix div.card.signin-card.clearfix form#gaia_loginform input#Email").sendKeys("Test");
		
		
	}

}
