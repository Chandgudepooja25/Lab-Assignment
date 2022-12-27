package String;

import java.util.Scanner;

public class StringEqual {

	public static void main(String[] args)throws Exception
	{
		String str1, str2;
	        Scanner sc = new Scanner(System.in);  
			System.out.println("Enter First String");
			str1 = sc.nextLine();
			
			System.out.println("Enter Second String");
			str2 = sc.nextLine();
		
		if (str1.equals(str2))
	    	System.out.println("String Equal");
	    else
	    	System.out.println("String Unequal");
	    	
	    
		

	}

}
