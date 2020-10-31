package week2.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead 
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
	
	//Verify title of the page
	String title=Driver.getTitle();
	if (title.equalsIgnoreCase("View Lead | opentaps CRM"))
	{ 		System.out.println(title); 	}
	else
	{ 		System.out.println("Wrong page"); 	}

	Driver.findElementByXPath("(//a[@class='subMenuButton'])[3]").click();
	//Driver.findElementByXPath("(//a[@class='subMenuButton']/following-sibling::a)[2])").click(); //Click Edit
	Driver.findElementById("updateLeadForm_lastNameLocal").clear();
	Driver.findElementById("updateLeadForm_lastNameLocal").sendKeys("Jeeva");//Change the Local name
	Driver.findElementByXPath("//input[@value='Update']").click(); //Click Update
	
	//Confirm the changed name appears
	String lastNameLocal = Driver.findElementById("viewLead_lastNameLocal_sp").getText();
	if (lastNameLocal=="Jeeva") 
	{	System.out.println("Changes are Updated");	}
	else
	{	System.out.println("Changes are not Updated");	}
	 Driver.close(); //Close the browser (Do not log out)
	}
}
