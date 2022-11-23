package javaBasic1;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println("factorial of given number:"+fact);
	}

}
