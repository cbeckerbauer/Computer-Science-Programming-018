package club.westcs.OldMrYoung;

public class Frogrus extends Animal{
	
	//Attributes

		//were inherited from Animal

	//Constructor

	public Frogrus() {
		this.type = "Frogrus";
		this.sound = "frogrus";
		}
	
	@Override //a special constructor saying you are overriding a parent class method
	public void runSong() {
		if(this.number == 1) {
			this.type = "Frogrus";
		}
		super.runSong();	// super.anymethod() runs the parent class version of the method
	}

}
