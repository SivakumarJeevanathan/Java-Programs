package week1.day2;

import java.util.Scanner;

public class P2MyCalculator 
{
	public static void main(String[] args) 
	{
		P2Calculator objCal = new P2Calculator();
		
		/*Double number1, number2, number3;
		Scanner ipValue = new Scanner(System.in);
		System.out.println("enter the value of Number 1");
		number1=ipValue.nextDouble();
		
		System.out.println("enter the value of Number 2");
		number2=ipValue.nextDouble();
		*/
		
		System.out.println(objCal.add(10, 20));
		System.out.println(objCal.Substraction (20, 10));
		System.out.println(objCal.Multiplication(2.00,2.00 ));
		System.out.println(objCal.Division(25.5f, 5.0f));
	}
}
