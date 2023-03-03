package com.bnt.starPattern;

import java.util.Scanner;

public class CharPatternTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int rows = sc.nextInt();
		for(int i=0;i<=rows;i++){
			int alphabet=65;
			for(int j=i;j>=0;j--){
				System.out.print((char) (alphabet+j)+" ");
			}
			System.out.println();
		}

	}

}
