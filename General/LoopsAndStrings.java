
public class LoopsAndStrings {

	public static void main(String[] args) {
		
		String word = "This is an example.";

		//length of a String
		System.out.println(word.length()); // prints the length of a String
		
		//single character
		System.out.println(word.charAt(0)); // prints the first character from our String
		
		/*
		 * Indexing in Java
		 * 
		 * Start counting from 0
		 * The first character is at the o index
		 * The last character is at the length -1 index. 
		 */
		
		//iterates through the String 
			//prints every character on its own line.
		for(int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
		
	//	System.out.println(word.charAt(word.length())); throws an error because it is looking at an index that does not exist
		
		for(int i = 0; i < word.length(); i+=2) {
			word = word.substring(0, i) + " " + word.substring(i, word.length()); 
		}
		
		System.out.println(word);
		
		
		String wordTwo = "Word";
		
		//subString returns a part of a string
		
		System.out.println(wordTwo.substring(0,1)); // prints the w
		System.out.println(wordTwo.substring(0,2)); // prints the wo
		System.out.println(wordTwo.substring(0,3)); // prints the wor
		System.out.println(wordTwo.substring(0,wordTwo.length())); // prints the entire String
		//substring (start character, end character(Not included)) 
		
		for(int i = 0; i == wordTwo.length();i++) {
			System.out.println(wordTwo.substring(0,i));
		}
	}

}
