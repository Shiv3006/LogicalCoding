package com.bnt.starPattern;

import java.util.Scanner;

public class NumberPatternTest15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The number of rows");
		int rows = sc.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = i; j <= rows; j++) {
				System.out.print(j + " ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
sc.close();
	}
	
}
