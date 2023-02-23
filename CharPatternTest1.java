package com.bnt.starPattern;

import java.util.Scanner;

public class CharPatternTest1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows=sc.nextInt();
		int alpha=64;
		for(int i=1;i<=rows;i++) {
          for(int j=rows;j>i;j--) {
        	  System.out.print(" ");
          }
          for(int j=1;j<=i;j++) {
        	  System.out.print((char)(alpha+j)+" ");
          }
          System.out.println();
		}

	}

}
