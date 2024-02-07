package club.westcs.OldMrYoung;

public class Liopleuodon extends Animal{
	
	//Attributes

		//were inherited from Animal

	//Constructor

	public Liopleuodon() {
		this.type = "Liopleuodon";
		this.sound = "ARGHHHGHUHHHHARGHHUHHH";
		}
	
@Override
	
	public void runSong() {
		if(this.number == 1 && this.type.charAt(this.type.length()-1) == 's') {	//String.charAt(index) indexes a String
			this.type = this.type.substring(0, this.type.length() - 1);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.err.println("Old Mr. Young had a farm E-I-E-I-O.");
		System.err.println("And on his farm he had " + this.number + " " + this.type + ".E-I-E-I-O.");
		System.err.println("With a UHHHHHHHHHGGGGGGGGGAAAAAAAAGGGGGGGGGHHHHHHH.");
		System.err.println("And a UHHHHHHHHHGGGGGGGGGAAAAAAAAGGGGGGGGGHHHHHHH.");
		System.err.println("Here a UHHHHHHHHHGGGGGGGGGAAAAAAAAGGGGGGGGGHHHHHHH.");
		System.err.println("Everywhere a UHHHHHHHHHGGGGGGGGGAAAAAAAAGGGGGGGGGHHHHHHH.");
		System.err.println("Old Mr. Young had a farm E-I-E-I-O.");
		System.out.println();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


}
