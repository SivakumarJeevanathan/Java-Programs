package week1.DailyWorkouts;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CountNoOfDuplicates 
{
	public static void main(String[] args) 
	{
	 System.out.println("\t\t\t* * * JAVA Program to count the no of duplicates in an array* * *");
	 
	 Scanner ipValue = new Scanner(System.in);
	 System.out.println("\r\nEnter the Size of the Array:");
	 int SizeOfArray = ipValue.nextInt();
	 
	 int[] ParentArray = new int[SizeOfArray];
	 int[] times = new int[SizeOfArray];
	 int[] NewArray = new int[SizeOfArray];
	 
	 System.out.println("Enter the Elements of the Array:");
	 	 for (int i = 0; i < ParentArray.length; i++) 
	 	{
		 	ParentArray[i]=ipValue.nextInt();
		 	times[i]=1;
	 	}
	 
	 	for (int i = 0; i < ParentArray.length; i++) 
	 	{
	 	    for (int j = i; j < ParentArray.length; j++) 
	 	    {
	 	        if (ParentArray[i] == ParentArray[j] && i != j) 
	 	        {
	 	            NewArray[i] = ParentArray[i];
	 	            times[i]++;
	 	        }
	 	    }
	 	}
	 	
	 	for (int i = 0; i <  ParentArray.length; i++) 
	 	{
	 	    //System.out.println("The Array value" + ParentArray[i] +  "=" + times[i] + "times");
	 		System.out.println("The Array value" + ParentArray[i] + "\t" +  NewArray[i] + "\t" + times[i]);
	 	}
	 
	 }
} 


