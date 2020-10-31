package week2.Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead 
{
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriverManager.chromedriver().setup();
	ChromeDriver Driver = new ChromeDriver();
	Driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS); 
	Driver.get("http://leaftaps.com/opentaps/control/main"); // Launch the browser
	Driver.manage().window().maximize(); // Maximize the browser
	Driver.findElementById("username").sendKeys("demosalesmanager"); //Enter the username
	Driver.findElementById("password").sendKeys("crmsfa"); // Enter the password
	Driver.findElementByClassName("decorativeSubmit").click(); // Click Login
	Driver.findElementByLinkText("CRM/SFA").click(); //Click crm/sfa link
	Driver.findElementByLinkText("Leads").click(); // Click Leads link
	Driver.findElementByLinkText("Find Leads").click(); //Click Find leads

	Thread.sleep(3000);
	Driver.findElementByXPath("(//a[text()[normalize-space()='Find Leads']]/following::input[@name='firstName'])[3]").sendKeys("Sivakumar"); //Enter first name
	Thread.sleep(3000);
	Driver.findElementByXPath("//button[text()='Find Leads']").click(); //Click Find leads button
	Thread.sleep(3000);
	Driver.findElementByXPath("((//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]))").click(); //Click on first resulting lead
	
	Thread.sleep(3000);
	WebElement FirstLeadID = Driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)");
	String FirstLeadID_Value = FirstLeadID.getText();
	System.out.println("the value of FirstLeadID: " +FirstLeadID_Value );
	
	/*Thread.sleep(3000);
	//Verify title of the page
	String title=Driver.getTitle();
	if (title.equalsIgnoreCase("View Lead | opentaps CRM"))
	{ 		System.out.println(title); 	}
	else
	{ 		System.out.println("Wrong page"); 	}
	*/
	Thread.sleep(3000);
	Driver.findElementByClassName("subMenuButtonDangerous").click(); //Click DELETE Button
	Driver.findElementByLinkText("Find Leads").click(); //Click Find leads
	Driver.findElementByXPath("((//span[text()='Advanced']/following::input)[1])").sendKeys(FirstLeadID_Value); //Enter captured lead ID
	Thread.sleep(3000);
	Driver.findElementByXPath("//button[text()='Find Leads']").click(); //Click Find leads button
	
	//Verify message "No records to display" in the Lead List. This message confirms the successful deletion
	String Rec_Results= Driver.findElementByClassName("x-paging-info").getText();
	if (Rec_Results.equals("No records to display")) 
	{	System.out.println("Text matched");		} 
	else 
	{	System.out.println("Text not matched");	}
	
	Driver.close(); //Close the browser (Do not log out)

	}

}
