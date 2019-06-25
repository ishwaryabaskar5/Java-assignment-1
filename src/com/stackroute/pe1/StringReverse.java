package com.stackroute.pe1;

import java.util.Scanner;

public class StringReverse {

//	reverse a string
	public void reverseString(){
	
//		declaration
		String str, rev="";
		char[] word;
		
//		Read a string
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		str = sc.nextLine();
		
//		convert a string to character array
		word = str.toCharArray();
	
//		reverse a string
		for(int i=word.length-1;i>=0;i--){
			rev += word[i];
		}
		
		System.out.println("Reverse String:"+rev);
	}
}
