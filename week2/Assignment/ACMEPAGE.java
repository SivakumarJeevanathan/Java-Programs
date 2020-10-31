package week2.Assignment;

import org.checkerframework.common.reflection.qual.NewInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ACMEPAGE
{
	public static void main(String[] args) 
	{
		/*
		1. Load url "https://acme-test.uipath.com/login"
		2. Enter email as "kumar.testleaf@gmail.com"
		3. Enter Password as "leaf@12"
		4. Click login button
		5. Get the title of the page and print
		6. Click on Log Out
		7. Close the browser		
		*/
		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://acme-test.uipath.com/login");
		Driver.findElementById("email").clear();
		Driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		Driver.findElementById("password").clear();
		Driver.findElementById("password").sendKeys("leaf@12");
		Driver.findElementByXPath("//button[@type='submit']").click();
		System.out.println("The Title of this page is:  " +Driver.getTitle());
		Driver.findElementByLinkText("Log Out").click();
		Driver.close();
	}
}