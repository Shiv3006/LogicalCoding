package com.shiv.BasicJavaPrograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=sc.next();
		char ch[]=str.toCharArray();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		
		if(rev.equals(str)) {
			System.out.println("the given string is palindrome: "+rev);
		}
		else{
			System.out.println("the given string is not palindrome: "+rev);
		}
		sc.close();
	}

}
