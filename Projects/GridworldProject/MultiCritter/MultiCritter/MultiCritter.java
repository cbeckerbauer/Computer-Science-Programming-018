package club.westcs.GridworldRYoung;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

public class MultiCritter extends Critter{
	
	private Random rand;
	
	//constructor 
	public MultiCritter() {
		rand = new Random();
		Color r = new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
		setColor(r);
	}

	 public void act()
	    {
	        if (getGrid() == null)
	            return;
	       ArrayList<Location> byMe = getGrid().getEmptyAdjacentLocations(getLocation());
	       multiMe(byMe);
	    }

	private void multiMe(ArrayList<Location> byMe) {
		for(Location loc: byMe) {
			if(rand.nextBoolean()) {
				new MultiCritter().putSelfInGrid(getGrid(), loc);
			}
		}
	}
	
	
}
