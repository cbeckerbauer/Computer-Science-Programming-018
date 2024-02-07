package club.westcs.GridWorldBeckerbauer;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.*;

public class WeatherCritterLevel3 extends Critter{
	private Random rand;
	private boolean rain, ice, highWinds, first;
	private int step1, ourStep, count;
	private Actor temp;
	ActorWorld world = new ActorWorld();
	
	public WeatherCritterLevel3() {
		rand = new Random();
		rain = false;
		ice = false;
		highWinds = false;
		ourStep = 0;
		first = true;
		count = 0;
		}
	
	public void run() {
		move1();
		ArrayList<Actor> neighbors = this.getGrid().getNeighbors(getLocation());
        for(Actor a: neighbors) {
        	if(a instanceof Bug) {
        		first = false;
				Weather();
			}
			else {
				move1();
		}}
		}
	
	private void move1() {
		count += 1;
		first = false;
	        Grid<Actor> gr = getGrid();
	        if (gr == null)
	            return;
	        Location loc = getLocation();
	        Location next = loc.getAdjacentLocation(getDirection());
	        if (gr.isValid(next)) {
	            moveTo(next);
	        	step1 += 1;
	}
	        ArrayList<Actor> neighbors = this.getGrid().getNeighbors(getLocation());
		    for(Actor a: neighbors) {
		     if(a instanceof Bug) {
		    	Weather();
		    	}}	}
	

	
	public void Weather() {
			while(rain == false || ice == false || highWinds == false) {
		rain = rand.nextBoolean();
		if(rain) {
			for(int i = 0; i < 20; i++) {
				Flower rain1 = new Flower();
				rain1.setColor(Color.BLUE);
				rain1.putSelfInGrid(getGrid(), randomLocation());
				if(count == 3) {
					rain1.removeSelfFromGrid();
				}
			}
		}
		else if(rain != true) {
			ice = rand.nextBoolean();
			if(ice) {
				for(int i = 0; i < 20; i++) {
					Rock ice1 = new Rock();
				ice1.setColor(Color.BLUE);
				ice1.putSelfInGrid(getGrid(), randomLocation());
				if(count == 3) {
					ice1.removeSelfFromGrid();
				}
			}}
			else if(ice != true) {
				highWinds = rand.nextBoolean();
				if(highWinds) {
					act();
				}
			}
		}}}
	
	@Override
	
	public void act() {
		ArrayList<Location> locs = getGrid().getOccupiedLocations();
		for(Location l: locs) {
			temp = getGrid().get(l);
			if(temp != null ) {
			this.determineOppositeDirection(temp);
			move();
			}}
		}

	public Location randomLocation() {
		Location loc = new Location(0,0);
		do {
			loc = new Location(rand.nextInt(this.getGrid().getNumRows()), rand.nextInt(this.getGrid().getNumCols()));
		}
		while(getGrid().get(loc) != null);
		//System.out.println(loc);
		return loc;
	}

	public int determineOppositeDirection(Actor temp) {
		if(this.getGrid() == null || temp.getGrid() == null) {
			return 0;
		}
		if(this.getDirection() == Location.EAST) {
			temp.setDirection(Location.WEST);
		}
		else if(this.getDirection() == Location.WEST) {
			temp.setDirection(Location.EAST);
		}
		else if(this.getDirection() == Location.NORTH) {
			temp.setDirection(Location.SOUTH);
		}
		else if(this.getDirection() == Location.SOUTH) {
			temp.setDirection(Location.NORTH);
		}
		else if(this.getDirection() == Location.NORTHWEST) {
			temp.setDirection(Location.SOUTHEAST);
		}
		else if(this.getDirection() == Location.NORTHEAST) {
			temp.setDirection(Location.SOUTHWEST);
		}
		else if(this.getDirection() == Location.SOUTHWEST) {
			temp.setDirection(Location.NORTHEAST);
		}
		else if(this.getDirection() == Location.SOUTHEAST) {
			temp.setDirection(Location.NORTHWEST);
		}
		return 0;
	}
	
	public void move() {
		super.act();
	}
	
}
