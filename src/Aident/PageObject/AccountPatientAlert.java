package Aident.PageObject;

import org.openqa.selenium.By;

import Aident.Globallibrary.GlobalFunction;
import Aident.Globallibrary.GlobalVariables;

public class AccountPatientAlert {
	
	
		
		public AccountPatientAlert()
		{
			if(!GlobalVariables.oDriver.getTitle().equals("Aident > Patient Management > Add Patient")){
				throw new IllegalStateException("This is not Advance Search Page, current page is: "
	                    +GlobalVariables.oDriver.getCurrentUrl());
			}
		}
		
		public void ClickonAlertIcon()
		{
			try
			{
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr418_ControlBar_dltMenu_imgChildTab_0")).click();	
				Thread.sleep(10000);	
				
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
	

 public void AddAccountAlert(String type,String note)
{
	try
	{
		//Add New alert
		GlobalVariables.oDriver.findElement(By.id("dnn_ctr1179_AccountAlerts_rgAccountAlerts_ctl00_ctl02_ctl00_InitInsertButton")).click();
		
		Thread.sleep(5000);
		//Add type
		GlobalVariables.oDriver.findElement(By.id("dnn_ctr1179_AccountAlerts_rgAccountAlerts_ctl00_ctl02_ctl03_rcbOption_Arrow")).click();
        GlobalVariables.oElement = GlobalVariables.oDriver.findElement(By.id("dnn_ctr1179_AccountAlerts_rgAccountAlerts_ctl00_ctl02_ctl03_rcbOption_DropDown"));
		GlobalFunction.Selectdropdown(type,"li");
		
		Thread.sleep(5000);
		//Add Notes

        GlobalVariables.oDriver.findElement(By.id("dnn_ctr1179_AccountAlerts_rgAccountAlerts_ctl00_ctl02_ctl03_txtNote")).sendKeys(note);
		
        Thread.sleep(5000);

	}
	
	catch (Exception e) {
		// TODO: handle exception
	}
}
 
 public void ClickOnAccountSave()
	{
		try
		{
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr1179_AccountAlerts_rgAccountAlerts_ctl00_ctl02_ctl03_divSavenotes")).click();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
 
 public void AddPatientAlert(String type,String notes)
 {
 	try
 	{
 		//Add New alert
 		GlobalVariables.oDriver.findElement(By.id("dnn_ctr1179_AccountAlerts_rgPatientAlerts_ctl00_ctl02_ctl00_InitInsertButton")).click();
 		
 		Thread.sleep(5000);
 		//Add type
 		GlobalVariables.oDriver.findElement(By.id("dnn_ctr1179_AccountAlerts_rgPatientAlerts_ctl00_ctl02_ctl03_rcbPatientOption_Arrow")).click();
         GlobalVariables.oElement = GlobalVariables.oDriver.findElement(By.id("dnn_ctr1179_AccountAlerts_rgPatientAlerts_ctl00_ctl02_ctl03_rcbPatientOption_DropDown"));
 		GlobalFunction.Selectdropdown(type,"li");
 		Thread.sleep(5000);
 		//Add Notes

         GlobalVariables.oDriver.findElement(By.id("dnn_ctr1179_AccountAlerts_rgPatientAlerts_ctl00_ctl02_ctl03_txtPatientNote")).sendKeys(notes);
 		
         Thread.sleep(5000);

 	}
 	
 	catch (Exception e) {
 		// TODO: handle exception
 	}
 }
  
  public void ClickOnPatientSave()
 	{
 		try
 		{
 			GlobalVariables.oDriver.findElement(By.id("dnn_ctr1179_AccountAlerts_rgPatientAlerts_ctl00_ctl02_ctl03_divSavenotes")).click();
 		}
 		catch (Exception e) {
 			// TODO: handle exception
 		}
 	}
}




