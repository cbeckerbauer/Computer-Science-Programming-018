package GridWorld;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import info.gridworld.actor.*;
import info.gridworld.grid.Location;

public class AssassinCritter extends Critter{
	//Attributes
	private Random rand;
	
	//Constructors
	public AssassinCritter() {
		setColor(new Color(255 , 255 , 255));
		rand = new Random();
	}
	
	//Methods
	@Override
	public void act() {
		if(getGrid() == null) {
			return;
		}
		makeMove(getRandomLocation()); 
	}
	
	@Override
	public void processActors(ArrayList<Actor> actors) {
		for(Actor a : actors) {
			if(a instanceof Bug) {
				a.removeSelfFromGrid();
			}
			else if(!(a instanceof Rock)) {
				a.removeSelfFromGrid();
			}
		}
	}
	
	public Location getRandomLocation() {
		Location n = new Location(getGrid().getNumRows(),getGrid().getNumCols());
		System.out.println(n);
		Location l = new Location(rand.nextInt(getGrid().getNumRows()), rand.nextInt(getGrid().getNumCols()));
		int count = 0;
		while(!(getGrid().get(l) == null) && count < 100) {
			l = new Location(rand.nextInt(getGrid().getNumRows()), rand.nextInt(getGrid().getNumCols()));
			count++;
		}
		if(count == 100) {
			return getLocation(); 
		}
		return l; 
	}
}
