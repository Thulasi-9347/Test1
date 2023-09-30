package MethodProgramming;

public class Palindromenumber {
public static int palindrome(int n)
{
	 int r ,sum=0,x;    
	  
	  
	  x=n;    
	  while(n>0){    
	 r=n%10;
	   sum=(sum*10)+r;    
	  n=n/10;
	   
	  }  
	  if(x==sum) {
	  
	   System.out.println("palindrome number");  
	  }
	  else {
		  System.out.println("not a palindrome number");
	  }
	return x;    
	}  
}
