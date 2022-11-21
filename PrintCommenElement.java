package com.shiv.BasicJavaPrograms;

public class PrintCommenElement {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 1, 2, 3, 6, 5 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= b.length - 1; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);
				}

			}
		}

	}

}
