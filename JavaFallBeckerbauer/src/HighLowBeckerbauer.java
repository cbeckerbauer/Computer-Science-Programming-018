import java.util.Random;
import java.util.Scanner;

public class HighLowBeckerbauer {

	public static void main(String[] args) {
		//Objects
		Scanner scan = new Scanner(System.in);
		Random rand = new Random ();
		
		int randNum = rand.nextInt(100)  +  1; //return a random number between 1-10
		int guess = -1;
		int count = 10;
		
		while(randNum != guess && count > 0) { // if both sides are not true the loop will break
			System.out.println("What is your guess?");
			guess = scan.nextInt();
			if(guess == randNum) {
				System.out.println("You Win!");
				break;
			}
			
			else if (guess > randNum) {
				System.out.println("Too High.");
			}
			
			else {
				System.out.println("Too Low.");
			}
			count--; // count++ instead of setting the number one greater we are now decrementing the number
					// count = count - 1; or count-=;
			System.out.print("You have " + count + " guesses left.");
			
		}
		if(count == 0 && randNum != guess) {
			System.out.println("You Lose.");
		}
		// Compound booleans
		/* 
		 * && or and 		if either side of the boolean is false it will evaluate to false		false && true = false
		 * ||  or or 		if either side of the boolean is true it will evaluate to true			false || true = true
		 */

		
	}

}
