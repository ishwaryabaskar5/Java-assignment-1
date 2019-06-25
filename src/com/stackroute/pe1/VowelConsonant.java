package com.stackroute.pe1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class VowelConsonant {

//	method checks a char is vowel or consonent
	public void checkVowel() {
	try {
//		declaration
		String str;
		char[] word;

//		Read a string
		System.out.println("Enter a word");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		str = reader.readLine();

//		Convert a string to char array
		word = str.toCharArray();
		
		for (int i = 0; i < word.length; i++) {
//			find a char is vowel or consonent
			if (word[i] >= 97 && word[i] <= 122 || word[i] >= 65 && word[i] <= 90) {
				if (word[i] == 'a' || word[i] == 'e' || word[i] == 'i' || word[i] == 'o' || word[i] == 'u') {
					System.out.println("Vowel ");
				} else {
					System.out.println("Consonant ");
				}
			} else {
				System.err.println("Error: Not a letter");
				break;
			}
		}
	} catch (IOException ie){
		System.out.println("IO Exception");
	}
	}
}
