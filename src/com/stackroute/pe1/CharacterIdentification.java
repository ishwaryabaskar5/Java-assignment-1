package com.stackroute.pe1;

import java.util.Scanner;

public class CharacterIdentification {

//	Identify a character whether it is capital case, lower case, number or symbol
	public void identifyCharacter(){
		
//		declarartion
		char character;
		
//		Read a character
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		character = sc.next().charAt(0);
		
//		Check a character with ASCII value
		if(character>=97 && character <= 122){
			System.out.println("Small case letter");
		} else if(character>=65 && character <= 90){
			System.out.println("Capital letter");
		} else if(character>=48 && character <= 57){
			System.out.println("Digit");
		} else{
			System.out.println("Symbol");
		}
		
	}
}
