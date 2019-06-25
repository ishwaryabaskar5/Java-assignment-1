import java.util.Scanner;

public class CharacterIdentification {
	public void identifyCharacter(){
		
		char character;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		character = sc.next().charAt(0);
		
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
