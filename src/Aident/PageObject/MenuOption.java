package Aident.PageObject;

import org.openqa.selenium.By;
import Aident.Globallibrary.GlobalFunction;
import Aident.Globallibrary.GlobalVariables;

public class MenuOption {
	public MenuOption()
	{
		if(!GlobalVariables.oDriver.getTitle().equals("Advance Search")){
			throw new IllegalStateException("This is not Home page, current page is: "
                    +GlobalVariables.oDriver.getCurrentUrl());
		}
	}
		
		public void SelectScheduler(String scheduler) {
			try
			{

				GlobalVariables.oDriver.findElement(By.id("dnn_ctr417_ControlBar_ddlPages_Input")).click();
				GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr417_ControlBar_ddlPages_DropDown"));                                    
				GlobalFunction.Selectdropdown(scheduler,"li");
				Thread.sleep(10000);
				
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		
	}
		public void ClickAppointment() {
			try
			{	
				
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}	
			public void ClickReschedule()
			{
				try
				{
					
					GlobalVariables.oDriver.findElement(By.id("dnn_ctr449_ControlBar_dltMenu_imgChildTab_3")).click();	
					Thread.sleep(10000);
				}
				catch (Exception e) {
					// TODO: handle exception
				}
			}
	
}


