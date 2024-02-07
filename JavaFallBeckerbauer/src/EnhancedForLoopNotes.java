import java.util.ArrayList;
import java.util.Scanner;

public class EnhancedForLoopNotes {

	public static void main(String[] args) {
		
		String[] words = {"something", "stuff", "things", "word", "item"};
		
		ArrayList<String> wordy = new ArrayList<String>();
		
		for(int i = 0; i < words.length; i++) {
			wordy.add(words[i]);
		}
		
		Scanner scan = new Scanner(System.in);
		
		//enhanced for loop
		//for(DataType variable : collection) {code}
		for(String word : words) {
			System.out.println(word);
		}
		
		for(String word : wordy) {
			System.out.println("The word is " + word + ". Would you like to remove it? (Its a Trap!)");
			String answer = scan.nextLine();
			if(answer.equalsIgnoreCase("No")) {
				break;
			}
			wordy.remove(answer);
		}
		
		//Cannot change the size of a collection in an enhanced for loop. It breaks stuff
		
		int[] nums = {1,2,3,4,5};
		
		for(int num : nums) {
			System.out.println(num);
		}
		
		

	}

}
