package week1.Assignments;

import java.util.Arrays;

public class SecondLargest
{

	public static void main(String[] args) 
	{          
		System.out.println("* * * Java program to print the Second Largest no from the array * * *");
        //Initialize array   
        int [] arr = new int [] {19, 22, 13, 54, 35,76, 67, 98, 89, 10};  
        int temp;
        
        System.out.print("The Values in the existing array is:\r\n");
        for (int i = 0; i < arr.length; i++) 
        	{	System.out.print(" " +arr[i]);	}
        
        Arrays.sort(arr);
        System.out.println("\r\nThe Values array after sorted:");
        for (int i = 0; i < arr.length; i++) 
        	{	System.out.print(" " +arr[i]);	}
        
        System.out.print("\r\nThe secound Largest value in the existing array is:\r\n");
        for (int i = 0; i < arr.length; i++) 
        {
        	for (int j = 1; j < arr.length; j++) 
        	{
				if (arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
        System.out.println(arr.length-1);
     }  
}  

/*for(int i = 0; i < arr.length; i++) {  
for(int j = i + 1; j < arr.length; j++) {  
    if(arr[i] == arr[j])  
        System.out.println(arr[j]);
*/  
