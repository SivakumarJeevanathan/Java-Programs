package week1.Assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) 
	{
		System.out.println("* * * JAVA program to find MissingElement from an array * * *");
		
		// Here is the input
		int[] ArrValues = {9,62,4,7,3,8,1,6};
		int Missingvalue=0;

		System.out.print("\nThe Values in the existing array is:");
        for (int i = 0; i < ArrValues.length; i++) 
        	{	System.out.print(" " +ArrValues[i]);	}
		
		// Sort the array
		Arrays.sort(ArrValues);
		System.out.print("\nThe Values of existing array after Sorted is:");
        for (int i = 0; i < ArrValues.length; i++) 
        	{	System.out.print(" " +ArrValues[i]);	}


        for (int i = 0; i < ArrValues.length; i++) // loop through the array (start i from arr[0] till the length of the array) 
        {
        	for (int j = 1; j < ArrValues.length; j++) 
        	{
        		if (ArrValues[i] != ArrValues[j])
        		{
        			Missingvalue = ArrValues[j];
        			System.out.print("\r\nThe Missing value in array is:" +Missingvalue);
        	        break;
        		}
			}
		}
		
        

			// check if the iterator variable is not equal to the array values respectively
			
				// print the number
				
				// once printed break the iteration
	}
}
