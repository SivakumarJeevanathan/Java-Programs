package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CRA2Leaftaps 
{
	public static void main(String[] args) 
	{
			/* 1. Open chrome browser
			2. load the application url "http://leaftaps.com/opentaps/control/main"
			3. enter the username as "demosalesmanager"
			4. enter the password as "crmsfa"
			5. click on Login button
			6. Click on CRM/SFA link
			7. Click on Leads link
			8. Click on Create Lead link
			9. Enter Company Name
			10. Enter First name
			11. Enter Last name
			12. Click on Create Lead button
			*/
		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("http://leaftaps.com/opentaps/control/main");

	}
}
