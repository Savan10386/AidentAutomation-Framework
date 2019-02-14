package Aident.PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Aident.Globallibrary.GlobalFunction;
import Aident.Globallibrary.GlobalVariables;

public class AdvanceSearch {
	
	public AdvanceSearch()
	{
		if(!GlobalVariables.oDriver.getTitle().equals("Advance Search")){
			throw new IllegalStateException("This is not Advance Search Page, current page is: "
                    +GlobalVariables.oDriver.getCurrentUrl());
		}
	}
		
	public void ClickonAdvanceSearch() {
		try
		{
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr417_ControlBar_dltMainMenu_imgParentTab_1")).click();
			 Thread.sleep(2000);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void SearchPatient(String PatientID)
	{
		try
		{
		
		GlobalVariables.oDriver.findElement(By.id("dnn_ctr407_AdvanceSearch_txtPatientId")).sendKeys(PatientID);
		// here we use method to save all window id before click (the code I'll show further)
		GlobalFunction.saveOldHandles();
	    GlobalVariables.oDriver.findElement(By.id("dnn_ctr407_AdvanceSearch_btnAdvanceSearch")).click();
	 // here we save all window id after click (the code I'll show further)
	    GlobalFunction.saveNewHandles(); 
	 // this method selects and focuses on a new window if it really occurs, and if not it won't do anything (because sometimes we expect opening in new window but it opens in current window) code I'll show further
		GlobalFunction.ifNewWindowOccursFocusOnIt();   
		Thread.sleep(5000);
		//GlobalFunction.WaitforPageLoad("dnn_ctr414_ProfileHeader_lblInputPatientID");
	  GlobalVariables.oElement =  GlobalVariables.oDriver.findElement(By.id("dnn_ctr407_AdvanceSearch_lnkYesButton"));
	  GlobalVariables.oElement.click();
	    Thread.sleep(5000);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
