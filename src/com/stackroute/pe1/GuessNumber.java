package com.stackroute.pe1;

import java.util.Scanner;

public class GuessNumber {

	public  void guessNumber(){
	
//		declaration
		int target,num;
		
//		Instantiation
		Scanner sc =  new Scanner(System.in);
		
//		generate a random target value
		target = (int)(Math.random()*49+1);
		System.out.println(target);

//		Get a number from user until both num and target are equal
		do{
		
//			read a number
			System.out.println("Guess the number (between 1-50)");
			num = sc.nextInt();
			
//			check with target value
			if(num == target){
				System.out.println("HURRAY!!  YOU ARE CORRECT!!");
			} else if(num<target) {
				System.out.println("OOPS!! GUESS AGAIN..Number guessed is more than original number");
			} else {
				System.out.println("OOPS!! GUESS AGAIN..Number guessed is less than original number");
			}
		}while (num != target);
		
	}
	
}

