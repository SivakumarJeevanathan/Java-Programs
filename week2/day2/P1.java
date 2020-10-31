package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS); 
		Driver.get("http://leaftaps.com/opentaps/control/main");
		System.out.println("\t* * * RESULTS * * *");
		System.out.println("The tilte of the page is:  " +Driver.getTitle());
		Driver.manage().window().maximize();
		WebElement UName = Driver.findElementById("username");
		UName.sendKeys("demosalesmanager");
		System.out.println("The Value is entered into UserName field");
		
		Driver.findElementById("password").sendKeys("crmsfa");
		System.out.println("The Value is entered into Password field");
		
		Driver.findElementByClassName("decorativeSubmit").click();
		System.out.println("The Login button is clicked");
		System.out.println("The tilte of the page is:  " +Driver.getTitle());
		
		Driver.findElementByLinkText("CRM/SFA").click();
		System.out.println("The LINK on the the page is clicked");
		
		Driver.findElementByLinkText("Leads").click();
		System.out.println("The LEADS TAB is clicked");
		
		Driver.findElementByLinkText("Create Lead").click();
		System.out.println("The CREATE LEAD under the LEADS TAB is clicked");
		
		Driver.findElementById("createLeadForm_companyName").sendKeys("COGNIZANT TECHNOLOGY SOLUTIONS");
		Driver.findElementById("createLeadForm_firstName").sendKeys("Sivakumar");
		Driver.findElementById("createLeadForm_lastName").sendKeys("Jeevanathan");
		 
		
		System.out.println("The tilte of the page is:  " +Driver.getTitle());
		
		/*
		WebElement Source = Driver.findElementById("createLeadForm_dataSourceId");
		Select DD_Source = new Select(Source);
		DD_Source.selectByValue("LEAD_EMPLOYEE");
		
		Driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Siva");
		Driver.findElementById("createLeadForm_lastNameLocal").sendKeys("J");
		Driver.findElementById("createLeadForm_personalTitle").sendKeys("MR.");
		Driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mr.");
		Driver.findElementById("createLeadForm_annualRevenue").sendKeys("300000000");
		
		WebElement industry = Driver.findElementById("createLeadForm_industryEnumId");
		Select DD_Industry = new Select(industry);
		DD_Industry.selectByVisibleText("Retail");
		
		WebElement Ownership = Driver.findElementById("createLeadForm_ownershipEnumId");
		Select DD_Ownership  = new Select(Ownership );
		DD_Ownership.selectByValue("OWN_CCORP");
		
		Driver.findElementById("createLeadForm_sicCode").sendKeys("ERDCGT1234");
		Driver.findElementById("createLeadForm_description").sendKeys("Lead ads are a type of ad that allows you to run lead generation campaigns on Facebook and Instagram. You can create leads ads from your Facebook Page or from Ads Manager. ");
		Driver.findElementById("createLeadForm_importantNote").sendKeys("kjahjgfjgsafgsdhvbhsugugsdbjsdvjvs");
		
		Driver.findElementById("createLeadForm_primaryPhoneCountryCode").clear();
		Driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("+91");
		Driver.findElementById("createLeadForm_primaryPhoneAreaCode").clear();
		Driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("+91");
		Driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("8807873870");
		Driver.findElementById("createLeadForm_departmentName").sendKeys("Quality Engineer & Assurance");
		
		WebElement CountryCurrency = Driver.findElementById("createLeadForm_currencyUomId");
		Select DD_CountryCurrency = new Select(CountryCurrency);
		DD_CountryCurrency.selectByValue("USD");
		
		Driver.findElementById("createLeadForm_numberEmployees").sendKeys("1000");
		Driver.findElementById("createLeadForm_tickerSymbol").sendKeys("$");
		Driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("automation Tester");
		Driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.dandanakka.com");
		Driver.findElementById("createLeadForm_generalToName").sendKeys("Test Leaf");
		Driver.findElementById("createLeadForm_generalAddress1").sendKeys("17/13, First Floor,");
		Driver.findElementById("createLeadForm_generalAddress2").sendKeys("College Road, Nanganallur");
		Driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
		*/
		
		WebElement Country = Driver.findElementById("createLeadForm_generalCountryGeoId");
		Select DD_Country = new Select(Country);
		DD_Country.selectByValue("IND");
		
		Thread.sleep(5000);
		
		WebElement State = Driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select DD_State = new Select(State);
		//DD_State.selectByValue("IN-TN");
		DD_State.selectByVisibleText("TAMILNADU");
		
		List<WebElement> State_options = DD_State.getOptions();
		System.out.println(State_options.size());
		
		int SizeOfState = State_options.size();
		System.out.println("the list of options on State is: ");
		for (int i = 1; i < SizeOfState; i++) 
		{
			WebElement state_Each_Options = State_options.get(i);
			String text = state_Each_Options.getText();
			System.out.println(text);
			state_Each_Options.click();
		}
				
		
/*		Driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600061");
		Driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("0061");

		Driver.findElementByName("submitButton").click();
		System.out.println("The Title of the Current Page is: "+Driver.getTitle());
		
		Driver.close();
		*/
	}
}