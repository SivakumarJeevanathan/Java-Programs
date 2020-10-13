package week1.day1;

import java.util.Scanner;

public class P8Fibbo {

	public static void main(String[] args) 
	{ 
		int number1= 0, number2=1, number3;
		
		System.out.println("Java Program to get input and print the Fibonacci value");
		System.out.print("Enter the Max value:");

		Scanner ipValue = new Scanner(System.in);
		int MaxValue = ipValue.nextInt();
		
		System.out.print("The Fibonacci Value is: " +number1 );
		System.out.print(" "+number2 );
		
		for (int i = 2; i < MaxValue; i++) 
		{
			number3=number1+number2;
			System.out.print(" "+number3);
			number1= number2;
			number2 = number3;
		}
		
		
	}

}
