package com.stackroute.pe1;

import java.util.Scanner;

public class Sorting {
	public void sort() throws ArrayIndexOutOfBoundsException{
	
//		declaration and initialization
		int number, temp, sortedNumber=0;
		int[] array = new int[20];
		
//		Reads a number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		number = sc.nextInt();
		
//		converts a number into array of numbers
		for(int i=0;number !=0;number/=10,i++) {
			array[i] = number % 10;
		}
		
//		sort the array elements
		for(int j=0;j<array.length-1;j++){
			for( int k=j+1;k<array.length;k++){
				if(array[j]<array[k]){
					temp = array[j];
					array[j] = array[k];
					array[k] = temp;
				}
			}
		}
		
//		converts array into a number
		for(int i=0;i<array.length;i++){
			if(array[i] == 0){
				break;
			} else {
				sortedNumber = (sortedNumber * 10) + (array[i]);
			}
		}
		
		System.out.println("Sorted Number:"+sortedNumber);
	}
}
