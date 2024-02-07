package club.westcs.GridWorldBeckerbauer;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class TattooCritter extends Critter{
	
	private Random rand = new Random();
	
	public void processActors(ArrayList<Actor> actors)
    {
        for(Actor a: actors) {
        	if(a instanceof Rock) {
        		ArrayList<Actor> allActs = getAllActors();
        		Color newColor = new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
        		for(Actor b : allActs) {
        			b.setColor(newColor);
        		}
        	}
        	else {
        		a.setColor(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
        	}
        }
    }

	private ArrayList<Actor> getAllActors() {
		ArrayList<Location> allLocs = getGrid().getOccupiedLocations();
		ArrayList<Actor> allActs = new ArrayList<Actor>();
		for(Location l : allLocs) {
			allActs.add(getGrid().get(l));
		}
		return allActs;
	}
	
}
