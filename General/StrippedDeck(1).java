package club.westcs.BlackjackCeciliaB;
import java.util.ArrayList;
import java.util.Random;

public class StrippedDeck {
	//Attributes
		private ArrayList<StrippedCard> deck;
		private Random rand; 
		private String[] faceCards = {"J", "Q" , "K", "A"};
		private String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"}; 
	//Constructor
		public StrippedDeck() {
			rand = new Random();
			deck = new ArrayList<>(); 
			makeDeck(); 
		}
			
	//Methods
		/**
		* makes a new deck of 52 cards
		* The deck is in order 2-10 j-A by suit.
		*/
		public void makeDeck() {
		//deck.add(new Card(2, "2", "Spades")); 
			for(int i = 0; i < suits.length; i++) { // loops for every suit
				for(int q = 2, count = 0; q < 15; q++) { //loops for every card in the suit
					if(q < 11) {
						deck.add(new StrippedCard(q, (q+"") , suits[i])); //made a 2-10 of every suit 
					}
					else if( q < 14) {
						deck.add(new StrippedCard(10, faceCards[count] , suits[i])); // adds j-K of every suit
						count++;
					}
					else {
						deck.add(new StrippedCard(1, faceCards[count] , suits[i])); // adds the aces 
					}
				}
			}
		}
			
		/**
		 * "Shuffles the deck."
		 *  Removes all cards and re-makes the ArrayList of Cards
		 */
		public void resetDeck() {
			deck.clear(); // method to empty the ArrayList 
			makeDeck(); 
		}
			
		/**
		 * gets a random card from the deck
		 * removes that card
		 * @return a random Card
		 */
		public StrippedCard deal() {
			StrippedCard draw = deck.get(rand.nextInt(deck.size()));
			deck.remove(draw); 
			return draw; 
		}
			
}