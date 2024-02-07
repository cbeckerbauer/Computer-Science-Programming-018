package club.westcs.OldMrYoung;

public class Fox extends Animal{ // extends means that this class inherits 
	// all protected and public stuff (Attributes, Methods, Constructor) 
//Attributes were inherited

//Constructor
public Fox() {
this.type = "foxes"; 
this.sound = "ding ding ding da dinga ding ding";
}

@Override
public void runSong() {
	if(this.number == 1 ) { 
		this.type = "fox"; 
	}
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.err.println("Old Mr. Young had a farm. E-I-E-I-O.");
	System.err.println("And on his farm he had " + this.number + " " + this.type + " E-I-E-I-O.");
	System.err.println("With a " + this.sound + ", " + this.sound + " here.");
	System.err.println("And a " + this.sound + ", " + this.sound + " there.");
	System.err.println("Here a " + this.sound + "there a " + this.sound + ".");
	System.err.println("Everywhere a " + this.sound + ", " + this.sound + ".");
	System.err.println("Old Mr. Young had a farm. E-I-E-I-O.");
	System.out.println();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	// System.exit(0); ends the console 
}


}
