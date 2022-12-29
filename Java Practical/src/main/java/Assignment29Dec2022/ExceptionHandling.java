package Assignment29Dec2022;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c;
		try {
			 c=a/b;
			 System.out.println(c);
			}
		catch(Exception e) {
			System.out.println("Excemption is throw"+e);
		}
		System.out.println("program is Done");
		
	}

}
