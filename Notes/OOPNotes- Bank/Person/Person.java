package club.westcs.OOPNotes;

import java.util.Random;
import java.util.Scanner;

public class Person {
//Attributes
	private String name;
	private double balance;
	private int iDNumber;
	private Scanner scan; 
	private String pin; 
	
//Constructor
	public Person() {
		scan = new Scanner(System.in); 
		name = setName();
		balance = setBalance();
		iDNumber = setiDNumber();
		pin = setPin(); 
	}
//Methods
	public String getName() {
		return name;
	}
	
	public String setName() {
		System.out.println("What is your name?");
		String name = scan.nextLine();
		boolean verify = true;
		while(verify) {
			System.out.println("So your name is " + name + ".");
			System.out.println("Is that correct?");
			String yesNo = scan.nextLine().toLowerCase();
			if(yesNo.contains("yes")) {
				verify = false;
			}
			else {
				System.out.println("Sorry about that...");
				System.out.println("What is your name?");
				name = scan.nextLine();
			}
		}
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int setBalance() {
		System.out.println("What is your starting balance?");
		String bal = scan.nextLine();
		return Integer.parseInt(bal); 
	}
	
	public int getiDNumber() {
		return iDNumber;
	}
	
	public int setiDNumber() {
		String blank = "9"; // all ids will start with 9
		Random rand = new Random(); 
		for(int i = 0; i < 8; i++) { //loop 8 times
			blank += rand.nextInt(10); // add a random number 0 - 9 to the ID
		}
		System.out.println("Your ID is " + blank + "."); 
		return Integer.parseInt(blank); // return an int version of the ID
	}
	
	public String getPin() {
		return pin;
	}
	
	public String setPin() {
		System.out.println("What is your pin number?");
		String name = scan.nextLine();
		boolean verify = true;
		while(verify) {
			System.out.println("Please retype your pin");
			String yesNo = scan.nextLine().toLowerCase();
			if(yesNo.equals(name)) {
				verify = false;
			}
			else {
				System.out.println("Sorry the pins do not match.");
				System.out.println("What is your pin?");
				name = scan.nextLine();
			}
		}
		return name;
	}
	
	
	public String toString() {
		return "Name: " + this.name + "\nID: " + this.iDNumber + "\nPin: " + this.pin + "\nBalance: $" + this.balance;  
	}
}
