package Assignment29Dec2022;

import java.util.Scanner;

public class MyThread {

	public static void main(String[] args) {
		myThread1 m=new myThread1();
		m.run();
		

	}

}
class myThread1 extends Thread{
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
		
	}
}