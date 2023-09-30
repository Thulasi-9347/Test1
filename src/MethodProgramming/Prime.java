package MethodProgramming;

import java.util.Scanner;

public class Prime {
	public static void main(String[]args)
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int num=scan.nextInt();
	PrimeNumbers.prime(num);

}
}