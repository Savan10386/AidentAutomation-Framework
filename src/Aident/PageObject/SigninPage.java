package Aident.PageObject;


import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.By;
import Aident.Globallibrary.*;
public class SigninPage {
	
	private By username  = By.id("dnn_ctr415_SignIn_txtEmpolyeeId");
	
	public SigninPage()
	{
		if(!GlobalVariables.oDriver.getTitle().equals("Login")){
			throw new IllegalStateException("This is not sign in page, current page is: "
                    +GlobalVariables.oDriver.getCurrentUrl());
		}
	}
		
		public void loginValidUser(String userName, String password) {
			try
			{
				
				GlobalVariables.oDriver.findElement(username).sendKeys(userName);
				GlobalVariables.oDriver.findElement(By.id("dnn_ctr415_SignIn_txtPassword")).sendKeys(password);
				GlobalVariables.oElement = GlobalVariables.oDriver.findElement(By.name("dnn$ctr415$SignIn$imgbtnSignIn"));
				GlobalVariables.oElement.click();
				Thread.sleep(5000);
				
				//GlobalFunction.WaitforPageLoad("dnn_ctr417_ControlBar_dltMainMenu_imgParentTab_0");
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

		


