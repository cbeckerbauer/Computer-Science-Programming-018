import java.util.Scanner;

public class ForLoopPractice {

	public static void main(String[] args) {
	
		//for loop is the to use if you know how many times you want something to run
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How large of a box do you want to make?");
		int size = scan.nextInt();
		
		for(int q = 0; q < size; q++) {
			for(int i = 0; i < size; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
