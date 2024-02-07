import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		
		/* 
		 * 	----/\
		 * 	---/  \
		 *  --/    \
		 *    ------
		 *    \    /
		 *     \  /
		 *      \/
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How large of a diamond would you like?");
		int size = scan.nextInt();
		
		for(int rows = 0; rows < size; rows++) {
			for(int spaces = 0; spaces < size - rows; spaces++) { //starting large and getting smaller
				System.out.print(" ");
			}
			System.out.print("/");
			for(int spaces = size - rows; spaces < size; spaces++) { //starting small and getting larger
				System.out.print("  ");
			}
			System.out.println("\\");
		}
		
		// for loop to run the rows
			//for loop for the left side
				//(starts small and gets bigger)
			//print the left character (Without a newline) 
			//for loop for the middle spaces
				//Starts large and gets smaller
			//printing the right character (Newline here)
		

	}

}
