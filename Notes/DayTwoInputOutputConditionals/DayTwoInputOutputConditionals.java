import java.util.Scanner; // imports get the data to make objects

public class DayTwoInputOutputConditionals {

	public static void main(String[] args) {
		/*
		 *    \ is a special character in Strings
		 *    it is used to either call a special function or ignore a character 
		 *    \n  newline
		 *    \t its a tab
		 *    \" it will output the quote without ending the String
		 *    	example
		 *    		"She said,"Hello."" will break a normal string 
		 *    		"She said,\"Hello.\"" will work just fine 
		 *    	if you want a \ in a String use two.  "\\"  output one \ 
		 */
		System.out.println("She said,\"Hello.\"");

		
		//Scanner tool used for getting input from the user
		Scanner textScanner = new Scanner(System.in);  //makes an instance of the scanner
		// ObjectName Variable = new ObjectName(params); 
		
		System.out.println("What is your name?");
		String name = textScanner.nextLine(); 
		//String variable = use the scanner to get a string from the user
		
		System.out.println("Hello " + name + ".");
		
		System.out.println("Who is your best friend?");
		name = textScanner.nextLine(); // overwrite the previous value stored in the variable name. 
		
		System.out.println(name + " is awesome!");
		
		//Conditionals - make choices
		
		System.out.println("What is your favorite color?");
		String color = textScanner.nextLine();
		
		if(color.equals("red")) { // if(something is true) { do this code } 
			System.out.println("What an angry choice... Go Big Red");
		}
		else if(color.equals("yellow")) { // as many or few else if statements as you want. // they must follow an if 
			System.out.println("Who chooses yellow? Do you like Iowa or something?");
		}
		else if(color.equals("yellow")) { // as many or few else if statements as you want. // they must follow an if 
			System.out.println("Who chooses yellow? Do you like Iowa or something?");
		}
		else { // else catches anything that was not true above 
			System.out.println(color + " is an interesting choice.");
		}
		
		String word = textScanner.nextLine().toLowerCase(); // a lowercase version of the string will be saved
		//booleans (data type that is either true or false
		/*
		 *  Object.equals(Object)  compares two objects for exact equality
		 *  String.equalsIgnoreCase(String)  compares two Strings for equality ignoring the case of the letters. 
		 *  
		 *  primitives
		 *  
		 *   x == x   check for equality of two primitives
		 *   x != x   checks for inequality of two primitives
		 *   x < x
		 *   x > x
		 *   x <= x
		 *   x >= x 
		 */
	
		// Primitives
			/*
			 * Are basic data types 
			 * 
			 * boolean  - either true or false     boolean choice = true; 
			 * char is a single character   use single quotes  are 8 bits of data     char letter = 'a'; 
			 * 
			 * Numbers
			 * 
			 * byte  - a whole number between -128 and + 128  uses 8 bits of data    byte num = 5; 
			 * short - a whole number between ~-32,000 and  ~+32,000 uses 16 bits of data   short num = 5; 
			 * int  -  a whole number between ~2.8 billion and ~-2.8 billion   32 bits of data    int num = 5; 
			 * long - a big whole number     64 bits of data    long num = 5; 
			 * 
			 * float - a small decimal    32 bits of data      float num = 5.1;
			 * double - a big decimal     64 bits of data      double num = 5.0; 
			 */
		//variable
		int num = 5; 
		//dataType  variable = value ; 
		textScanner.next(); 
		System.out.println("Type a number.");
		int number = textScanner.nextInt(); 
		
	}//Main

}//Class
