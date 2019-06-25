package com.stackroute.pe1;

import java.util.Scanner;

public class RepeatCharacters {

//	Repeat last n number of characters of a word at n times
	public void repeatSubString(){
	
//		declaration
		String str,substr;
		StringBuffer string = new StringBuffer();
		int n;
		
//		Read a string and number
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string");
		str = sc.next();
	
		System.out.println("Enter the number");
		n = sc.nextInt();
		
//		Copy the string value to string buffer variable
		string = string.append(str);
		
//		create a substring
		int startIndex = string.length()-n;
		substr = string.substring(startIndex);
		System.out.println(substr);
		
//		append the substring n times
		for (int i=0; i<n; i++){
			string.append(substr);
			
		}
		
		System.out.println(string);
		
	}
}
