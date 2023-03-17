package com.bnt.starPattern;

public class FactTest22 {

	public static void main(String[] args) {
		System.out.println(arms(156));
	}

	public static boolean arms(int no) {
		int n, rem = 0, sum = 0;
		n = no;
		while (n > 0) {
			rem = n % 10;
			sum =(rem*rem*rem)+sum;
			n = n / 10;
		}
		if (no == sum) {
			return true;
		} else
			return false;

	}

}
