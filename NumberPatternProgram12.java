package com.bnt.starPattern;

import java.util.Scanner;

public class NumberPatternProgram12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows");
        int rows=sc.nextInt();
        for(int i=rows;i>=1;i--) {
        	for(int j=1;j<=i;j++) {
        		System.out.print(j+" ");
        	}
        	System.out.println();
        }
        for(int i=2;i<=rows;i++) {
        	for(int j=1;j<=i;j++) {
        		System.out.print(j+" ");
        	}
        	System.out.println();
        }
	}

}
