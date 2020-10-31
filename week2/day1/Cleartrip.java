package week2.day1;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cleartrip 
{
	public static void main(String[] args) 
	{
	//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	ChromeDriver Driver = new ChromeDriver(options);
	Driver.get("https://www.cleartrip.com/");
	Driver.manage().window().maximize();
	Driver.findElementById("RoundTrip").click();
	Driver.findElementById("FromTag").clear();
	Driver.findElementById("FromTag").sendKeys("Chennai",Keys.TAB);
	//Driver.findElementById("FromTag").sendKeys(Keys.TAB);
	//Driver.findElementById("ToTag").sendKeys("New york");
	Driver.findElementById("ToTag").sendKeys("New york",Keys.TAB);
	//Driver.findElementById("ToTag").sendKeys(Keys.TAB);
	
	//Driver.findElementByXPath("/html/body/div[1]/div[1]/table/tbody/tr[4]/td[5]/a\")").click();
	Driver.findElementById("DepartDate").click();
	Driver.findElementByLinkText("29").click();
	Driver.findElementById("ReturnDate").click();
	Driver.findElementByLinkText("10").click();
	
	WebElement Adults = Driver.findElementById("Adults");
	Select AD = new Select(Adults);
	AD.selectByValue("2");
	
	WebElement Childrens = Driver.findElementById("Childrens");
	Select CH = new Select(Childrens);
	CH.selectByValue("1");
	
	
	WebElement Infants = Driver.findElementById("Infants");
	Select IN = new Select(Infants);
	IN.selectByValue("1");
	
	Driver.findElementById("MoreOptionsLink").click();
	WebElement ClassTravel = Driver.findElementById("Class");
	Select COT = new Select(ClassTravel);
	COT.selectByValue("Economy");
	Driver.findElementByXPath("//input[@id='AirlineAutocomplete']").sendKeys("Emirates",Keys.TAB);
	Driver.findElementById("SearchBtn").click();
	Driver.close();
	}
}
