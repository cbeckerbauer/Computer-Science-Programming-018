package club.westcs.OOPNotes;

public class VikingShipRunner {

	public static void main(String[] args) {
		
		VikingShip v = new VikingShip();
		VikingShip s = new VikingShip();
		
		while(v.isFloating() && s.isFloating()) {
			v.attack(s);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(s.isFloating()) {
				s.attack(v);
			}
		}
		

	}

}
