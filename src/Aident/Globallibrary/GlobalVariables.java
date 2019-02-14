package Aident.Globallibrary;

import java.util.Hashtable;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class GlobalVariables {
	
	public static InternetExplorerDriver oDriver = null;
	public static String LoginURL = "http://172.16.0.6:8090/login.aspx";
	public static WebElement oElement = null; 
	public static int IncrementByone = 0;
	public static Hashtable<String,String> testData=new Hashtable<String,String>();

}
