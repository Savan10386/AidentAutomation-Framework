package Aident.PageObject;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;


import Aident.Globallibrary.GlobalFunction;
import Aident.Globallibrary.GlobalVariables;

public class RestingScheduler {
	
	
	public RestingScheduler()
	{
		if(!GlobalVariables.oDriver.getTitle().equals("Appointment")){
			throw new IllegalStateException("This is not Home page, current page is: "
                    +GlobalVariables.oDriver.getCurrentUrl());
		}
	}
	
	public void AddNewAppointment() {
		try
		{
		// here we use method to save all window id before click (the code I'll show further)
		GlobalFunction.saveOldHandles();
		GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_rgResting_ctl00_ctl03_ctl01_InitInsertButton")).click();
		Thread.sleep(10000);
		// here we save all window id after click (the code I'll show further)
	    GlobalFunction.saveNewHandles(); 
	    // this method selects and focuses on a new window if it really occurs, and if not it won't do anything (because sometimes we expect opening in new window but it opens in current window) code I'll show further
		GlobalFunction.ifNewWindowOccursFocusOnIt(); 
		
		//Keyboard Keyboard = null ;
		//Mouse mouse = null;
		/*WebDriver driver = null;
		Actions action= new Actions(driver); 
		WebElement webelement = GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_rgResting_ctl00_ctl04_lblPatient"));
		WebElement webelement1 = GlobalVariables.oDriver.findElement(By.className("rsAlt"));
		action.doubleClick(webelement1);*/

		        }                  
		   		
		
		catch (Exception e) {
			// TODO: handle exception
		}
	
}
	public void PatientDetails(String frstname,String lstname,String dob)
	{
		try
		{
		GlobalVariables.oDriver.findElement(By.name("dnn$ctr454$Index$Scheduler$rgResting$ctl00$ctl02$ctl01$txtFirstName")).sendKeys(frstname);
		GlobalVariables.oDriver.findElement(By.name("dnn$ctr454$Index$Scheduler$rgResting$ctl00$ctl02$ctl01$txtLastName")).sendKeys(lstname);
		GlobalVariables.oDriver.findElement(By.name("dnn$ctr454$Index$Scheduler$rgResting$ctl00$ctl02$ctl01$txtDateofBirth")).sendKeys(dob);
		GlobalFunction.IncrementNumber();
        
		GlobalVariables.oElement = 	GlobalVariables.oDriver.findElement(By.name("dnn$ctr454$Index$Scheduler$rgResting$ctl00$ctl02$ctl01$txtSSN1"));
		GlobalVariables.oElement.clear();
		GlobalVariables.oElement.sendKeys(GlobalVariables.IncrementByone+"55-97-7812");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	public void ResponsibleParty(String referralgroup,String referralby)
	{
		try
		{
		GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_rgResting_ctl00_ctl02_ctl01_ddlReferralGroup_Arrow")).click();
		GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_rgResting_ctl00_ctl02_ctl01_ddlReferralGroup_DropDown"));                                    
		GlobalFunction.Selectdropdown(referralgroup,"li");
		
		Thread.sleep(10000);
		
		GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_rgResting_ctl00_ctl02_ctl01_ddlReferredBy_Arrow")).click();
		GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_rgResting_ctl00_ctl02_ctl01_ddlReferredBy_DropDown"));                                    
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
			
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_rgResting_ctl00_ctl02_ctl01_ddlGroup_Arrow")).click();
			GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_rgResting_ctl00_ctl02_ctl01_ddlGroup_DropDown"));                                    
			GlobalFunction.Selectdropdown(group,"li");
			Thread.sleep(10000);
			
			//add Name
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_rgResting_ctl00_ctl02_ctl01_ddlName_Arrow")).click();
			GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_rgResting_ctl00_ctl02_ctl01_ddlName_DropDown"));                                    
			GlobalFunction.Selectdropdown(name,"li");
			
		
			//Enter Insurance ID
			Thread.sleep(10000);
			GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.name("dnn$ctr454$Index$Scheduler$rgResting$ctl00$ctl02$ctl01$txtInsuranceID"));
			GlobalVariables.oElement.sendKeys(id);
									
			//Enter Employer name
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_rgResting_ctl00_ctl02_ctl01_txtEmpName")).sendKeys("3 D SYSTEMS INC");
			
		}
   catch (Exception e) {
	// TODO: handle exception
}
}
	public void AddPrefferedComm(String cellphone,String preferredtimeofday)
	{
		try
		{
			GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_rgResting_ctl00_ctl02_ctl01_rmtCellPhone"));
			GlobalVariables.oElement.clear();
			GlobalVariables.oElement.sendKeys(cellphone);	
			
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_rgResting_ctl00_ctl02_ctl01_ddlPreferredtimeOfDay_Arrow")).click();
			GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_rgResting_ctl00_ctl02_ctl01_ddlPreferredtimeOfDay_DropDown"));                                    
			GlobalFunction.Selectdropdown(preferredtimeofday,"li");
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	public void AddAppointmentDetails(String apptresource,String apptype,String apptcategory,String priority,String calender,String starttime)
	{
		try
		{

			
 			GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_rgResting_ctl00_ctl02_ctl01_ddlApptResources_Arrow")).click();
			GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_rgResting_ctl00_ctl02_ctl01_ddlApptResources_DropDown"));                                    
			GlobalFunction.Selectdropdown(apptresource,"li");
			
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_rgResting_ctl00_ctl02_ctl01_ddlApptType_Arrow")).click();
			GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_rgResting_ctl00_ctl02_ctl01_ddlApptType_DropDown"));                                    
			GlobalFunction.Selectdropdown(apptype,"li");
			
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_rgResting_ctl00_ctl02_ctl01_ddlApptCategory_Arrow")).click();
			GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_rgResting_ctl00_ctl02_ctl01_ddlApptCategory_DropDown"));                                    
			GlobalFunction.Selectdropdown(apptcategory,"li");
			
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_rgResting_ctl00_ctl02_ctl01_ddlPriority_Arrow")).click();
			GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_rgResting_ctl00_ctl02_ctl01_ddlPriority_DropDown"));                                    
			GlobalFunction.Selectdropdown(priority,"li");
			
			GlobalVariables.oDriver.findElement(By.name("dnn$ctr454$Index$Scheduler$rgResting$ctl00$ctl02$ctl01$txtExpProduction")).sendKeys("100");
			//Date
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_rgResting_ctl00_ctl02_ctl01_rdpDate_CalendarPopupButton")).click(); 
			GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_rgResting_ctl00_ctl02_ctl01_rdpDate_calendar_Top")); 
			GlobalFunction.Selectdropdown(calender,"a");
				

			// Start Time
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_rgResting_ctl00_ctl02_ctl01_rtpStartTime_timePopupLink")).click(); 
			GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_rgResting_ctl00_ctl02_ctl01_rtpStartTime_timeView")); 
			GlobalFunction.Selectdropdown(starttime,"a");
				
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		}
	public void ClickonSave()
	{
		try
		{
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr454_Index_Scheduler_rgResting_ctl00_ctl02_ctl01_InsertButton")).click();
		
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	}
	

	


