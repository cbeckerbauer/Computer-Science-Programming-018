package club.westcs.OOPNotes;

import java.util.Random;

public class VikingShip {
//Plan: A ship that has a random sized crew, cannon balls, and a captain. 
	//If the ship loses all crew, or the captain, or all cannon balls it sinks.
	
	//Attributes
	private Viking captain;
	private Viking[] crew;
	private int cannonBalls; 
	private boolean floating; 
	private Random rand; 
	
	//Constructor
	public VikingShip() {
		rand = new Random();
		System.out.println("A new ship is created. Name its captain...");
		captain = new Viking();
		crew = setCrew();
		cannonBalls = rand.nextInt(26) + 25; 
		floating = true; 
	}
	
	//Methods
	
	public Viking[] getCrew() {
		return crew;
	}

	public Viking[] setCrew() {
		Viking[] randCrew = new Viking[rand.nextInt(4) + 2]; 
		String[] names = {"Gor" , "Sven" , "Wroth" , "Leif", "Jack", "Pete", "Morgoth", "Noah"}; 
		for(int i = 0; i < randCrew.length; i++) {
			randCrew[i] = new Viking(names[rand.nextInt(names.length)]);
		}
		return randCrew; 
	}

	public int getCannonBalls() {
		return cannonBalls;
	}

	public void setCannonBalls(int cannonBalls) {
		this.cannonBalls -= cannonBalls;
	}

	public boolean isFloating() {
		return floating;
	}

	public void setFloating() {
		if(this.floating && (this.captain.isAlive() == false || crewDead() || this.cannonBalls <= 0)) {
			System.out.println(this.captain.getName() + "'s ship has sunk.");
			this.floating = false;
		}
	}

	private boolean crewDead() {
		for(int i = 0; i < this.crew.length; i++) {
			if(this.crew[i].isAlive()) {
				return false;
			}
		}
		return true;
	}

	public Viking getCaptain() {
		return captain;
	}
	
	public void attack(VikingShip target) {
		System.out.println(this.captain.getName() + "'s ship has fired on " + target.getCaptain().getName()+ "'s ship.");
		setCannonBalls(rand.nextInt(2) + 1);
		if(rand.nextBoolean()) {
			hitCaptain(target);
			hitCrew(target);
		}
		else {
			System.out.println("Miss.");
		}
		setFloating();
		target.setFloating();
	}

	private void hitCrew(VikingShip target) {
		for(int i = 0; i < target.getCrew().length; i++) {
			if(rand.nextBoolean()) {
				target.getCrew()[i].loseAWeapon();
			}
		}
	}

	private void hitCaptain(VikingShip target) {
		if(rand.nextInt(4) == 0) {
			System.out.println(target.getCaptain().getName() + " has been hit.");
			target.getCaptain().loseAWeapon();
		}
	}
	
	
	
}
