package Aident.PageObject;

import org.openqa.selenium.By;
import Aident.Globallibrary.GlobalVariables;

public class MedicalHistory {
	
	public MedicalHistory()
	{
		if(!GlobalVariables.oDriver.getTitle().equals("Aident > Patient Management > Add Patient")){
			throw new IllegalStateException("This is not Advance Search Page, current page is: "
                    +GlobalVariables.oDriver.getCurrentUrl());
		}
	}
	
	public void ClickonMHistoryIcon()
	{
		try
		{
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr418_ControlBar_dltMenu_imgChildTab_1")).click();	
			Thread.sleep(10000);	
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void AddAllergies()
	{
		try
		{
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr1107_MedicalHistory_ctlAlerts_dlAllergies_chkAllergies_3")).click();
			Thread.sleep(10000);
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr1107_MedicalHistory_ctlAlerts_dlAllergies_chkAllergies_8")).click();	
			Thread.sleep(10000);
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr1107_MedicalHistory_ctlAlerts_dlAllergies_chkAllergies_1")).click();	
			Thread.sleep(10000);
		}
		
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void AddMedicalAlert()
	{
		try
		{
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr1107_MedicalHistory_ctlAlerts_dlMedicalAlerts_chkMedicalAlerts_0")).click();
			Thread.sleep(10000);
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr1107_MedicalHistory_ctlAlerts_dlMedicalAlerts_chkMedicalAlerts_31")).click();	
			Thread.sleep(10000);
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr1107_MedicalHistory_ctlAlerts_dlMedicalAlerts_chkMedicalAlerts_8")).click();	
			Thread.sleep(10000);
		}
		
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void ClickOnSave()
 	{
 		try
 		{
 			GlobalVariables.oDriver.findElement(By.id("dnn_ctr1107_MedicalHistory_ctlAlerts_lnkbtnSaveAlerts")).click();
 		}
 		catch (Exception e) {
 			// TODO: handle exception
 		}
 	}
	
}


