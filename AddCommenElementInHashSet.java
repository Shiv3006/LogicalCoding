package com.shiv.BasicJavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class AddCommenElementInHashSet {
	
	public static void main(String[] args) {
		int a1[]= {1,2,3,4,5,6};
		int b1[]= {6,5,4,9,8,2,1};
		Set<Integer> s=new HashSet<Integer>();
		
		for(int i=0;i<a1.length;i++) 
		{
			for(int j=0;j<b1.length;j++) {
				if(a1[i]==b1[j]) {
					s.add(a1[i]);
					break;
				}
			}
		}
		
		for(int no:s) {
			System.out.println(no);
		}
		
		
	}

}
