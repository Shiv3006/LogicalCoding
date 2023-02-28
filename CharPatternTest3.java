package com.bnt.starPattern;

import java.util.Scanner;

public class CharPatternTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number Of rows");
		int rows = sc.nextInt();
		for (int i = 1; i <= rows; i++) {
			int alpha =64;
			for (int j = rows; j >= i; j--) {
				System.out.print((char) (alpha+j) + " ");
			}
			System.out.println();
		}
	}
}
