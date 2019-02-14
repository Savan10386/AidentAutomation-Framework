package Aident.PageObject;

import org.openqa.selenium.By;
import Aident.Globallibrary.GlobalVariables;

public class ReScheduleAppointment {
	
	public ReScheduleAppointment()
	{
		if(!GlobalVariables.oDriver.getTitle().equals("Reschedule")){
			throw new IllegalStateException("This is not Reschedule page, current page is: "
                    +GlobalVariables.oDriver.getCurrentUrl());
		}
	}
	public void Reschedule()
	{
		try
		{
		GlobalVariables.oDriver.findElement(By.id("dnn_ctr488_ReScheduler_rblApptType_0")).click();
		GlobalVariables.oDriver.findElement(By.id("dnn_ctr488_ReScheduler_txtPatientID")).sendKeys("SIN-00403");
		GlobalVariables.oDriver.findElement(By.id("dnn_ctr488_ReScheduler_chkAllAppt")).click();
		GlobalVariables.oDriver.findElement(By.id("dnn_ctr488_ReScheduler_lnkFind")).click();
		Thread.sleep(10000);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void FutureAppointment()
	{
		try
		{
		GlobalVariables.oDriver.findElement(By.id("dnn_ctr488_ReScheduler_rblApptType_1")).click();
		Thread.sleep(500);
		GlobalVariables.oDriver.findElement(By.id("dnn_ctr488_ReScheduler_txtPatientID")).sendKeys("SIN-00403");
		GlobalVariables.oDriver.findElement(By.id("dnn_ctr488_ReScheduler_chkAllAppt")).click();
		GlobalVariables.oDriver.findElement(By.id("dnn_ctr488_ReScheduler_lnkFind")).click();
		Thread.sleep(10000);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void FamilyAppointment()
	{
		try
		{
		GlobalVariables.oDriver.findElement(By.id("dnn_ctr488_ReScheduler_rblApptType_2")).click();
		GlobalVariables.oDriver.findElement(By.id("dnn_ctr488_ReScheduler_txtPatientID")).sendKeys("MAH-00648");
		GlobalVariables.oDriver.findElement(By.id("dnn_ctr488_ReScheduler_chkAllAppt")).click();
		GlobalVariables.oDriver.findElement(By.id("dnn_ctr488_ReScheduler_lnkFind")).click();
		Thread.sleep(10000);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
