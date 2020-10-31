package week2.day1;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CRA1FBLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		/*
		 * 1. Get user Input and Open the respective browser
		 * 2. Load application "https://www.facebook.com/"
		 * 3. Maximize the window
		 * 4. Print the title of the page
		 * 5. Minimize the Window
		 * 6. Close the browser
		 */
		
		System.out.println("\t* * * Program to Launch Browser and Load Facebook URL* * * \n Enter C-ChromeBrowser, F-FireFox Browser");
		Scanner input = new Scanner(System.in);
		char ipBrowser=input.next().charAt(0); 
		input.close();
		
		switch (ipBrowser) 
		{
			case 'C':
				WebDriverManager.chromedriver().setup();
				ChromeDriver CDriver = new ChromeDriver();
				System.out.println("The Chrome Browser is launched");
				CDriver.get("https://www.facebook.com/");
				CDriver.manage().window().maximize();
				System.out.println("The Title from Chrome Browser:" +CDriver.getTitle());
				Thread.sleep(5000);
				CDriver.manage().window().minimize();
				System.out.println("The Chrome Browser is Minimized" +CDriver.getPageSource());
				Thread.sleep(5000);
				CDriver.close();
				System.out.println("The Chrome Browser is Closed");
			break;
			
			case 'F':
				WebDriverManager.firefoxdriver().setup();
				FirefoxDriver FDriver = new FirefoxDriver();
				System.out.println("The Firefox Browser is launched");
				FDriver.get("https://www.facebook.com/");
				FDriver.manage().window().maximize();
				System.out.println("The Title from Firefox Browser:" +FDriver.getTitle());
				Thread.sleep(5000);
				FDriver.manage().window().minimize();
				System.out.println("The Firefox Browser is Minimized" +FDriver.getPageSource());
				Thread.sleep(5000);
				FDriver.close();
				System.out.println("The Firefox Browser is Closed");
			break;

			default:
			System.out.println("A Wrong Character ' " +ipBrowser+ "'is entered! ! ! \nPlease enter either of the mentioned characters");
			break;
		}
		
		
	}

}
