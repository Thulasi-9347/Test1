package MethodProgramming;

public class Sumdigits {
	public static int numbers(int num)
	{
		int r, sum = 0;
		while(num>0)
		{
			r=num%10;
			sum=sum+r;
			num=num/10;
		}
	
			System.out.println(sum);
		
		return sum;
	}

}
