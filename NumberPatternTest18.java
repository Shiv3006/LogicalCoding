package com.bnt.starPattern;

import java.util.Scanner;

public class NumberPatternTest18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The number Of rows");
		int rows = sc.nextInt();
		for (int i = rows; i >= 1; i--) {
			for (int j = i; j <= rows; j++) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for (int i =1; i<=rows; i++) {
			for (int j = i; j < rows; j++) {
				System.out.print(" ");
			}
			for (int j =1; j<=i; j++) {
				System.out.print(" "+"*");
			}
			System.out.println();
		}

	}

}
