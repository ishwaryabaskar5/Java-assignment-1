import java.util.Scanner;

public class Sorting {
	public void sort() throws ArrayIndexOutOfBoundsException{
		
		int number, temp, sortedNumber=0;
		int[] array = new int[20];
		
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		
//		if(!(number<=9999999 && number>=1000000)){
//			System.out.println("Enter a valid 7 digit number");
//			return;
//		}
		
		for(int i=0;number !=0;number/=10,i++) {
			array[i] = number % 10;
		}
		
		for(int j=0;j<array.length-1;j++){
			for( int k=j+1;k<array.length;k++){
				if(array[j]<array[k]){
					temp = array[j];
					array[j] = array[k];
					array[k] = temp;
				}
			}
		}
		
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
