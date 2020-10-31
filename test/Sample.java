package test;

import java.util.Scanner;

public class Sample
{
	public static void main(String[] args) 
	{
	
		float discount = 0, FinalCost=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of Mobile MRP:");
		float Price = sc.nextFloat();
		
		if (Price<=10000)
		{
			discount = (Price * (20/100)); 
			System.out.println("discount value:" +discount);
		}
		/*	FinalCost = Price - discount;
				System.out.println("discount value:" +discount);
				System.out.println(FinalCost);
			else 
			{	discount = Price * (-2/100); 
				DisRate = Price - discount;
			}
			*/
	//		return DisRate;			
	}	
}
