package week1.Assignments;

import java.util.Arrays;

/*Algorithm:
 * Step 1 - Declare and initialize an array.
* Step 2 - Duplicate elements can be found using two loops. The outer loop will iterate through the array from 0 to length of the array.
* Step 3 - The outer loop will select an element.
			The inner loop will be used to compare the selected element with the rest of the elements of the array.
* Step 4 - If a match is found which means the duplicate element is found then, display the element.");
 */

public class PrintDuplicatesInArray 
{
	public static void main(String[] args) 
	{
		int[] Arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		//int[] Arr = new int[] {14,12,14,13};
		System.out.println("the length of the array is:" +Arr.length);
		
		System.out.print("The Existing value of array is:\r\n" );
		for (int i = 0; i <= Arr.length-1; i++) 
			{		System.out.print(" " +Arr[i]);	}
	
		System.out.print("\r\nThe Sorted value of existing array is:\r\n" );
		Arrays.sort(Arr);
		for (int i = 0; i <= Arr.length-1; i++) 
		{		System.out.print(" " +Arr[i]);	}
		
		System.out.println("\r\nThe Duplicates values in array are:");
		for (int j = 0; j < Arr.length; j++) 
			{
				for (int k = j+1; k < Arr.length; k++) 
				{
					if (Arr[j] == Arr[k])
					System.out.print("," +Arr[k]);
				}
			}
	}
}

