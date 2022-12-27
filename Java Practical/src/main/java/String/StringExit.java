//Write a program take 2 Strings as input from user and find if First String Exist in another  
package String;

import java.util.Scanner;

public class StringExit{
	public static void main(String args[])
	{
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Enter the First String:");
		String str1= SC.nextLine();
	
		
		System.out.println("Enter the Second String:");
		String str2= SC.nextLine();
		if(str1.contains(str2))
		{
			System.out.println("Content of 1String Exits in 2 String");
		}
		else
		{
			System.out.println("Content of 1String not Exits in 2 String");
		}
	}	

}