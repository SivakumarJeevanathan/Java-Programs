package week1.day1;
import java.util.Scanner; 
public class ScannerSamp 
{
	public static void main(String[] args) 
	{
		System.out.println("Java program to read data of various types using Scanner class");
		Scanner ipValue= new Scanner(System.in); // Declare the object and initialize with predefined standard input object 
		
		System.out.println("Enter the name of the Person:");
		String name = ipValue.nextLine(); // String input 
		
		System.out.println("Enter the Gender of the Person:");
		char gender = ipValue.next().charAt(0); // Character input
		
		System.out.println("Enter the AGE of the Person:");
		int age = ipValue.nextInt(); // Numerical data input  
		
		System.out.println("Enter the Mobile No of the Person:");
		long mobileNo = ipValue.nextLong(); // Long data input  
		
		System.out.println("Enter the Weight of the Person:");
		double Weight = ipValue.nextDouble(); // Double data input  
		
		// Print the values to check if the input was correctly obtained. 
		System.out.println("Name: "+name); 
		System.out.println("Gender: "+gender); 
		System.out.println("Age: "+age); 
		System.out.println("Mobile Number: "+mobileNo); 
		System.out.println("Weight : "+Weight); 
	} 
} 
