package week1.day1;

import java.util.Scanner;
public class P4OddNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("* * * Java program to get an input and print odd numbers * * *");
		System.out.println("Enter the value to be calculated:");
		Scanner inputValue = new Scanner(System.in);
		int value = inputValue.nextInt();
		inputValue.close();
		
		int Sum = 1;
		
		System.out.println("The Entered value is: " +value);
		System.out.println("The Odd Numbers are:");
				for (int i = 1; i <= value; i++) 
			{
				if (i%2!=0)
				System.out.print("," +i);
				Sum= Sum+i;
			}
		//System.out.println("The Sum of odd numbers:" +Sum);
	}
}
