package club.westcs.BlackjackCeciliaB;

import java.util.ArrayList;
import java.util.Scanner;

public class StrippedGameLogic {
	//Attributes
			/*
			 * String
			 * 		playerName
			 * Objects
			 * 		Deck
			 * 		Chips
			 * 		Scanner
			 * 		ArrayLists (2)
			 * 			playerHand<StrippedCard>
			 * 			dealerHand<StrippedCard>
			 */
	/**
	 * A string of playerName
	 * A deck
	 * A currency
	 * A Scanner
	 * Two ArrayLists for each hand(playerHand and dealerHand)
	 */
	private String playerName;
	private StrippedDeck deck;
	private StrippedCurrency currency;
	private Scanner scan;
	private ArrayList<StrippedCard> playerHand;
	private ArrayList<StrippedCard> dealerHand;

	
		
		//Constructor
			//Regular constructor stuff 
	/**
	 * New Scanner
	 * get the player's name
	 * make a new deck
	 * make a new currency
	 * make a new ArrayList for each hand
	 * Run the game
	 */
	public StrippedGameLogic() {
		scan = new Scanner(System.in);
		setName();
		deck = new StrippedDeck();
		currency = new StrippedCurrency();
		playerHand = new ArrayList<>();
		dealerHand = new ArrayList<>();
		runGame();
	}
		
		//Methods
			
			/*
			 * #1 setName()
			 * #2 runGame()
			 * 		like the pet live method
			 * 		while the player has currency
			 * 			call the game logic methods (deal, printHands, bet, hitStay, dealerTurn, determineWinner, resetHands/deck
			 * #3 dealStrippedCard(ArrayList<StrippedCard> hand) 
			 * 		if the hand is empty add two StrippedCards
			 * 		otherwise add one StrippedCard
			 * #4 printHand(AL<StrippedCard> hand, boolean firstStrippedCard)
			 * 		for every StrippedCard in the hand
			 * 			if the firstStrippedCard is true
			 * 				print the StrippedCard's toString()
			 * 			else
			 * 				print mystery StrippedCard
			 * 				set firstStrippedCard to true
			 * #5 totalHand(AL<StrippedCard> hand) 
			 * 		need an int for the total
			 * 		need a boolean for the ace
			 * 		for every StrippedCard in the hand
			 * 			add the numValue to the total
			 * 			if the StrippedCard is an ace
			 * 				set the bool to true
			 * 		if the bool is true and the total is less than 12
			 * 			add 10 to the total 
			 * 		return the total
			 * #6 hitStay()
			 * 		while the playerTotal is < 21 
			 * 			ask if the player wants to hit or stay
			 * 			if they hit give the playerHand a StrippedCard
			 * 			else break
			 * #7 dealerTurn()
			 * 		while the dealertotal is less than 17
			 * 			add a StrippedCard to the dealerhand
			 * #8 determineWinner()
			 * 		-Decides who wins and calls currency methods
			 * 		--check if the player and dealer have tied or both gone bust (over 21) (T) 
			 * 		--check if the player has gone bust (L)
			 * 		--Check if the dealer has gone bust or if the playerhandTotal > dealerHandTotal (W)
			 * 		--else (L) 
			 * #9 resetHands()
			 * 		- clear the playerhand and dealerhand
			 * 		- reset the deck
			 * #10 create the currency class stuff
			 * #11 resetGame()
			 * 		- like the resetPet method
			 * 		-if the player is out of currency 
			 * 			-ask if they want to play again
			 * 			-if yes reset the currency
			 * 			-else end the game 
			 */
	
	/**
	 * Ask what is your name
	 * save and name the scanner scan
	 * @return the player's name
	 */
	
	public String setName() {
		System.out.println("What is your name?");
		playerName = scan.nextLine();
		return playerName;
	}
	
	/**
	 * give the player their money
	 * have them bet their money
	 * @while the player has money
	 * deal them a card
	 * print what they have in their hand and drew
	 * hit or stay
	 * dealer's turn
	 * print what the player drew
	 * print the hand
	 * print what the dealer has
	 * print what the dealer drew
	 * determine the winner
	 * reset the hand and deck
	 * reset the game and ask if they want to play again
	 * shuffle the deck
	 * reset the deck
	 */
	
	public void runGame() {
		this.currency.getPlayerCurrency();
		this.currency.bet();
		while(this.currency.playerCurrency > 0) {
			dealStrippedCard(playerHand);
			printHand(playerHand,true);
			hitStay();
			dealerTurn();
			System.out.println(this.playerName + " has:");
			printHand(playerHand,true);
			System.out.println("The dealer has: ");
			printHand(dealerHand,true);
			determineWinner();
			resetHand();
			resetGame();
			shuffling();
		}
			this.deck.resetDeck();
			
		}
	
	/**
	 * Mr young's code for shuffling 
	 * all i know is that is does it correctly and has a try catch 
	 */
	
	private void shuffling() {
		String drama = "Shuffling";
		for(int i = 0; i < 4; i++) {
			drama += ".";
			System.out.println(drama);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	/**
	 * @if the hand is empty
	 * add two cards
	 * @param hand
	 * @else 
	 * give one card
	 */

	public void dealStrippedCard(ArrayList<StrippedCard> hand) {
		if(hand.isEmpty()) {
			hand.add(this.deck.deal());
			hand.add(this.deck.deal());
		}
		else {
			hand.add(this.deck.deal());
			
		}
	}
	
	/**
	 * prints the hand
	 * @param hand
	 * @param firstStrippedCard
	 * if the dealer has drawn their first card it is labeled as the first card
	 */
	
	public void printHand(ArrayList<StrippedCard> hand, boolean firstStrippedCard) {
	
		for(StrippedCard c: hand) {
			if(firstStrippedCard) {
				System.out.println(c.toString());
			}
			else{
				System.out.println("Hidden StrippedCard");
				firstStrippedCard = true;
			}
		}
	
	}
	
	/**
	 * the ace is by defult false
	 * if the player has an ace and their total is less that 10 then the ace 10
	 * adds the card value to the total
	 * @param hand
	 * @return the total
	 */
	
	public int totalHand(ArrayList<StrippedCard> hand) {
		int total = 0;
		boolean ace = false;
		for(StrippedCard c: hand) {
		
				total += c.getNumValue();
			if(c.getNumValue() == 1)
				ace = true; 
			}
		if (ace && total< 12){
			
			total += 10;
		}
		return total;
	}
	
	/**
	 * @while the player has less then 21
	 * ask if they want to hit or stay
	 * save the answer
	 * @if the answer says hit 
	 * deals 1 card
	 * prints what they drew
	 * @else it breaks the method as they have a bust
	 */
	
	public void hitStay() {
		while(totalHand(playerHand) < 21) {
			System.out.println("Do you want to hit or to stay?");
			String answer =scan.nextLine().toLowerCase();
			if(answer.equals("hit")) {
				dealStrippedCard(playerHand);
				System.out.println("You drew: ");
				System.out.println("      " + playerHand.get(playerHand.size()-1).toString());
			}
			else {
				break;
			}
		}
	}
	
	/**
	 * @while the dealer has less then 17 as its total
	 * it adds 1 card
	 */
	
	public void dealerTurn() {
		while(totalHand(dealerHand) < 17) {
			dealerHand.add(this.deck.deal());
		}
	}
	
	/**
	 * @if the dealer and the player both have 21 
	 * they tie
	 * resets the game so there can be tie breaker
	 * @else if the player has gone over 21
	 * player automatically loses
	 * @else if the dealer has gone over 21 or the player has more points then the dealer
	 * then the player wins
	 * @else the player loses
	 */
	
	public void determineWinner() {
		if(totalHand(playerHand) > 21 && totalHand(dealerHand) > 21) {
			System.out.println("You and the dealer have a bust and have tied");
			System.out.println("Starting another game as a tie breaker.");
			this.deck.resetDeck();
			resetHand();
			resetGame();
		}
		else if(totalHand(playerHand) > 21) {
			System.out.println("You have a bust and therefore has lost.");
			this.currency.lose();
		}
		else if(totalHand(dealerHand) > 21 || totalHand(playerHand) > totalHand(dealerHand)) {
			System.out.println("You have won!");
			this.currency.win();
		}
		else {
			System.out.println("You have lost.");
			this.currency.lose();
		}
	}
	
	/**
	 * clears the player hand 
	 * clears the dealer hand
	 * resets the deck
	 */
	
	public void resetHand() {
		playerHand.clear();
		dealerHand.clear();
		this.deck.resetDeck();
	}
	
	/**
	 * asks if you want to play again 
	 * saves the answer
	 * @if the answer is yes
	 * resets the hand
	 * resets the currency
	 * run the game again
	 * @else 
	 * thanks them for playing
	 * terminates 
	 */
	
	public void resetGame() {
		System.out.println("Do you want to play again?");
		String answer = scan.nextLine().toLowerCase();
		if(answer.equals("yes")) {
			resetHand();
			this.currency.resetCurrency();
			runGame();
		}
		else {
			System.out.println("Thanks for playing!");
			System.exit(0);
		}
	}
	
}
