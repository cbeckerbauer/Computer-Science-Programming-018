package club.westcs.OOPNotes;

public class VikingRunner {

	public static void main(String[] args) {
		
		Viking v = new Viking(); //making a new Viking object 
		Viking b = new Viking();
		
		while(v.isAlive() && b.isAlive()) {
			v.attack(b);
			b.attack(v);
		}
	}

}
