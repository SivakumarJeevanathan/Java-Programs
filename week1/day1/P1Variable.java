package week1.day1;

public class P1Variable
{
public static void main(String[] args)
	{
		int temp = 5;
		System.out.println("* * * * * * * * * * * * * * * * * * * ");
		System.out.println("The value of TEMP is:" +temp);
		++temp;
		System.out.println("Now the value of TEMP after (++temp) is:" +temp);
		System.out.println("* * * * * * * * * * * * * * * * * * * ");
		System.out.println();
		System.out.println();
		
		System.out.println("* * * * * * * * * * * * * * * * * * * ");
		temp=1;
		System.out.println("The value of TEMP is:" +temp);
		temp++;
		System.out.println("Now the value of TEMP after (temp++)is:" +temp);
		System.out.println("* * * * * * * * * * * * * * * * * * * ");
		System.out.println();
		System.out.println();
		
		int b = temp;
		System.out.println("The value of TEMP is:" +temp);
		System.out.println("The value of B is:"  +b);
		
		int c = temp++;
		System.out.println("The value of TEMP is:"  +temp);
		System.out.println("The value of C is:" +c);
		
		int d = ++temp;
		System.out.println("The value of TEMP is:"  +temp);
		System.out.println("The value of d is:" +d);
		
		int x=1;
		int y=++x;
		System.out.println("the Value of x:" +x);
		System.out.println("the Value of y:" +y);
		
		int u=1;
		int v=x++;
		System.out.println("the Value of u:" +u);
		System.out.println("the Value of v:" +v);
	
		}
}
