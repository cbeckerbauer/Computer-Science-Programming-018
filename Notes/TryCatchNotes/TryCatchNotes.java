import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchNotes {

	public static void main(String[] args) {
		
		//When code is likely to break use a try/catch statement
		// Any code inside the try will be attempted.
		// Code inside the catch is what runs if the try results in an error
		
		Scanner textScan = new Scanner(System.in); 
		Scanner numScan = new Scanner(System.in); 
		
		while(true) {
			try {
				System.out.println("Please type a number...");
				int num = numScan.nextInt();
				System.out.println(num);
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("Not a number...");
				numScan.next();
			}
		}
		
		
		while(true) {
			try {
				System.out.println("Please type a number...");
				int num = Integer.parseInt(numScan.nextLine()); // use parsing rather than rely on the scanner
				System.out.println(num);
				break;
			}
			catch(NumberFormatException e) { // use the specific kind of error you expect. 
				System.out.println("Not a number...");
			}
		}
		
		
		
	}

}
