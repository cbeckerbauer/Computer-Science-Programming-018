package club.westcs.OldMrYoung;

public class Animal {

	//Attributes
	
	protected int number;
	protected String sound, type;
	
	/*
	 * protected -	like private where it can only be accessed in the class or a child class
	 * 			 -	Inheritance
	 */
	
	//Constructor
	
		//Never going to have just an animal so no constructor is needed
	
	//Methods
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getSound() {
		return sound;
	}
	public String getType() {
		return type;
	}
	
	public void runSong() {
		if(this.number == 1 && this.type.charAt(this.type.length()-1) == 's') {	//String.charAt(index) indexes a String
			this.type = this.type.substring(0, this.type.length() - 1);
		}
		System.out.println("Old Mr. Young had a farm E-I-E-I-O.");
		System.out.println("And on his farm he had " + this.number + " " + this.type + ".E-I-E-I-O.");
		System.out.println("With a " + this.sound + ", " + this.sound + " here.");
		System.out.println("And a " + this.sound + ", " + this.sound + " there.");
		System.out.println("Here a " + this.sound + " there a " + this.sound + ".");
		System.out.println("Everywhere a " + this.sound + ", " + this.sound + ".");
		System.out.println("Old Mr. Young had a farm E-I-E-I-O.");
		System.out.println();
	}
	
}
