import java.io.IOException;
import java.util.Scanner;

public class Main {
	//	main method
	public static void main(String[] args) throws IOException,ArrayIndexOutOfBoundsException {
		
		int option;
		
//		Instantiation
		Palindrome palindrome = new Palindrome();
		TomJerry tomJerry = new TomJerry();
		VowelConsonant vowelConsonant = new VowelConsonant();
		NumberSeries numberSeries = new NumberSeries();
		SumOfArray sumOfArray = new SumOfArray();
		CharacterIdentification characterIdentification = new CharacterIdentification();
		Sorting sorting = new Sorting();
		
		System.out.println("Enter the option");
		System.out.println("1.Palindrome\t2.TomJerry\t3.VowelConstant");
		System.out.println("4.NumberSeries\t5.SumOfArray\t6.CharacterIdentification");
		System.out.println("7.Sorting\t");
		
//		Read option
		Scanner sc = new Scanner(System.in);
		option = sc.nextInt();
		
		switch (option) {
			case 1:
				palindrome.checkPalindrome();
				break;
			case 2:
				tomJerry.verifyTomOrJerry();
				break;
			case 3:
				vowelConsonant.checkVowel();
				break;
			case 4:
				numberSeries.generateSeries();
				break;
			case 5:
				sumOfArray.addNumbers();
				break;
			case 6:
				characterIdentification.identifyCharacter();
				break;
			case 7:
				sorting.sort();
				break;
			default:
				System.out.println(("Not a valid option"));
				
		}
	}
}
