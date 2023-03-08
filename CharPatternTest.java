package com.bnt.starPattern;

import java.util.Scanner;

public class CharPatternTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows");
		int rows=sc.nextInt();
		for(int i=rows;i>=0;i--){
			int alpha=65;
			for(int j=rows;j>=i;j--){
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
		}
        
		
	}

}
