package Aident.PageObject;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Aident.Globallibrary.GlobalFunction;
import Aident.Globallibrary.GlobalVariables;


public class PatientInformation {
	
	public PatientInformation(String title)
	{
		if(!GlobalVariables.oDriver.getTitle().equals(title)){
			throw new IllegalStateException("This is not Home page, current page is: "
                    +GlobalVariables.oDriver.getCurrentUrl());
		}
	}
		
		public void Clickaddpatient() {
			try
			{
				// Click on Add Patient
				GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr417_ControlBar_tblMainMenu"));                                    
				List<WebElement> options = GlobalVariables.oElement.findElements(By.tagName("img"));
				 for (WebElement option : options) {
				      option.click();
				      Thread.sleep(2000);
				            break;    		
			}
				 
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
		
	}
		public void AddPatientinformation(String firstname,String lastname,String dob,String gender,String lang,String martialstatus)
		{
			try
			{
				//Enter First and Last name
			
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_txtFirstName")).sendKeys(firstname);	
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_txtLastName")).sendKeys(lastname);
				
				//Enter DOB
				
				GlobalVariables.oElement = GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rdtBirthDate_dateInput_text"));
				GlobalVariables.oElement.clear();
				GlobalVariables.oElement.sendKeys(dob);
				
				//Enter SSN
				
				GlobalFunction.IncrementNumber();
				             
				GlobalVariables.oElement = 	GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_txtSSN1"));
				GlobalVariables.oElement.clear();
				GlobalVariables.oElement.sendKeys(GlobalVariables.IncrementByone+"55-97-7812");
				
				//Enter Gender
				
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rcbGender_Arrow")).click();
				GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rcbGender_DropDown"));                                    
				GlobalFunction.Selectdropdown(gender,"li");
				
				//Enter Lang
				
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rcbLanguage_Arrow")).click();
				GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rcbLanguage_DropDown"));                                    
				GlobalFunction.Selectdropdown(lang,"li");
				
				//Enter Chart no
				
				GlobalFunction.IncrementNumber();
				
				
			//	GlobalVariables.oElement =  GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_txtChart"));
			//	GlobalVariables.oElement.clear();
				//GlobalVariables.oElement.sendKeys(GlobalVariables.IncrementByone+"-7");
				
				//Enter Martial status
				
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rcbMaritalStatus_Arrow")).click();
				GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rcbMaritalStatus_DropDown"));                                    
				GlobalFunction.Selectdropdown(martialstatus,"li");
				
				
			}
			
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		public void Addadress(String address1, String state, String city, String zip, String house )
		{
			try
			{
				//Enter Address
			GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_txtAddress"));
			GlobalVariables.oElement.clear();	
			GlobalVariables.oElement.sendKeys(address1);
			
			//Enter state
			
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_ttrState_Arrow")).click();
			GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_ttrState_DropDown"));                                    
			GlobalFunction.Selectdropdown(state,"li");
			
			//Enter city
			
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_ttrCity_Arrow")).click();
			GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_ttrCity_DropDown"));
			GlobalFunction.Selectdropdown(city,"li");
			
			//Enter zip
			
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rcbZipCode_Input")).click();
			GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rcbZipCode_DropDown"));                                    
			GlobalFunction.Selectdropdown(zip,"li");
			
			//Enter house
			
			GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rcbHouse_Arrow")).click();
			GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rcbHouse_DropDown"));                                    
			GlobalFunction.Selectdropdown(house,"li");
							
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			}
		
		public void AddPrefferedComm(String cellphone,String daytocontact)
		{
			try
			{
				//Cellphone details
				GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rmtCellPhone"));
				GlobalVariables.oElement.clear();
				GlobalVariables.oElement.sendKeys(cellphone);	
				//preferred time to contact
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rcbPreferredtimeOfDay_Arrow")).click();
				GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rcbPreferredtimeOfDay_DropDown"));                                    
				GlobalFunction.Selectdropdown(daytocontact,"li");
				
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
			
		}
		
		public void AddProvider(String provider,String txconsultant)
		{
			try
			{
				//provider details
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rcbProvider_Arrow")).click();
				GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rcbProvider_DropDown"));                                    
				GlobalFunction.Selectdropdown(provider,"li");
				
				//txconsultant details
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rcbTxConsultant_Arrow")).click();
				GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rcbTxConsultant_DropDown"));                                    
				GlobalFunction.Selectdropdown(txconsultant,"li");
				
			}

			catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		public void AddAppointment(String appointment)
		{
			
			try
			{
				//appointment details
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rcbRecallType_Arrow")).click();
				GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rcbRecallType_DropDown"));                                    
				GlobalFunction.Selectdropdown(appointment,"li");
			}
			
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		public void AddResponsibleparty(String relationtype, String referralgroup, String referredby)
		{
			try
			{
				//Enter relationtype
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rcbRelationType_Arrow")).click();
				GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rcbRelationType_DropDown"));                                    
				GlobalFunction.Selectdropdown(relationtype,"li");
				//Enter referralgroup
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rcbReferralGroup_Arrow")).click();
				GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rcbReferralGroup_DropDown"));                                    
				GlobalFunction.Selectdropdown(referralgroup,"li");
				
				Thread.sleep(10000);
				//GlobalFunction.WaitforPageLoad("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rcbReferralGroup_Arrow");
				//Enter refferedby
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rcbReferredBy_Arrow")).click();
				GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_rcbReferredBy_DropDown"));                                    
				GlobalFunction.Selectdropdown(referredby,"li");

			   				
			}
			
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		public void ClickonNext()
		{
			try
			{
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_PatientInformation_userControl_ptSave")).click();	
			   Thread.sleep(10000);
				//GlobalFunction.WaitforPageLoad("dnn_ctr1018_PatientDetails_EmployerEmergencyContact_userControl_txtEmployerMonths");
		     
			}
			
			catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		public void AddEmployerInformation(String employername, String employeroccupation, String month )
		{
			try
			{
				
				System.out.println("Employer");
				// Enter Employer Name
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_EmployerEmergencyContact_userControl_rcbEmployerName1_Arrow")).click();
				GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_EmployerEmergencyContact_userControl_rcbEmployerName1_DropDown"));                                    
				GlobalFunction.Selectdropdown(employername,"li");
				//Enter Occupation
				GlobalVariables.oElement = GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_EmployerEmergencyContact_userControl_txtEmployerOccuptation"));
				GlobalVariables.oElement.clear();
				GlobalVariables.oElement.sendKeys(employeroccupation);		
				//Enter Month(s)
				GlobalVariables.oElement = GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_EmployerEmergencyContact_userControl_txtEmployerMonths"));
				GlobalVariables.oElement.clear();
				GlobalVariables.oElement.sendKeys(month);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		public void AddEmergency(String Gender,String frstname,String lstname,String cllphone ,String relationtopatient)
		{
			try
			{
				//Select Gender
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_EmployerEmergencyContact_userControl_rcbGender_Arrow")).click();
				GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_EmployerEmergencyContact_userControl_rcbGender_DropDown"));                                    
				GlobalFunction.Selectdropdown(Gender,"li");
				
				//Enter First name
				GlobalVariables.oElement = GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_EmployerEmergencyContact_userControl_txtEmergencyFirstName"));
				GlobalVariables.oElement.clear();
				GlobalVariables.oElement.sendKeys(frstname);
				
				//Enter Last name
				GlobalVariables.oElement = GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_EmployerEmergencyContact_userControl_txtEmergencyLastName"));
				GlobalVariables.oElement.clear();
				GlobalVariables.oElement.sendKeys(lstname);
				
              //Enter Phone no
				GlobalVariables.oElement = GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_EmployerEmergencyContact_userControl_txtEmergencyCellPhoneContact"));
				GlobalVariables.oElement.clear();
				GlobalVariables.oElement.sendKeys(cllphone);
				
				 //Enter Relation to Patient
				GlobalVariables.oElement = GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_EmployerEmergencyContact_userControl_txtEmergencyRelationship"));
				GlobalVariables.oElement.clear();
				GlobalVariables.oElement.sendKeys(relationtopatient);
				
			}
			
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		public void ClickonNextEmployer()
		{
			try
			{
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_EmployerEmergencyContact_userControl_empSave")).click();	
			}
			
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		public void AddPrimaryInsuranceInformation(String grp,String name,String insuranceid,String subscribertype, String Employername)
		{
			try
			{
				
				Thread.sleep(10000);
				//GlobalFunction.WaitforPageLoad("dnn_ctr1018_PatientDetails_Insurance_userControl_txtPrimaryInsuranceID");
				//add Group
				
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_Insurance_userControl_ddlPrimaryGroup_Arrow")).click();
				GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_Insurance_userControl_ddlPrimaryGroup_DropDown"));                                    
				GlobalFunction.Selectdropdown(grp,"li");
				
				
				//add Name
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_Insurance_userControl_ddlPrimaryName_Arrow")).click();
				GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_Insurance_userControl_ddlPrimaryName_DropDown"));                                    
				GlobalFunction.Selectdropdown(name,"li");
				
			
				//Enter Insurance ID
				Thread.sleep(10000);
				//GlobalFunction.WaitforPageLoad("dnn_ctr1018_PatientDetails_Insurance_userControl_txtPrimaryInsuranceID");
				GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_Insurance_userControl_txtPrimaryInsuranceID"));
				GlobalVariables.oElement.clear();
				GlobalVariables.oElement.sendKeys(insuranceid);
				
				//Enter Insurance Subscriber information
				
				Thread.sleep(10000);
				//GlobalFunction.WaitforPageLoad("dnn_ctr1018_PatientDetails_Insurance_userControl_txtPrimaryInsuranceID");
				
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_Insurance_userControl_rcbprimarySubcriberType_Arrow")).click();
				GlobalVariables.oElement =GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_Insurance_userControl_rcbprimarySubcriberType_DropDown"));                                    
				GlobalFunction.Selectdropdown(subscribertype,"li");
				
				
				//Enter Employer name
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_Insurance_userControl_ddlPrimaryEmployerName_Input")).clear();
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_Insurance_userControl_ddlPrimaryEmployerName_Input")).sendKeys(Employername);
				
			}
	   catch (Exception e) {
		// TODO: handle exception
	}
	}
		
		public void ClickonSave()
		{
			try
			{
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr1018_PatientDetails_Insurance_userControl_insSave")).click();	
				Thread.sleep(10000);
				//GlobalFunction.WaitforPageLoad("dnn_ctr1018_PatientDetails_Insurance_userControl_txtPrimaryInsuranceID");
			}
			
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
		
		
		}
		
		
	


