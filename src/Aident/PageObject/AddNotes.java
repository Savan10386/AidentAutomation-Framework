package Aident.PageObject;

import org.openqa.selenium.By;

import Aident.Globallibrary.GlobalFunction;
import Aident.Globallibrary.GlobalVariables;

public class AddNotes {
	
	public AddNotes()
	{
		if(!GlobalVariables.oDriver.getTitle().equals("Aident > Patient Management > Add Patient")){
			throw new IllegalStateException("This is not Advance Search Page, current page is: "
                    +GlobalVariables.oDriver.getCurrentUrl());
		}
	}
	
	public void ClickonNotesIcon()
	{
		try
		{
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr418_ControlBar_dltMenu_imgChildTab_10")).click();	
				
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void AddNewNotes(String category,String Subcategory,String Template)
	{
		try
		{
			//Add New Notes
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr1177_Notes_rgNotes_ctl00_ctl02_ctl00_AddNewRecordButton")).click();
			
			Thread.sleep(10000);
			//Add Category
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr1177_Notes_rgNotes_ctl00_ctl02_ctl03_rcbNoteCategory_Arrow")).click();
	        GlobalVariables.oElement = GlobalVariables.oDriver.findElement(By.id("dnn_ctr1177_Notes_rgNotes_ctl00_ctl02_ctl03_rcbNoteCategory_DropDown"));
			GlobalFunction.Selectdropdown(category,"li");
			Thread.sleep(10000);
			//Add Sub Category
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr1177_Notes_rgNotes_ctl00_ctl02_ctl03_rcbSubCategory_Arrow")).click();
	        GlobalVariables.oElement = GlobalVariables.oDriver.findElement(By.id("dnn_ctr1177_Notes_rgNotes_ctl00_ctl02_ctl03_rcbSubCategory_DropDown"));
			GlobalFunction.Selectdropdown(Subcategory,"li");
			Thread.sleep(10000);
			//Add Template
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr1177_Notes_rgNotes_ctl00_ctl02_ctl03_rcbNoteTemplate_Arrow")).click();
	        GlobalVariables.oElement = GlobalVariables.oDriver.findElement(By.id("dnn_ctr1177_Notes_rgNotes_ctl00_ctl02_ctl03_rcbNoteTemplate_DropDown"));
			GlobalFunction.Selectdropdown(Template,"li");
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
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr1177_Notes_rgNotes_ctl00_ctl02_ctl03_divSavenotes")).click();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	}

