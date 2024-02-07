package club.westcs.NifflerCeciliaB;

import java.util.Random;

public class Dice {

	//Attributes
		private Random rand;
		private double chance;
	//Constructor
		public Dice() {
			rand = new Random();
			chance = 1.0;
		}
	//Methods
		public boolean roll() {
			int val = rand.nextInt(6) + 1; // random number between 1-6
			if(this.chance >= val) { // the dice has rolled a number that corresponds to probability that the pet does the thing
				if(this.chance < 6) { // probability is not 100%
					this.chance++; //probability goes up by 1/6th
				}
				return true; //yes do the trick
			}
			return false; // no the pet failed
		}
		
		public String getProb() {
			int num = (int)((this.chance / 6.0) * 100);
			return num + "%";
		}
}
