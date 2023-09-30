package MethodProgramming;

public class FibbonaciSeries {
public static int fibbonaci(int count)
{
	int fib1=0;int fib2=1,fib3;
	System.out.println(fib1+" "+fib2);
	for(int i=0;i<count;i++)
	{
		fib3=fib1+fib2;
		System.out.print(" "+fib3);
		fib1=fib2;
		fib2=fib3;
	}
	return count;
	
	
}
}
