package com.shiv.BasicJavaPrograms;

import java.util.Scanner;

public class DuplicateCharArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();

		findDuplicates(str);
	}

	public static void findDuplicates(String str) {
		int count;

		char strArray[] = str.toCharArray();

		System.out.println(" Duplicate characters in a given string:  ");

		for (int i = 0; i < strArray.length; i++) {
			count = 1;
			for (int j = i + 1; j < strArray.length; j++) {
				if (strArray[i] == strArray[j] && strArray[i] != ' ') {
					count++;

					strArray[j] = '0';
				}
			}

			if (count > 1 && strArray[i] != '0')
				System.out.println(str + " contains " + strArray[i] + " " + count + " times");
		}
	}

}
