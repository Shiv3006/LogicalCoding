package com.shiv.BasicJavaPrograms;

import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {
		int n,sum=0,product=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		int digit;
		while(n>0) {
			digit=n%10;
			sum=sum+digit;
			product=product*digit;
			n=n/10;
			
		}
		if(sum==product) {
			System.out.println("the given number is spy number");
		}else {
			System.out.println("the given number is not spy number");
		}
		
	}

}
