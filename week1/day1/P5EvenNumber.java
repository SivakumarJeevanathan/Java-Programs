package week1.day1;

import java.util.Scanner;

public class P5EvenNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("* * * Java program to get input value & print Even numbers * * *");
		System.out.println("Enter the Max Value to be check:");
		Scanner inputValue = new Scanner(System.in);
		int Value = inputValue.nextInt();
		System.out.println("The Entered value is:" +Value);
		System.out.print("The Even numbers are:");
		for (int i = 1; i <= Value; i++) 
		{
			if (i%2 == 0)
			{
				System.out.print(","+i);
			}
		}
	}	
}
