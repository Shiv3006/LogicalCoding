package com.shiv.BasicJavaPrograms;

import java.util.Scanner;

public class StarPatternOf30Nov {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows");
		int row=sc.nextInt();
		for(int i=row;i>=0;i--) {
			for(int j=i;j<=row;j++) {
				System.out.print("*"+" ");
			}
			System.out.println("");
			
		}
		for(int i=row-1;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		

	}

}
