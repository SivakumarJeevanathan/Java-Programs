
package week1.day1;

import java.util.Scanner;
public class P6ArithemeticOperators 
{
	public static void main(String[] args)
	{
	System.out.println("* * * Java program to get two and do arthimetic operations and print output values * * * ");
	// Declare the object and initialize with predefined standard input object
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the No1:");
	double number1 = sc.nextDouble(); // String input
	System.out.print("Enter the No2:");
	double number2 = sc.nextDouble(); // String input
	
	if (number1==number2)
		{
			System.out.println("Both are equal");
		}
	
	double Sum = number1+number2;
	System.out.println("Sum of two numbers:"+Sum);

	double Subtraction = number1-number2;
	System.out.println("Subtraction of two numbers:"+Subtraction);

	double Multiplication= number1*number2;
	System.out.println("Multiplication of two numbers:"+Multiplication);

	double Division = number1/number2;
	System.out.println("Division of two numbers:"+Division);

	double Modulus = number1%number2;
	System.out.println("Modulus of two numbers:"+Modulus);
	}
}

/*	class Variables
	{
	int a = 10;//instance Variable
	static int b=20; // Static variable
	public static void main(String args[])
	{
	int c=30;
	int d = c+b;
	//int e = d+a; // cant perform this will throw error
	System.out.println("Values of C:"+c);
	System.out.println("Values of D:"+d);
	System.out.println("Values of B:"+b);
	//System.out.println("Values of E:"+e); // this will throw error
	}
}

	import java.util.Scanner;
	public class ReverseSplit
	{
	public static void main(String[] args)
	  {
	    // TODO Auto-generated method stub
	        Scanner in = new Scanner(System.in);
	    System.out.println("Enter your String");
	    String str = in.nextLine();
	    String[] token = str.split("");    //used split method to print in reverse order
	        for(int i=token.length-1; i>=0; i--)
	           {
	               System.out.print(token[i] + "");
	           }
	  }
	}
*/	 