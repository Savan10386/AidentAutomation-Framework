package Aident.Globallibrary;



import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
public class GlobalFunction {
	
	//here we make a fields where id's will store
	public static Set setOfOldHandles = null;
	public static Set setOfNewHandles = null;
	private static Function<WebDriver, Object> ExpectedConditions; 
	
	public static void Selectdropdown(String value, String tagname)
	
	{
		
		List<WebElement> options = GlobalVariables.oElement.findElements(By.tagName(tagname));

	    for (WebElement option : options) {
	        if (value.equals(option.getText())) {
	            option.click();
	            break;
	        }
	    }
	}
	
	public static void IncrementNumber()
	{
		GlobalVariables.IncrementByone = (int )(Math.random() * 50 + 1);
	}
	
	

	// first we clear (just in case) our set. Empty set can't be cleared so we put an "if" statement. 
	public static void saveOldHandles() {
	        if (setOfOldHandles != null) {
	            setOfOldHandles.clear();
	        }
	        setOfOldHandles = GlobalVariables.oDriver.getWindowHandles(); // here we save id's of windows
	    }


	// just the same for new set of id's

	public static void saveNewHandles() {
	        if (setOfNewHandles != null) {
	            setOfNewHandles.clear();
	        }
	        setOfNewHandles = GlobalVariables.oDriver.getWindowHandles();
	    }

	// here is the code of method which decides whether to focus on a new window or not
	
	public static void ifNewWindowOccursFocusOnIt(){
	      if (setOfNewHandles != null) {
	          setOfNewHandles.removeAll(setOfOldHandles); // this method removeAll() take one set and puts it in another set and if there are same positions it will erase them and leaves only that are not equals
	        }
	        else {

	      System.out.println("setOfNewHandles is null. Can't compare old and new handles. New handle may have not enough time to load and save. Maybe you should add some time to load new window by adding Thread.Sleep(3000); - wait for 3 second ");
	      }

	      if (!setOfNewHandles.isEmpty()) {
	            String newWindowHandle = (String) setOfNewHandles.iterator().next(); // here IF we have new window it will shift on it
	          GlobalVariables.oDriver.switchTo().window(newWindowHandle);
	        }        
	    }
	/*public static void WaitforPageLoad(String str)
	{
		WebDriverWait wd = new WebDriverWait(GlobalVariables.oDriver, 10);
		wd.until(org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated(By.id(str)));
		
	
	
	}*/
	
	public static void Logout()
	{
		 GlobalVariables.oDriver.findElement(By.id("dnn_ctr417_ControlBar_lnkLogOut")).click();
	}
	
	}
	


