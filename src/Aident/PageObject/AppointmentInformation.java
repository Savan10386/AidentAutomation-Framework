package Aident.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.*;
import Aident.Globallibrary.GlobalFunction;
import Aident.Globallibrary.GlobalVariables;

public class AppointmentInformation {
	
	public AppointmentInformation()
	{
		if(!GlobalVariables.oDriver.getTitle().equals("Appointment")){
			throw new IllegalStateException("This is not sign in page, current page is: "
                    +GlobalVariables.oDriver.getCurrentUrl());
		}
	}
		
		public void ClickonNewAppointment()
		{
			try
			{
			   Actions action= new Actions(GlobalVariables.oDriver); 
				GlobalVariables.oElement = GlobalVariables.oDriver.findElement(By.className("rsHorizontalHeaderTable"));
			    java.util.List<WebElement> options = GlobalVariables.oElement.findElements(By.tagName("div"));
			    for (WebElement option : options) {
			        if ("NEW PT EXAM".equals(option.getText())) {
			        	// here we use method to save all window id before click (the code I'll show further)
			    		GlobalFunction.saveOldHandles();
			        action.doubleClick(option);
				 action.contextClick(option).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
						 // here we save all window id after click (the code I'll show further)
					    GlobalFunction.saveNewHandles(); 
					 // this method selects and focuses on a new window if it really occurs, and if not it won't do anything (because sometimes we expect opening in new window but it opens in current window) code I'll show further
						GlobalFunction.ifNewWindowOccursFocusOnIt();
						// here we use method to save all window id before click (the code I'll show further)
			    		GlobalFunction.saveOldHandles();
						GlobalVariables.oDriver.findElement(By.className("rmText")).click();
						 // here we save all window id after click (the code I'll show further)
					    GlobalFunction.saveNewHandles(); 
					 // this method selects and focuses on a new window if it really occurs, and if not it won't do anything (because sometimes we expect opening in new window but it opens in current window) code I'll show further
						GlobalFunction.ifNewWindowOccursFocusOnIt();
				

			        }
				
				
			}
			}
			
			catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		public void EditAppointment()
		{
			try
			{
				Actions action= new Actions(GlobalVariables.oDriver);
				Thread.sleep(10000);
				GlobalVariables.oElement = GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_RadPatientScheduler_ctl133_tdMedical"));
				// here we use method to save all window id before click (the code I'll show further)
	    		GlobalFunction.saveOldHandles();
				action.contextClick(GlobalVariables.oElement).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
				 // here we save all window id after click (the code I'll show further)
				Thread.sleep(10000);
			    GlobalFunction.saveNewHandles(); 
			 // this method selects and focuses on a new window if it really occurs, and if not it won't do anything (because sometimes we expect opening in new window but it opens in current window) code I'll show further
				GlobalFunction.ifNewWindowOccursFocusOnIt();
				// here we use method to save all window id before click (the code I'll show further)
	    		GlobalFunction.saveOldHandles();
				GlobalVariables.oElement = GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_RadPatientScheduler_RadSchedulerNoPatientContextMenu_detached"));
			    java.util.List<WebElement> options = GlobalVariables.oElement.findElements(By.tagName("span"));
			    for (WebElement option : options) {
			        if ("Edit".equals(option.getText())) {
			        	option.click();
			        	
			        	break;
			        }
			    }
				 // here we save all window id after click (the code I'll show further)
			    GlobalFunction.saveNewHandles(); 
			 // this method selects and focuses on a new window if it really occurs, and if not it won't do anything (because sometimes we expect opening in new window but it opens in current window) code I'll show further
				GlobalFunction.ifNewWindowOccursFocusOnIt();
			      
			}
			
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		public void AddPatientDetails(String frstname,String lstname,String dob)
		{
			try
			{
				
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_RadPatientScheduler_Form_txtFirstName")).clear();
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_RadPatientScheduler_Form_txtFirstName")).sendKeys(frstname);
			
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_RadPatientScheduler_Form_txtLastName")).clear();
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_RadPatientScheduler_Form_txtLastName")).sendKeys(lstname);
			
			GlobalVariables.oDriver.findElement(By.name("dnn$ctr454$Index$Scheduler$RadPatientScheduler$Form$txtDateofBirth")).clear();
			GlobalVariables.oDriver.findElement(By.name("dnn$ctr454$Index$Scheduler$RadPatientScheduler$Form$txtDateofBirth")).sendKeys(dob);
			GlobalFunction.IncrementNumber();
	        
			GlobalVariables.oElement = 	GlobalVariables.oDriver.findElement(By.name("dnn$ctr454$Index$Scheduler$RadPatientScheduler$Form$txtSSN1"));
			GlobalVariables.oElement.clear();
			GlobalVariables.oElement.sendKeys(GlobalVariables.IncrementByone+"44-97-7612");
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		public void ResponsibleParty(String referralgroup,String referralby)
		{
			try
			{
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_RadPatientScheduler_Form_ddlReferralGroup_Arrow")).click();
			GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_RadPatientScheduler_Form_ddlReferralGroup_DropDown"));                                    
			GlobalFunction.Selectdropdown(referralgroup,"li");
			
			Thread.sleep(10000);
			
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_RadPatientScheduler_Form_ddlReferredBy_Arrow")).click();
			GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_RadPatientScheduler_Form_ddlReferredBy_DropDown"));                                    
			GlobalFunction.Selectdropdown(referralby,"li");
		}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		public void InsuranceInformation(String group, String name, String id)
		{
			try
			{
				
				
				//add Group
				
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_RadPatientScheduler_Form_ddlGroup_Arrow")).click();
				GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_RadPatientScheduler_Form_ddlGroup_DropDown"));                                    
				GlobalFunction.Selectdropdown(group,"li");
				Thread.sleep(10000);
				
				//add Name
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_RadPatientScheduler_Form_ddlName_Arrow")).click();
				GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_RadPatientScheduler_Form_ddlName_DropDown"));                                    
				GlobalFunction.Selectdropdown(name,"li");
				
			
				//Enter Insurance ID
				Thread.sleep(10000);
				GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.name("dnn$ctr454$Index$Scheduler$RadPatientScheduler$Form$txtInsuranceID"));
				GlobalVariables.oElement.sendKeys(id);
										
				//Enter Employer name
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_RadPatientScheduler_Form_txtEmpName")).sendKeys("3 D SYSTEMS INC");
				
			}
	   catch (Exception e) {
		// TODO: handle exception
	}
	}
		public void AddPrefferedComm(String cellphone,String preferredtimeofday)
		{
			try
			{
				GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_RadPatientScheduler_Form_rmtCellPhone"));
				GlobalVariables.oElement.clear();
				GlobalVariables.oElement.sendKeys(cellphone);	
				
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_RadPatientScheduler_Form_ddlPreferredtimeOfDay_Arrow")).click();
				GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_RadPatientScheduler_Form_ddlPreferredtimeOfDay_DropDown"));                                    
				GlobalFunction.Selectdropdown(preferredtimeofday,"li");
				
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
			
		}
		
		public void AddAppointmentDetails(String apptresource,String apptype,String apptcategory, String exproduction)
		{
			try
			{

				
	 			GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_RadPatientScheduler_Form_ddlApptResources_Arrow")).click();
				GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_RadPatientScheduler_Form_ddlApptResources_DropDown"));                                    
				GlobalFunction.Selectdropdown(apptresource,"li");
				
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_RadPatientScheduler_Form_ddlApptType_Arrow")).click();
				GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_RadPatientScheduler_Form_ddlApptType_DropDown"));                                    
				GlobalFunction.Selectdropdown(apptype,"li");
				
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_RadPatientScheduler_Form_ddlApptCategory_Arrow")).click();
				GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_RadPatientScheduler_Form_ddlApptCategory_DropDown"));                                    
				GlobalFunction.Selectdropdown(apptcategory,"li");
				
				GlobalVariables.oDriver.findElement(By.name("dnn$ctr454$Index$Scheduler$RadPatientScheduler$Form$txtExpProduction")).clear();
				GlobalVariables.oDriver.findElement(By.name("dnn$ctr454$Index$Scheduler$RadPatientScheduler$Form$txtExpProduction")).sendKeys(exproduction);
				//Date
				/*GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_RadPatientScheduler_Form_rdpDate_CalendarPopupButton")).click(); 
				GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_RadPatientScheduler_Form_rdpDate_calendar_Top")); 
				GlobalFunction.Selectdropdown(calender,"a");
					

				// Start Time
				GlobalVariables.oDriver.findElement(By.className("rcTimePopup")).click(); 
				GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_RadPatientScheduler_Form_rtpStartTime_timeView")); 
				GlobalFunction.Selectdropdown(starttime,"a");*/
					
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			}
		public void ClickonSave()
		{
			try
			{
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_RadPatientScheduler_Form_InsertButton")).click();
			
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		public void ClickonAddPatientButton()
		{
			try
			{
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_RadPatientScheduler_Form_lnkAddPatient")).click();	
				Thread.sleep(10000);
				
				
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
	}
		

}


