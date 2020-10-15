package week1.day2;

import java.util.Arrays;

public class P3LearnArray {

	public static void main(String[] args) 
	{
		
		System.out.println("* * * * * * * * * * * * * *");
		System.out.println("The following is array");
		
		int[] Arr1 = new int[5];
		Arr1[0]=10;
		Arr1[1]=40;
		Arr1[2]=20;
		Arr1[3]=50;
		Arr1[4]=30;
		
		String[] StrArr = {"Siva", "Venki", "Hari", "Senthil","Jayalakshmi"};
		
		System.out.println("The Length of Arr1 is:" +Arr1.length);
		System.out.println("The Length of StrArr is:" +StrArr.length);
		
		Arrays.sort(Arr1);
		System.out.println("The Sorted values of Arr1 is:" );
		for (int i = 0; i < Arr1.length; i++) 
		{
			System.out.print(" "+Arr1[i]);
		}
		
		System.out.print("The values of StrArr is:" );
		for (int i = 0; i < StrArr.length; i++) 
		{
			System.out.print(","+StrArr[i]);
		}
		
		System.out.println("* * * * * * * * * * * * * *");
		System.out.println("The following is 2D array");
		
		int[][] values = new int[3][2];
		values[0][0] = 10; values[0][1] = 20;
		values[1][0] = 30; values[1][1] = 40;
		values[2][0] = 50; values[2][1] = 60;
		
		System.out.println("The lenght of 2D array is:" +values.length);
		System.out.println("The lenght of 2D array is:" +values[2].length);
		
		for (int i = 0; i < values.length; i++) 
		{
			for (int j = 0; j < values[i].length; j++) 
			{
				
				System.out.print(" " +values[i][j]);
				
			}
			
		}
		

	}

}
