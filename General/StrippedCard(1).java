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
	public int getNumValue() {
		return numValue;
	}

	public String getSuit() {
		return suit;
	}

	public String getValue() {
		return value;
	}
		
	public String toString() {
		return this.value + " of " + this.suit; 
	}

		
		
		
}