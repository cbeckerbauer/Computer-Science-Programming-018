package club.westcs.OldMrYoung;

public class Goose extends Animal{ // extends means that this class inherits 
	// all protected and public stuff (Attributes, Methods, Constructor) 
//Attributes were inherited

//Constructor
public Goose() {
this.type = "geese"; 
this.sound = "honk";
}

@Override // a special comment saying you are overriding a parent class method 
public void runSong() {
	if(this.number == 1 ) {
		this.type = "goose"; 
	}
	super.runSong(); // super.anyMethod() runs the parent class version of the method. 
}

}