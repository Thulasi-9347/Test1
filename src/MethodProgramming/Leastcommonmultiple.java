package MethodProgramming;
import java.util.Scanner;
public class Leastcommonmultiple {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int gcd=0;
		for(int i=1;i<=a && i<=b;i++)
		{
			if(a%i==0&& b%i==0)
			{
				gcd=i;
			}	
	}
			int lcm=a*b/gcd;
			System.out.println(lcm);
		
		
	}

}
