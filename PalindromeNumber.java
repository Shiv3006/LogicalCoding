package javaBasic1;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int no = sc.nextInt();
		int r, temp, sum = 0;
		temp = no;
		while (no > 0) {
			r = no % 10;
			sum = (sum * 10) + r;
			no = no / 10;
		}
		if (temp == sum)
			System.out.println(temp + " is palindrome");
		else
			System.out.println(temp + " is not Palindrome");

	}

}
