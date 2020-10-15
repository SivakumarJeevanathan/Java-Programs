package week1.DailyWorkouts;

import java.util.Scanner;

public class SwapTwoNo 
{
	public static void main(String[] args) 
	{
	 System.out.println("\t\t\t* * * JAVA Program Swap two numbers without using third variable * * * ");
	 
	 Scanner Sc= new Scanner(System.in);
	 System.out.println("Enter the Value of Number1:");
	 int No1 = Sc.nextInt();
	 System.out.println("Enter the Value of Number 2:");
	 int No2 = Sc.nextInt();
	 System.out.println("The Values before the Swapping: " +No1);
	 System.out.println("The Values before the Swapping: " +No2);
	 
	 No1 = No1+No2;
	 No2 = No1-No2;
	 No1= No1-No2;
	 
	 System.out.println("The Values After the Swapping: " +No1);
	 System.out.println("The Values after the Swapping: " +No2);
	 
	}
	
}
