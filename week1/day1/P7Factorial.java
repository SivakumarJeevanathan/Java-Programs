package week1.day1;

import java.util.Scanner;

public class P7Factorial
{
	public static void main(String args[])
		{
			System.out.println("* * * Java Program to get input from user and print FACTORIAL VALUE* * *");
			System.out.println("Enter the Value to be calculate:");
			Scanner ipValue = new Scanner(System.in);
			int MaxValue = ipValue.nextInt();
			int i,Fact=1;
			
			for(i=1;i<= MaxValue;i++)
				{
					Fact = Fact*i;
				}
			//System.out.printf("The Factorial Value is:" +Fact);
			System.out.print("The Factorial Value of" + MaxValue +" is:" +Fact);
		}
}

