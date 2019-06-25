import java.util.Scanner;

public class NumberSeries {
	  public void generateSeries(){
	  	
	  	int num;
	  	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the maximum value of number series:");
		num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			for (int j = 1; j <= i; j++) {
				System.out.println(i);
			}
		}
		
	}
}
