package Aident.PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Aident.Globallibrary.GlobalFunction;
import Aident.Globallibrary.GlobalVariables;

public class PatientTabPopUp {
	
	public PatientTabPopUp()
	{
		if(!GlobalVariables.oDriver.getTitle().equals("Aident > Patient Management > Add Patient")){
			throw new IllegalStateException("This is not Home page, current page is: "
                    +GlobalVariables.oDriver.getCurrentUrl());
		}
	}
	
	
	public void ClickonEmployerEmergencyTab()
	{
	List<WebElement> elements	= GlobalVariables.oDriver.findElements(By.className("rtsTxt"));
	for (WebElement option : elements) {
        if ("EmployerEmergencyContact".equals(option.getText())) {
            option.click();
            break;
        }
    }
		
	}
	
	public void ClickonInsuranceTab()
	{
	List<WebElement> elements	= GlobalVariables.oDriver.findElements(By.className("rtsTxt"));
	for (WebElement option : elements) {
        if ("Insurance".equals(option.getText())) {
            option.click();
            break;
        }
    }
		
	}

	public void AddressPopup(String state,String city) {
		try
		{
			// here we use method to save all window id before click (the code I'll show further)
			GlobalFunction.saveOldHandles();
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_lnkAddressSearch")).click();
			// here we save all window id after click (the code I'll show further)
		    GlobalFunction.saveNewHandles(); 
		    // this method selects and focuses on a new window if it really occurs, and if not it won't do anything (because sometimes we expect opening in new window but it opens in current window) code I'll show further
			GlobalFunction.ifNewWindowOccursFocusOnIt();
			
			//Select State
			GlobalVariables.oDriver.findElement(By.name("dnn$ctr1018$PatientDetails$PatientInformation_userControl$ddlSearchState")).clear();
			GlobalVariables.oDriver.findElement(By.name("dnn$ctr1018$PatientDetails$PatientInformation_userControl$ddlSearchState")).sendKeys(state);
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_ddlSearchState_Arrow")).click();
			GlobalVariables.oElement = GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_ddlSearchState_DropDown"));
			GlobalFunction.Selectdropdown(state,"li");
			//Select City
			GlobalVariables.oDriver.findElement(By.name("dnn$ctr1018$PatientDetails$PatientInformation_userControl$ddlSearchCity")).clear();
			GlobalVariables.oDriver.findElement(By.name("dnn$ctr1018$PatientDetails$PatientInformation_userControl$ddlSearchCity")).sendKeys(city);
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_ddlSearchCity_Arrow")).click();
			GlobalVariables.oElement = GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_ddlSearchCity_DropDown"));
			GlobalFunction.Selectdropdown(city,"li");
			Thread.sleep(10000);
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void UseSpecificAddress()
	{
		try
		{
			// Click on Search
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_lnkAddSearch")).click();
			Thread.sleep(10000);
			//Select specific address
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rgAddressSearch_ctl00__0")).click();
			Thread.sleep(10000);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
		public void SelectAddresstoUse(){
			try
			{
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rgAddresstoUse_ctl00_ctl04_rdAddressToUse")).click();
			Thread.sleep(10000);
			
		}
		
		
		catch (Exception e) {
			// TODO: handle exception
		}
	}
		public void ClickonUsethisAddress()
		{
			try
			{
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_Image1")).click();	
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
	
	public void AddPrefferedmethod()
	{
		try
		{
			// here we use method to save all window id before click (the code I'll show further)
			GlobalFunction.saveOldHandles();
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_lnkAddCommunication")).click();
			// here we save all window id after click (the code I'll show further)
		    GlobalFunction.saveNewHandles(); 
		    // this method selects and focuses on a new window if it really occurs, and if not it won't do anything (because sometimes we expect opening in new window but it opens in current window) code I'll show further
			GlobalFunction.ifNewWindowOccursFocusOnIt();
			//Add Type
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_ddlCommunicationType_Arrow")).click();
            GlobalVariables.oElement = GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_ddlCommunicationType_DropDown"));
            GlobalFunction.Selectdropdown("CellPhone","li");
            //Enter Cell no
            GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rmtCommunicationNumber")).sendKeys("965-365-2794");
            //Click checkbox
            GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_chkCommunicationDefault")).click();
            //Click Add
            GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_btnAddCommunication")).click();
            Thread.sleep(5000);
            //Click ok
            GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_lnkOkCommunication")).click();
            	
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void ClkonEmployerSrchBtton()
	{
	  try
	  {
		// here we use method to save all window id before click (the code I'll show further)
			GlobalFunction.saveOldHandles();
		  GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_EmployerEmergencyContact_userControl_btnSearch")).click();
	  }
	  
	  catch (Exception e) {
		// TODO: handle exception
	}
		
	}
	
	public void EnterEmployer()
	{
		// here we save all window id after click (the code I'll show further)
	    GlobalFunction.saveNewHandles(); 
	    // this method selects and focuses on a new window if it really occurs, and if not it won't do anything (because sometimes we expect opening in new window but it opens in current window) code I'll show further
		GlobalFunction.ifNewWindowOccursFocusOnIt();
		GlobalVariables.oDriver.findElement(By.name("dnn$ctr1018$PatientDetails$EmployerEmergencyContact_userControl$txtEmpSearchName")).clear();
		GlobalVariables.oDriver.findElement(By.name("dnn$ctr1018$PatientDetails$EmployerEmergencyContact_userControl$txtEmpSearchName")).sendKeys("3-D PACKAGING");
		
		GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_EmployerEmergencyContact_userControl_txtEmpAddress1")).clear();
		GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_EmployerEmergencyContact_userControl_txtEmpAddress2")).clear();
		
		GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_EmployerEmergencyContact_userControl_rcbEmpSearchState_Input")).clear();
		GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_EmployerEmergencyContact_userControl_rcbEmpSearchState_Input")).sendKeys("SELECT");
		GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_EmployerEmergencyContact_userControl_rcbEmpSearchState_Arrow")).click();
        GlobalVariables.oElement = GlobalVariables.oDriver.findElement(By.className("rcbList"));
        GlobalFunction.Selectdropdown("SELECT","li");
        GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_EmployerEmergencyContact_userControl_txtEmpPhone_text")).clear();
		GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_EmployerEmergencyContact_userControl_btnEmpSearch")).click();
		GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_EmployerEmergencyContact_userControl_rgEmpSearch_ctl00_ctl04_rdEmpSearch")).click();
		GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_EmployerEmergencyContact_userControl_divEmpSearchOk")).click();
	}
	
	}
	