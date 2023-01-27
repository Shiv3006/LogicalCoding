package com.shiv.BasicJavaPrograms;

import java.util.Scanner;

public class SwappingNoByWithoutUsingThirdVar {
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a");
		a=sc.nextInt();
		System.out.println("enter value of b");
		b=sc.nextInt();
		System.out.println("before swapping value of a and b is a:"+a+" "+"B "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping value of a and b is a: "+a+" B "+b);

	}

}
