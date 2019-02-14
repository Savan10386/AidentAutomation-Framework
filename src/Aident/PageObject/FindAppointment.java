package Aident.PageObject;

import java.awt.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Aident.Globallibrary.GlobalFunction;
import Aident.Globallibrary.GlobalVariables;

public class FindAppointment {
	
	public FindAppointment()
	{
		if(!GlobalVariables.oDriver.getTitle().equals("Appointment")){
			throw new IllegalStateException("This is not Home page, current page is: "
                    +GlobalVariables.oDriver.getCurrentUrl());
		}
	}
	
	public void SearchCategory()
	{
		try
		{
			//Select Category
		GlobalVariables.oDriver.findElement(By.id("dnn_ctr453_AdvanceSearch_ddlCategory_Arrow")).click();
        GlobalVariables.oElement = GlobalVariables.oDriver.findElement(By.id("dnn_ctr453_AdvanceSearch_ddlCategory_DropDown"));
		GlobalFunction.Selectdropdown("MEDI-CAL","li");
		Thread.sleep(1000);
		
		   
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
		
		public void EnterPatientID()
		{
			try
			{
				//Enter Patient ID
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr453_AdvanceSearch_txtPatientId")).sendKeys("TES-00350");
				
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			}
		public void ClickonSearch()
		{
			try
			{
				//click on search
				GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr453_AdvanceSearch_pnlAdvanceSearch"));
				GlobalFunction.Selectdropdown("Search","a");
				
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		public void DayviewSearch()
		{
			try
			{
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr451_ResourceFilter_rbtnDayView")).click();
			GlobalVariables.oElement = GlobalVariables.oDriver.findElement(By.id("dnn_ctr451_ResourceFilter_pnlDayView"));
			GlobalFunction.Selectdropdown("Go","a");
				
			}
			
			catch(Exception e)
			{
				
			}
		}
		

		public void WeekviewSearch()
		{
			try
			{
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr451_ResourceFilter_rbtWeekView")).click();
			GlobalVariables.oElement = GlobalVariables.oDriver.findElement(By.id("dnn_ctr451_ResourceFilter_pnlWeekView"));
			GlobalFunction.Selectdropdown("Go", "a");
						
			}
			
			catch(Exception e)
			{
				
			}
		}
}
		




