package club.westcs.BlackjackCeciliaB;

public class StrippedCard {
//Attributes
	private int numValue;
	private String suit, value; 
		
//Constructor
	public StrippedCard(int num, String val, String theSuit) {
		numValue = num;
		value= val; 
		suit = theSuit;
	}
		
//Methods
	
	/**
	 * @returns the number value
	 */
	
	public int getNumValue() {
		return numValue;
	}

	/**
	 * @returns the suit
	 */
	
	public String getSuit() {
		return suit;
	}
	
	/**
	 * @returns the value
	 */

	public String getValue() {
		return value;
	}
	
	/**
	 * @returns the value of the suit
	 */
		
	public String toString() {
		return this.value + " of " + this.suit; 
	}

		
		
		
}