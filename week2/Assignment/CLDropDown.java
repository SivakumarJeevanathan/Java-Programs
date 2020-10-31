package week2.Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CLDropDown 
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
		Driver.findElementById("password").sendKeys("crmsfa");
		Driver.findElementByClassName("decorativeSubmit").click();
		System.out.println("The tilte of the page is:  " +Driver.getTitle());
		Driver.findElementByLinkText("CRM/SFA").click();
		Driver.findElementByLinkText("Leads").click();
		Driver.findElementByLinkText("Create Lead").click();
		System.out.println("The tilte of the page is:  " +Driver.getTitle());
		
		WebElement Source = Driver.findElementById("createLeadForm_dataSourceId");
		Select DD_Source = new Select(Source);
		List<WebElement> DD_Source_Options = DD_Source.getOptions();
		
		int size = DD_Source_Options.size();
		System.out.println("\nThe Total NO of items on Source is:\t" +DD_Source_Options.size());
		
		WebElement Source_FirstItem = DD_Source_Options.get(1);
		String Fitem = Source_FirstItem.getText();
		System.out.println("\nThe first items of Source is:\t" +Fitem);
		
		WebElement Source_LastItem = DD_Source_Options.get(size-1);
		String Litem = Source_FirstItem.getText();
		System.out.println("\nThe Last items of Source is:\t" +Litem);
		
		System.out.print("\nThe items of Source using FOR LOOP:\t");
		for (int i = 1; i < DD_Source_Options.size(); i++) 
		{
			WebElement state_Each_Options = DD_Source_Options.get(i);
			String text = state_Each_Options.getText();
			System.out.print("," +text);
			state_Each_Options.click();
		}
		
		System.out.print("\nThe items of Source using FOR EACH:\t");
		for (WebElement EachElement : DD_Source_Options) 
		{
			System.out.print("," +EachElement.getText());
			EachElement.click();
		}
		
		WebElement Market = Driver.findElementById("createLeadForm_marketingCampaignId");
		Select DD_Market = new Select(Market);
		List<WebElement> Market_options = DD_Market.getOptions();
		
		int SizeOfMarket = Market_options.size();
		System.out.println("\nThe Total No of items on the MARKET IS:\t " +Market_options.size());
		
		WebElement Market_Seconditem = Market_options.get(1);
		String Sitem = Market_Seconditem.getText();
		System.out.println("\nThe Second value on the MARKET Dropdown is:\t" +Sitem);

		Driver.close();
	}
}