import java.util.Scanner;

public class DayThreeLoops {

	public static void main(String[] args) {
		
		//Four types of loops we will discuss (for now only two) 
			//while     for       enhanced for        and recursive(mentioned not used) 
		
		//while loop 
			//use this loop when you do not know how many times something will run. 
			// while(boolean){  code   }
		Scanner scan = new Scanner(System.in); 
		
		String password = "1234"; 
		String attempt = "";  // declare a string that is empty
		
		while(!(password.equals(attempt))) {  // !(true) == false  !( ) will reverse a boolean value (Not) 
			System.out.println("What is the password?"); //asking for a password
			attempt = scan.nextLine(); //saving the value into attempt
		}// the while loop
		System.out.println("Correct");
		int num = 2;
		while(9 > 6) {
			System.out.println("Stuck..." + num);
			num*= 5 ;
			break; // ends the loop 
		}
		
		//while loop with a counter (Not how you should use a while loop) 
		int count = 0; // make a variable
		while(count < 5) { // set a endpoint
			System.out.println(count);
			count++; //increment     //variable++   ==   variable = variable + 1;    ==  variable+=1
		}
		
		//For loop 
			// identical to a while loop with a counter (Just shorter)
			// use this when you know how many times something should run 
			// for(makeAVariable; setAEndpoint ; increment) {   do code }
		for(int count2 = 0 ; count2 < 5; count2++ ) {
			System.out.println(count2);
		}
		
		
	}//main

}//class
