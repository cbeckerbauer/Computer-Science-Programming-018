package club.westcs.OOPNotes;

import java.util.Random;
import java.util.Scanner;

public class Viking {

	//Attributes
		/*
		 * the parts of an object
		 * declare the parts but do not assign them values example   private String name; 
		 * set to private access modifier
		 * 		private
		 * 			an access modifier that creates a variable available only to this class 
		 */
		private String name;
		private boolean alive; 
		private int weapons; 
		private Random rand; 
		private Scanner scan;
		
	//Constructor
		/*
		 * gives values to all attributes for each instance of the object 
		 * (Puts the object together)
		 * runs automatically when you make a new instance of an object 
		 * Always set to public 
		 * does not have a return type (no void String....) 
		 * Always named and spelled just like the class 
		 */
		public Viking() {
			rand = new Random();
			scan = new Scanner(System.in); 
			alive = true;
			weapons = rand.nextInt(4) + 2; // randomly 2 - 5 weapons
			name = setName(); 
			System.out.println(this.toString());
		}                                                  // Viking v = new Viking(); 
		
		public Viking(String name) { //overloaded constructor (if a new instance has a String it will call this one)
			rand = new Random();
			scan = new Scanner(System.in); 
			alive = true;
			weapons = rand.nextInt(4) + 2; // randomly 2 - 5 weapons
			this.name = name; 
			System.out.println(this.toString());
		}                                                    //Viking v = new Viking("Bob");
		
	//Methods
		/*
		 * The stuff an object can do.
		 * Look like functions but belong to objects. 
		 * Can be public or private 
		 * Used to get and set values of attributes.
		 */
	public String setName() {
		System.out.println("What is this Viking's name?");
		return scan.nextLine(); 
	}
		
	public String toString() {
		return this.name + " has " + this.weapons + " weapons.";
	}
	
	public boolean isAlive() {
		return this.alive; 
	}
	
	public void setAlive() {
		if(this.alive && this.weapons <= 0) {
			System.out.println(this.name + " has fallen and gone to Valhalla.");
			this.alive = false;
		}
	}
	
	public void loseAWeapon() {
		System.out.println("Garrrrrhhhh");
		System.out.println(this.name + " has lost a weapon.");
		this.weapons--;
		setAlive();
	}
	
	public void attack(Viking other) {
		System.out.println(this.name + " has attacked " + other.getName() + ".");
		if(other.isAlive() && rand.nextBoolean()) {
			other.loseAWeapon();
		}
	}
	
	public String getName() {
		return this.name;
	}
}
