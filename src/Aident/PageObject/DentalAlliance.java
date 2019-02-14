package Aident.PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Aident.Globallibrary.GlobalFunction;
import Aident.Globallibrary.GlobalVariables;

public class DentalAlliance {
	
	public DentalAlliance()
	{
		if(!GlobalVariables.oDriver.getTitle().equals("Aident > Patient Management > Add Patient")){
			throw new IllegalStateException("This is not Home page, current page is: "
                    +GlobalVariables.oDriver.getCurrentUrl());
		}
	}
	
	public void ClickonDentalallianceTab()
	{
	List<WebElement> elements	= GlobalVariables.oDriver.findElements(By.className("rtsTxt"));
	for (WebElement option : elements) {
        if ("DentalAlliance".equals(option.getText())) {
            option.click();
            break;
        }
    }
		
	}
	public void AddDentalInformation(String plantype, String planamount, String planyear, String plansold)
	{
		
		try
		{
			
			
			//Plan Type
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_DentalAlliance_userControl_rcbPlanType_Arrow")).click();
			GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_DentalAlliance_userControl_rcbPlanType_DropDown"));                                    
			GlobalFunction.Selectdropdown(plantype,"li");
			Thread.sleep(1000);
			
			GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_DentalAlliance_userControl_txtPlanAmount"));
			GlobalVariables.oElement.clear();
			GlobalVariables.oElement.sendKeys(planamount);
			
			Thread.sleep(1000);
			//GlobalFunction.WaitforPageLoad("dnn_ctr1018_PatientDetails_DentalAlliance_userControl_lblPlaninfo");
			
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_DentalAlliance_userControl_rcbPlanYear_Arrow")).click();
			GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_DentalAlliance_userControl_rcbPlanYear_DropDown"));
			GlobalFunction.Selectdropdown(planyear,"li");
			
			
			//GlobalFunction.WaitforPageLoad("dnn_ctr1018_PatientDetails_DentalAlliance_userControl_lblPlaninfo");
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_DentalAlliance_userControl_rcbPlanSoldBy_Arrow")).click();
			GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_DentalAlliance_userControl_rcbPlanSoldBy_DropDown"));                                    
			GlobalFunction.Selectdropdown(plansold,"li");
			Thread.sleep(1000);
			//GlobalFunction.WaitforPageLoad("dnn_ctr1018_PatientDetails_DentalAlliance_userControl_lblPlaninfo");
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		}
	public void ClickonSaveDental()
	{
		try
		{
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_DentalAlliance_userControl_DentalSave")).click();	
			Thread.sleep(1000);
			//GlobalFunction.WaitforPageLoad("dnn_ctr1018_PatientDetails_DentalAlliance_userControl_lblPlaninfo");
		}
		
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
