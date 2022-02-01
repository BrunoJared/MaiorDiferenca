import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramMaxPrice {

	public static void main(String[] args) {

		double larger ;
		double smaller;
		double amountOfNumbers;
		double arrayValues[];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type the amount of numbers: ");
		amountOfNumbers = scan.nextDouble();
		arrayValues = new double[(int) amountOfNumbers];
		
		for(int i = 0; i<amountOfNumbers; i++) {
			System.out.println("Type the Value"+(i+1));
			arrayValues[i] = scan.nextDouble();
		}
		larger = arrayValues[0];
		smaller = arrayValues[0];
		for(int i = 1; i<amountOfNumbers; i++) {
			if(arrayValues[i] > larger ) {
				larger = arrayValues[i];
			}
			else if(arrayValues[i]< smaller){
				smaller = arrayValues[i];
			}
		}
		
		System.out.println("Best position to sell: " + larger);
		System.out.println("Worst position is:  " + smaller);
		System.out.println("The maximum difference between: "+( larger - smaller ));

		
	}
}