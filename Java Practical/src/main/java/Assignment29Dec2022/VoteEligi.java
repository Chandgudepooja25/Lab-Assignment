/*Write a program take the input of age from the user if the age is above 18 print 
'You are eligible to vote'else throw an exception that' age is not correct'.*/

package Assignment29Dec2022;

import java.util.Scanner;

public class VoteEligi 
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age=sc.nextInt();
		sc.close();
			if(age<=18) {
				throw new ArithmeticException("age is not correct");
			}
			else {
				System.out.println("eligible");
				
			}
		}
}
