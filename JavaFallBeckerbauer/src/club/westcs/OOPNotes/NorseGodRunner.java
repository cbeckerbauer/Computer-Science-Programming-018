package club.westcs.OOPNotes;

public class NorseGodRunner {

	public static void main(String[] args) {
		
		NorseGod odin = new NorseGod(false); // the god the user controls
		NorseGod fenris = new NorseGod(true); //the god the computer contorls
		
		while(odin.isAlive() && fenris.isAlive()) {
			odin.choice(fenris);
			if(fenris.isAlive()) {
			fenris.choice(odin);
		}
		
		if(odin.isAlive()) {
			System.out.println(odin.getName() + " has won.");
		}
		else {
			System.out.println(fenris.getName() + " has won.");

		}
		}

	}
}
