package club.westcs.BlackjackCeciliaB;

import java.util.Scanner;

public class StrippedCurrency {
	//Attributes
			/*
			 * int
			 * 			//playerCurrency 
			 * 			//pot
			 * Object 
			 * 			//Scanner
			 */
	
	public int playerCurrency;
	private int pot;
	private Scanner scan;
	private int Knuts;
	private int Sickles;
	private int Galleons;
	private int galleons;
	private int sickles;
	private int knuts;
	
		//Constructor
			//regular constructor start the pot at 0 and playercurrency at however high you want the player to start 
		
	public StrippedCurrency() {
		scan = new Scanner(System.in);
		playerCurrency = 0;
		Knuts = 20;
		Sickles = 15;
		Galleons = 5;
		pot = 0;
		
	}
	
		//Methods
		
			/*
			 * #1 getPlayerCurrency()
			 * 
			 * #2 bet()
			 * 		-must have a try catch
			 * 		-ask the player how much they want to bet
			 * 		-make sure the bet is greater than 0 and less than or equal to player currency
			 * 		-If the bet is valid take it away from playercurrency 
			 * 		-set the pot += the bet * 2
			 * 
			 *  #3 tie()
			 *  	-print you tied
			 *  
			 *  #4 lose()
			 *  	-print you lose
			 *  	-set the pot to 0
			 *  #5 win()
			 *  	-print you win
			 *  	-add the pot to the playerCurrency
			 *  	- set pot = 0
			 */
	
	public int getPlayerCurrency() {
		Galleons = 5;
		Sickles = 15;
		Knuts = 20;
		System.out.println("You have " + Knuts + " knuts, " + Sickles + " sickles, " + Galleons + " galleons.");
		System.out.println("Galleons are equavilant to $1,000, Sickles are equavilant to $100, and Knuts are equavilant to $1");
		playerCurrency = Knuts + (Sickles * 100) + (Galleons * 1000);
		System.out.println("You have $" + playerCurrency + " in our money.");
		return pot;
	}
	
	public void bet() {
		System.out.println("How many Galleons do you want to bet?");
		galleons = Integer.parseInt(scan.nextLine());
		try {
			if(galleons < Galleons && galleons > 0) {
				System.out.println("Please choose a number in your total currency amount.");
			}
			else {
				 pot += galleons * 1000;
			}
		}
		catch(NumberFormatException e) {
		System.out.println(e);
		System.out.println("Please type only numbers.");
		}
		System.out.println("How many Sickles do you want to bet?");
		sickles = Integer.parseInt(scan.nextLine());
		try {
			if(sickles < Sickles && sickles > 0) {
				System.out.println("Please choose a number in your total currency amount.");
			}
			else {
				pot += sickles * 100;
			}
		}
		catch(NumberFormatException e) {
		System.out.println(e);
		System.out.println("Please type only numbers.");
		}
		System.out.println("How many Knuts do you want to bet?");
		knuts = Integer.parseInt(scan.nextLine());
		try {
			if(knuts < Knuts && knuts > 0) {
				System.out.println("Please choose a number in your total currency amount.");
			}
			else {
				pot += knuts * 1;
			}
		}
		catch(NumberFormatException e) {
		System.out.println(e);
		System.out.println("Please type only numbers.");
		}
		
	}
	
	public void lose() {
		pot = 0;
	}
	
	public void win() {
		playerCurrency += pot;
		pot = 0;
	}
	
	public void resetCurrency() {
		Knuts = 20;
		Galleons = 5;
		Sickles = 15;
	}
	
}
