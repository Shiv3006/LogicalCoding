package com.bnt.starPattern;

import java.util.Scanner;

public class CharPatternTest8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int rows=sc.nextInt();
		int alpha=63;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				System.out.print((char)(alpha+i+j)+"");
			}
			System.out.println(" ");
		}
		

	}

}
