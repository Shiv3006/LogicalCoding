package com.bnt;

import java.util.Scanner;

public class Test {
	public static void main(String args[]) {

		/*
		 * String str1 = "shiv"; String str2 = "shivanjali";
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string");
		String str1=sc.nextLine();
		System.out.println("Enter second String");
		String str2=sc.nextLine();
		if(str1.length()>str2.length()){
		showResult(str2,str1,findSubString(str1,str2));
		
		  }else{ showResult(str1,str2,findSubString(str2,str1)); }
		 
		}

		private static boolean findSubString(String str1, String str2) {
		int count = 0;
		for(int i=0;i<str1.length();i++) {
		if(str1.charAt(i) == str2.charAt(count)) {
			count++;
		if(count == str2.length()) {
		return true;
		}
		}else {
			count = 0;
		}
		}
		return false;
		}

		private static void showResult(String s1,String s2,boolean flag){
		if(flag==false){
		System.out.println(s1 + " is a substring of " + s2);
		}else{
		System.out.println(s1 + " is not a substring of " + s2);
		}
		}
	
	}


