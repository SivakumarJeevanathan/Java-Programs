package week3.day1.p2Overload;

public class Calculator 
{
	public int Addition(int num1, int num2 ) 
	{
		int Add= num1+num2;
		return Add;
	}
	
	public int Addition(int num1, int num2, int num3) 
	{
		int Add= num1+num2+num3;
		return Add;
	}
	
	public float Addition(int num1, float num2) 
	{
		float Add= num1+num2;
		return Add;
	}

	public double Addition(double num1, double num2, double num3) 
	{
		double Add= num1+num2+num3;
		return Add;
	}

	public int Subtraction(int num1, int num2 ) 
	{
		int Sub= num1-num2;
		return Sub;
	}

	public double Subtraction(int num1, double num2 ) 
	{
		double Sub= num1-num2;
		return Sub;
	}

	public int Multiplication(int num1, int num2 ) 
	{
		int Multiply= num1*num2;
		return Multiply;
	}

	public double Multiplication(int num1, double num2 ) 
	{
		double Multiply= num1*num2;
		return Multiply;
	}
	
	public int Division(int num1, int num2 ) 
	{
		int Divide = num1/num2;
		return Divide;
	}

	public double Division(int num1, double num2 ) 
	{
		double Divide= num1/num2;
		return Divide;
	}
}
