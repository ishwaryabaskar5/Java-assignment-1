package com.stackroute.pe1;

import java.util.Scanner;

public class TomJerry {
	public void verifyTomOrJerry(){
		int num;
		
		//		Read an input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check tom or jerry");
		num = sc.nextInt();
		
//		checks for num is between 20 and 30
		if(num>20 && num<30){
			if(num%2 == 0){
				System.out.println("Tom");
			} else {
				System.out.println("Jerry");
			}
		} else {
			System.out.println("Neither Tom nor Jerry");
		}
	}
}
