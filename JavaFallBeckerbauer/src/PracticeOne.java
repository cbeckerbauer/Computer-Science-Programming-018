import java.util.Scanner;

public class PracticeOne {

	public static void main(String[] args) {
		
		// make a scanner
		
		Scanner textScanner = new Scanner(System.in);
		
		//ask a question (Favorite food)
		
		System.out.println("What is your favorite food?");
		String food = textScanner.nextLine ();
		
		//save the response in a String
		
		System.out.println( food + " is great!");
		
		//have an if/ else if/ else that responds to the question

		System.out.println("What is your favorite class?");
		String course = textScanner.nextLine();
		
		if(course.equals("math")) {
			System.out.println("Numbers shouldn't mix with letters");
		}
		else if(course.equals("science")) {
			System.out.println("Science has a lot of explosives.");
		}
		else {
			System.out.println(course + " is an interesting class.");
		}
	}

}
