package com.yash.siddiqui;

import java.util.ArrayList;
import java.util.List;

public class Mainju {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s="Siddiqui";
	
	List<Character> list = new ArrayList<Character>();
	
	
	char[] a=s.toCharArray();
	int j=a.length, count=0;
	for(int i=0;i<a.length-1;i++) {
		System.out.println(i);
		if(a[i]==a[j]) {
			
		System.out.println(a[i]);
			
		}
		j--;
	}
		

	}

}
