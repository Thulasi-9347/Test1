package MethodProgramming;

public class CharvalueApp {
	public static char character(char value)
	{
		if(value=='A' ||value=='E' ||value=='I'||value=='O'||value=='U')
		{
			System.out.println("it is an upper case vowel");
		}
		else if(value=='a' ||value=='e' ||value=='i'||value=='o'||value=='u')
		{
			System.out.println("it is an lower case vowel");
		}
		else if(value>='A' && value<='Z')
		{
			System.out.println("it is an upper case consonant");
		}
		else if(value>='a' && value<='z')
		{
			System.out.println("it is an lower case consonant");
		}
		else if(value>=1 && value<=1000)
		{
			System.out.println("it is a digit");
		}
		else
		{
			System.out.println("it is a special character");
		}
		return value;
		
	}

}
