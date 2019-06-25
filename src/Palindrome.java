import java.io.IOException;
import java.util.Scanner;

//Palindrome Class
public class Palindrome {
	
	public  void checkPalindrome() {
	
//		variable declaration and initialization
		int num, rem, temp, rev = 0, sum = 0;
		
//		Read an input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check palindrome:");
		num = sc.nextInt();
		
		temp = num;
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			if (rem % 2 == 0) {
				sum = sum + rem;
			}
			temp /= 10;
		}
		
//		check for palindrome
		if (num == rev) {
		
//			check whether sum is greater than 25
			if (sum > 25) {
				System.out.println(num + " is palindrome and sum of even numbers is greater than 25");
			} else {
				System.out.println(num + " is palindrome and sum of even numbers is less than 25");
			}
		} else {
			System.out.println(num + " is not a palindrome");
		}
	}
	
}
