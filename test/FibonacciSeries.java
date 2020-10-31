package JavaCoding;

import org.testng.annotations.Test;

public class FibonacciSeries extends BaseTestNg {

@Test(priority=1)
public void series() {
int n1=0,n2=1,n3,i,count=10; 
//printing 0 and 1
System.out.println(n2);
//loop starts from 2 because 0 and 1 are already printed
for(i=2;i<count;++i) 
{
n3=n1+n2; 
System.out.println(n3); 
n1=n2; 
n2=n3; 
} 
}

@Test(priority=2)
public void fibonacciSeries() {
int i = 1, n = 10, t1 = 0, t2 = 1;
System.out.print("First " + n + " numbers series: "); 
while (i <= n)
{
System.out.println(t1 + " ");
int sum = t1 + t2;
t1 = t2;
t2 = sum;
i++;
}
}

}
