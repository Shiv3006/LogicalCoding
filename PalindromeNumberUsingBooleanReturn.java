package com.shiv.BasicJavaPrograms;

import java.util.Scanner;

public class PalindromeNumberUsingBooleanReturn {
	public boolean isPalindrome(int x) {
		int rev = 0, temp;
		int n = x;
		while (x >0) {
			temp = x % 10;
			rev = (rev * 10) + temp;
			x = x / 10;
		}
		if (n == rev) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		PalindromeNumberUsingBooleanReturn s = new PalindromeNumberUsingBooleanReturn();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int x = sc.nextInt();
		System.out.println(s.isPalindrome(x));
		sc.close();
	}

}
