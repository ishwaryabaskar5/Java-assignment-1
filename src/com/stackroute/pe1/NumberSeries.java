package com.stackroute.pe1;

import java.util.Scanner;

public class NumberSeries {

//	  Generates number series like this. 1,2,2,3,3,3,4,4,4,4...n
	  public void generateSeries(){
	  	
//	  	declaration
	  	int num;
	  	
//	  	read a number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the maximum value of number series:");
		num = sc.nextInt();
		
//		generate and print series
		for(int i=1;i<=num;i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i+"\t");
			}
		}
		
	}
}
