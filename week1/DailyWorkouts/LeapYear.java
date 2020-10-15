package week1.DailyWorkouts;

import java.util.Scanner;

public class LeapYear
{
	public static void main(String[] args) 
	{
	 System.out.println("\"\t\t\t* * * JAVA Program to find the entered YEAR IS LEAP year or NOT");
	 Scanner Sc= new Scanner(System.in);
	 System.out.println("Enter a year to check");
	 int year = Sc.nextInt();
	 boolean leap = false;
	 if(((year % 4 == 0) && ( year % 100 != 0))|| (year%400 == 0)) 
	 {
		 System.out.println(year + " is a leap year.");
	 }
	 else
		 System.out.println(year + " is not a leap year.");
    }
} 


