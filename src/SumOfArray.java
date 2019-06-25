import java.util.Scanner;

public class SumOfArray {
	public void addNumbers(){
	
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers to be added: \n Note: Enter a non-numeric value to stop entering");
		while (sc.hasNext()){
			if(sc.hasNextInt()){
				sum += sc.nextInt();
			} else{
//				System.err.println("Error: Not an integer");
				break;
			}
		}
		System.out.println(sum);
	}
}
