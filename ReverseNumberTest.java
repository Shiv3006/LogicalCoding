package javaBasic1;

import java.util.Scanner;

public class ReverseNumberTest {

	public static void main(String[] args) {		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	int digit,rev=0;
	while(n!=0) {
		digit=n%10;
		rev=(rev*10)+digit;
		n=n/10;
	}
	
System.out.println("reverse number:"+rev);
		
		
	}

}
