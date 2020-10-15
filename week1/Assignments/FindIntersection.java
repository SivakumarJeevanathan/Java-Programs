package week1.Assignments;

public class FindIntersection 
{
	public static void main(String[] args) 
	{
		System.out.println("* * * JAVA Program to Find Intersection in any two array * * *");
		int[] MyArray1 = {54, 32, 19, 87, 60,86};
		int[] MyArray2 = {01, 23, 45, 67, 89, 10, 87,86};
		
		System.out.print("\r\nThe Existing values of MYARRAY_1 is:");
		for (int i = 0; i < MyArray1.length; i++) 
		{
				System.out.print(" " +MyArray1[i]);
		}
	
		System.out.print("\r\nThe Existing values of MYARRAY_2 is:");
		for (int i = 0; i < MyArray2.length; i++) 
		{
				System.out.print(" " +MyArray2[i]);
		}
		
		System.out.println("\nThe Following are the values intersects on both ARRAYS:");
		
		for (int i = 0; i < MyArray1.length; i++) 
		{
			for (int j = 0; j < MyArray2.length; j++) 
			{
				if (MyArray1[i]==MyArray2[j])
					System.out.print(", " +MyArray2[j]);
			}
		}
	}

}
