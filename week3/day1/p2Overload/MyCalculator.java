package week3.day1.p2Overload;

public class MyCalculator {

	public static void main(String[] args) 
	{
		System.out.println("\t* * * CALCULATOR Program using Overload Concept* * *");
		Calculator obj_Calculator = new Calculator();
		System.out.println("Value of Addition Method with 2 int arguments: "+obj_Calculator.Addition(10, 10));
		System.out.println("Value of Addition Method with 3 int arguments: "+obj_Calculator.Addition(10, 10,10));
		System.out.println("Value of Addition Method with 1 int & 1 float arguments: "+obj_Calculator.Addition(10, 10.5F));
		System.out.println("Value of Addition Method with 3 double arguments: "+obj_Calculator.Addition(10D, 10.5D, 279.5D));
		System.out.println("Value of Subtraction Method with 2 int arguments: "+obj_Calculator.Subtraction(10, 10));
		System.out.println("Value of Subtraction Method with 1 int & 1 float arguments: " +obj_Calculator.Subtraction(10, 4.5));
		System.out.println("Value of Multiplication Method with 2 int arguments: "+obj_Calculator.Multiplication(10, 10));
		System.out.println("Value of Multiplication Method with 1 int & 1 float arguments: " +obj_Calculator.Multiplication(10, 4.5));
		System.out.println("Value of Division Method with 2 int arguments: "+obj_Calculator.Division(10, 2));
		System.out.println("Value of Division Method with 1 int & 1 float arguments: " +obj_Calculator.Division(10, 2.5));
	}
}
