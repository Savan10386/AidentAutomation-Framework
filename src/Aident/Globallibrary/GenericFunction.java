package Aident.Globallibrary;

import java.io.File;
import java.util.Calendar;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
public class GenericFunction
{
	
	public static String WeekName =null ;
	public static int day =0 ;
	public static void GetCurrentDate()
	{
		
		Calendar now = Calendar.getInstance();
		day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK)-1;
		if(week == 1)
			WeekName = "Mon";
		if(week == 2)
			WeekName = "Tue";
		if(week == 3)
			WeekName = "Wed";
		if(week == 4)
			WeekName = "Thu";
		if(week == 5)
			WeekName = "Fri";
		if(week == 6)
			WeekName = "Sat";
		if(week == 7)
			WeekName = "Sun";
			
				
			}
	public static void GetTestData(String ParentTag,String xmlfile)
	{
		
		try
		{
		File fXmlFile = new File("C:/Users/Savan/Desktop/Aident Automation Framework123/TestData/"+xmlfile);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();
		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		 
		NodeList nList = doc.getElementsByTagName(ParentTag);
	 
		System.out.println("----------------------------");
	 
		for (int temp = 0; temp < nList.getLength(); temp++) {
	 
			Node nNode = nList.item(temp);
	 
			System.out.println("\nCurrent Element :" + nNode.getNodeName());
			  
			   
	 
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				if (ParentTag =="login")
				{
				 
				 GlobalVariables.testData.put("username", eElement.getElementsByTagName("username").item(0).getTextContent());
				 GlobalVariables.testData.put("password", eElement.getElementsByTagName("password").item(0).getTextContent());
				}
				else if (ParentTag =="Patient")
				{
				 GlobalVariables.testData.put("firstname", eElement.getElementsByTagName("Firstname").item(0).getTextContent());
				 GlobalVariables.testData.put("lastname", eElement.getElementsByTagName("Lastname").item(0).getTextContent());
				 GlobalVariables.testData.put("dob", eElement.getElementsByTagName("Dob").item(0).getTextContent());
				 GlobalVariables.testData.put("gender", eElement.getElementsByTagName("Gender").item(0).getTextContent());
				 GlobalVariables.testData.put("lang", eElement.getElementsByTagName("Language").item(0).getTextContent());
				 GlobalVariables.testData.put("martialstatus", eElement.getElementsByTagName("Martialstatus").item(0).getTextContent());
				 GlobalVariables.testData.put("address", eElement.getElementsByTagName("Address").item(0).getTextContent());
				 GlobalVariables.testData.put("state", eElement.getElementsByTagName("State").item(0).getTextContent());
				 GlobalVariables.testData.put("city", eElement.getElementsByTagName("City").item(0).getTextContent());
				 GlobalVariables.testData.put("zip", eElement.getElementsByTagName("Zip").item(0).getTextContent());
				 GlobalVariables.testData.put("house", eElement.getElementsByTagName("House").item(0).getTextContent());
				 GlobalVariables.testData.put("provider", eElement.getElementsByTagName("Provider").item(0).getTextContent());
				 GlobalVariables.testData.put("consultant", eElement.getElementsByTagName("Consultant").item(0).getTextContent());
				 GlobalVariables.testData.put("cellno", eElement.getElementsByTagName("CellNo").item(0).getTextContent());
				 GlobalVariables.testData.put("preffcomm", eElement.getElementsByTagName("Preferredconsultant").item(0).getTextContent());
				 GlobalVariables.testData.put("recallinfo", eElement.getElementsByTagName("RecallInfo").item(0).getTextContent());
				 GlobalVariables.testData.put("respparty", eElement.getElementsByTagName("Respparty").item(0).getTextContent());
				 GlobalVariables.testData.put("referralgroup", eElement.getElementsByTagName("Referralgroup").item(0).getTextContent());
				 GlobalVariables.testData.put("referredby", eElement.getElementsByTagName("Referredby").item(0).getTextContent());
				 GlobalVariables.testData.put("empname", eElement.getElementsByTagName("EmpName").item(0).getTextContent());
				 GlobalVariables.testData.put("occupation", eElement.getElementsByTagName("Occupation").item(0).getTextContent());
				 GlobalVariables.testData.put("years", eElement.getElementsByTagName("years").item(0).getTextContent());
				 GlobalVariables.testData.put("emergender", eElement.getElementsByTagName("EmerGender").item(0).getTextContent());
				 GlobalVariables.testData.put("emerfrstname", eElement.getElementsByTagName("EmerFrstname").item(0).getTextContent());
				 GlobalVariables.testData.put("emerlstname", eElement.getElementsByTagName("EmerLstname").item(0).getTextContent());
				 GlobalVariables.testData.put("emercellno", eElement.getElementsByTagName("EmerCellno").item(0).getTextContent());
				 GlobalVariables.testData.put("emerreal", eElement.getElementsByTagName("EmerReal").item(0).getTextContent());
				 GlobalVariables.testData.put("group", eElement.getElementsByTagName("Group").item(0).getTextContent());
				 GlobalVariables.testData.put("name", eElement.getElementsByTagName("Name").item(0).getTextContent());
				 GlobalVariables.testData.put("insuranceid", eElement.getElementsByTagName("InsuranceID").item(0).getTextContent());
				 GlobalVariables.testData.put("subscribertype", eElement.getElementsByTagName("SubscriberType").item(0).getTextContent());
				 GlobalVariables.testData.put("iempname", eElement.getElementsByTagName("IEmpName").item(0).getTextContent());
				 GlobalVariables.testData.put("plantype", eElement.getElementsByTagName("PlanType").item(0).getTextContent());
				 GlobalVariables.testData.put("planamount", eElement.getElementsByTagName("Planamount").item(0).getTextContent());
				 GlobalVariables.testData.put("planyear", eElement.getElementsByTagName("Planyear").item(0).getTextContent());
				 GlobalVariables.testData.put("plansoldby", eElement.getElementsByTagName("PlansoldBy").item(0).getTextContent());
				 GlobalVariables.testData.put("search", eElement.getElementsByTagName("Searchpatient").item(0).getTextContent());
			}
			else if (ParentTag =="PopUp")
			{
				 GlobalVariables.testData.put("pstate", eElement.getElementsByTagName("PState").item(0).getTextContent());
				 GlobalVariables.testData.put("pcity", eElement.getElementsByTagName("PCity").item(0).getTextContent());
				 
			
			}
			else if (ParentTag =="Notes")
			{
				 GlobalVariables.testData.put("category", eElement.getElementsByTagName("Category").item(0).getTextContent());
				 GlobalVariables.testData.put("subcategory", eElement.getElementsByTagName("Subcategory").item(0).getTextContent());
				 GlobalVariables.testData.put("template", eElement.getElementsByTagName("Template").item(0).getTextContent());
			}
			else if(ParentTag =="PatientAlert")
			{

				 GlobalVariables.testData.put("type", eElement.getElementsByTagName("Type").item(0).getTextContent());
				 GlobalVariables.testData.put("note", eElement.getElementsByTagName("Note").item(0).getTextContent());	
			}
			else if (ParentTag =="AccountAlert")
			{
				GlobalVariables.testData.put("type", eElement.getElementsByTagName("Type").item(0).getTextContent());
				 GlobalVariables.testData.put("note", eElement.getElementsByTagName("Note").item(0).getTextContent());
				
			}
			else if (ParentTag =="Appointment")
			{
				GlobalVariables.testData.put("scheduler", eElement.getElementsByTagName("MenuOption").item(0).getTextContent());
				GlobalVariables.testData.put("firstname", eElement.getElementsByTagName("Firstname").item(0).getTextContent());
				GlobalVariables.testData.put("lastname", eElement.getElementsByTagName("Lastname").item(0).getTextContent());
				GlobalVariables.testData.put("dob", eElement.getElementsByTagName("Dob").item(0).getTextContent());
				GlobalVariables.testData.put("referralgroup", eElement.getElementsByTagName("RefferedGroup").item(0).getTextContent());
				GlobalVariables.testData.put("referredby", eElement.getElementsByTagName("RefferedBy").item(0).getTextContent());
				GlobalVariables.testData.put("group", eElement.getElementsByTagName("Group").item(0).getTextContent());
				GlobalVariables.testData.put("name", eElement.getElementsByTagName("Name").item(0).getTextContent());
				GlobalVariables.testData.put("insuranceid", eElement.getElementsByTagName("InsuranceID").item(0).getTextContent());
				GlobalVariables.testData.put("cellno", eElement.getElementsByTagName("CellNo").item(0).getTextContent());
				GlobalVariables.testData.put("preffcomm", eElement.getElementsByTagName("Preferredconsultant").item(0).getTextContent());
				GlobalVariables.testData.put("apptresource", eElement.getElementsByTagName("ApptResource").item(0).getTextContent());
				GlobalVariables.testData.put("appttype", eElement.getElementsByTagName("ApptType").item(0).getTextContent());
				 GlobalVariables.testData.put("apptcategory", eElement.getElementsByTagName("ApptCategory").item(0).getTextContent()); 
				 GlobalVariables.testData.put("expprod", eElement.getElementsByTagName("ExpProd").item(0).getTextContent()); 
			}
		}
	}	
		
				
			}
	
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	

}
