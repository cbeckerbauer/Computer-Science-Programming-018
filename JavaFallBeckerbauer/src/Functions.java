import java.util.Scanner;

public class Functions {
	
	//Parts of a Function Heading
	/*
	 * public - access modifier BAsically it means this can be run from any part of the package
	 * static - means there is only ever one instance of this class object (OOP more on this later)
	 * 			- needs to be here in classes with main methods
	 * 			-Separates functions from methods
	 * return type ( what data will this function pass out)
	 * 		- void for no data
	 * 		-string or any other object
	 * 		-any primitive
	 * variable - the name of this function
	 * (parameters) - the data a function needs to run
	 */
	public static void sayHi() {
		System.out.println("Hello ");
	}
	
	public static void sayHiTo(String name) { // function with parameter (data passed in)
		System.out.println("Hello " + name + ".");
	}
	
	public static String askQuestion(String question) { // using String instead of void means the function will pass a String out
		Scanner scan = new Scanner(System.in);
		System.out.println(question);
		return scan.nextLine(); // return passes data out of a function and terminates the function
		//System.out.pintl("Does not matter); // unreachable
	}
	
	public static boolean stringContaints(char letter, String word) { // two params checking if a letter is in a word
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == letter) {// if it finds the letter it returns true
				return true;
			}
		}
		return false; //has not found the letter yet so it returns false
	}
	public static void main(String[] args) {
		sayHi();
		sayHi();
		sayHiTo(" Bob");
		sayHiTo(" Sara");
		String name = askQuestion("What is your name?"); // saves the result of the function into name
		sayHiTo(name); //uses name in another variable
		System.out.println(stringContaints('o', "This word"));
		System.out.println("This example".contains("This")); // String contains(String) already exists and returns a boolean if it finds the substitute

	}

}
