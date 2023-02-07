package com.bnt.starPattern;

import java.util.Scanner;

public class NumberPatternOneOrZero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Rows");
		int rows = sc.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows; j++) {
				int n = 1;
				if (i % 2 == 0) {
					n = (n == 1) ? 0 : 1;
					System.out.print(n);
				} else {
					n = 0;
					n = (n == 0) ? 1: 0;
					System.out.print(n);
				}

			}
			System.out.println();

		}

	}

}
