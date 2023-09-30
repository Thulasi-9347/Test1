package MethodProgramming;
import java.util.Scanner;
public class Program1 {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=scan.nextInt();
		System.out.println("enter the second number");
		int b=scan.nextInt();
		
		
		
		System.out.println(a=+a+b);
		System.out.println(b=+b-a);
		System.out.println(a=+a-b);
		
	}

}
