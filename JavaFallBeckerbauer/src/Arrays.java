
public class Arrays {
	
	public static void printNums(int[] nums) {
		for(int i = 0; i < nums.length; i++) {  //array.length returns the number of items in an array
			System.out.println(nums[i]); //array[index] gets the item at a given index of an array
		}
	}
	
	public static void printStrings(String[] words) {
		for(int i = 0; i < words.length; i++) {  //array.length returns the number of items in an array
			System.out.println(words[i]); //array[index] gets the item at a given index of an array
		}
	}

	public static void main(String[] args) {
		
		// Array is a collection of stuff
				//example: a String "word" is an object that has an array of characters 'w', 'o', 'r', 'd'
		int [] nums; //declare
		int [] numbers = {1,5,12,3}; // declare with values
		int [] numbs = new int[10]; //declaring and initializing an array filling it with blank values
										/*
										 * 0 for numbers
										 * false for booleans
										 * null for objects
										 */
		String[] words = new String[5]; //empty objects are filled with null
		
		printNums(numbers);
		printNums(numbs);
		printStrings(words);
		
		numbers[1] = 1000; //replace the value at a given index
		printNums(numbers);
		System.out.println(numbers[0]);  // printing a number at a given index
		
		
		
		
	}

}
