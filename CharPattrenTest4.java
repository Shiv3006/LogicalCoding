package com.bnt.starPattern;

import java.util.Scanner;

public class CharPattrenTest4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		int length=str.length();
		char[] ch=str.toCharArray();
		for(int i=0;i<length;i++){
			for(int j=0;j<i;j++){
				System.out.print(ch[j]);
			}
			System.out.println();
		
		}
		for(int i=length;i>=0;i--){
			for(int j=0;j<i;j++){
				System.out.print(ch[j]);
				
			}
			System.out.println();
		}

	}

}
