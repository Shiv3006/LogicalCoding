package com.shiv.BasicJavaPrograms;

import java.util.Scanner;

public class PrimeNumberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The number");
		int n = sc.nextInt();
		int flag = 0;
		if(n==0||n==1) {
			System.out.println(n + " is not prime number");
		}else {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = flag + 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(n + " is prime number");
		} else {
			System.out.println(n + " is not prime number");
		}
		}
	}
}
