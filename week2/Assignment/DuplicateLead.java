package week2.Assignment;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead 
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
	Driver.findElementByXPath("((//span[@class='x-tab-strip-inner']//span)[3])").click(); //Click on Email
	Driver.findElementByClassName("emailAddress").sendKeys("123@testleaf.com"); // Enter Email ID
	Driver.findElementByXPath("//button[text()='Find Leads']").click(); //Click find leads button
		
	Thread.sleep(3000);
		String b=getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a");
		
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a");
		clickByLink("Duplicate Lead");
		verifyTextByXpath("//div[contains(text(),'Duplicate Lead')]", "Duplicate Lead");
		clickByName("submitButton");
		verifyTextById("viewLead_firstName_sp", b);
		closeAllBrowsers();
	}
}
/*
(//span[@class='x-tab-strip-inner']//span)[3]
			8	
			9	
			10	
			11	Capture name of First Resulting lead
			12	Click First Resulting lead
			13	Click Duplicate Lead
			14	Verify the title as 'Duplicate Lead'
			15	Click Create Lead
			16	Confirm the duplicated lead name is same as captured name
			17	Close the browser (Do not log out)
*/