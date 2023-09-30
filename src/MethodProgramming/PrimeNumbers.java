package MethodProgramming;

public class PrimeNumbers {
	public static int prime(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			count=0;
			for(int j=2;j<=num;j++)
			{
				if(i%j==0)
				{
					
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(i);
			}
		}
		return count;
	}

}
