package week2.Assignment;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass1 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		
		Driver.get("http://leafground.com/pages/Edit.html");
		Driver.findElementById("email").sendKeys("TEst Data");
		
		WebElement Append_Textbox = Driver.findElementByXPath("(//label[text()='Append a text and press keyboard tab']/following-sibling::input)");
		String Previous_Value = Append_Textbox.getAttribute("value");
		Append_Textbox.clear();
		Append_Textbox.sendKeys(Previous_Value+ "Text Added");
		
		WebElement Default_Textbox = Driver.findElementByXPath("(//label[text()='Get default text entered']/following-sibling::input)");
		Default_Textbox.sendKeys("Text Added");
		String Default_Value = Default_Textbox.getAttribute("value");
		System.out.println(Default_Value);
		
		WebElement Clear_Textbox = Driver.findElementByXPath("//label[text()='Clear the text']/following-sibling::input");
		Clear_Textbox.clear();
		Clear_Textbox.sendKeys("TEXTCLEARED");
		
		WebElement Deactive_Textbox = Driver.findElementByXPath("//label[text()='Confirm that edit field is disabled']/following-sibling::input");
		boolean Deactive_Textbox_Status = Deactive_Textbox.isEnabled();
		if (Deactive_Textbox_Status==true)
		{	System.out.println("TEXTBOX is deactivated");}
		else 
		{	System.out.println("TEXTBOX is Activated");}
	}

}
