import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Loop {

	public static void main(String[] args) {
		
		//Create Array List
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		for(int i = 0; i < 5; i++) {
			Scanner scan = new Scanner(System.in);  // Create a Scanner object
			System.out.println("Please enter a number:");
			int numberInput = scan.nextInt();
			numberList.add(numberInput);	
		}
		//Add Numbers
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			sum += numberList.get(i);
		}
		//Get Product from Array List
		int product = 1;
		for(int i = 0; i < 5; i++) {
			product *= numberList.get(i);
		}
		//Find Max Number
		int maxNumber = Collections.max(numberList);
		
		//Find Min Number
		int minNumber = Collections.min(numberList);
		
		//Finds the sum, product, largest, and smallest of those numbers
		System.out.println("•Sum: "+sum+"\n•Product: "+product+
				"\n•Largest Number: "+maxNumber+"\n•Smallest Number: "+minNumber);
	}

}
