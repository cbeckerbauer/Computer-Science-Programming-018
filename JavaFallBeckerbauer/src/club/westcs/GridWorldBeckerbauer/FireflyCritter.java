package club.westcs.GridWorldBeckerbauer;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

public class FireflyCritter extends Critter{
	
	private Random rand;
	private int state;
	
	public FireflyCritter() {
		rand = new Random();
		state = 0;
		setColor(Color.BLACK);
	}
	@Override
	
	public void act() {
		if(getGrid() == null) {
			return;
		}
	ArrayList<Actor> otherFlies = getOtherFlies();	
	if(otherFlies.isEmpty()) {
		makeMove(selectMoveLocation(getMoveLocations()));
	}
	else {
		moveToFlies(otherFlies);
	}
	flash();
	}
	
	private void moveToFlies(ArrayList<Actor> otherFlies) {
		Actor otherFly = pickAFly(otherFlies);
		for(int i = 0; i < 2; i++) {
			int dir = getLocation().getDirectionToward(otherFly.getLocation());
			Location next = getLocation().getAdjacentLocation(dir);
			if(getGrid().get(next) == null) {
				makeMove(next);
			}
		}
	}
	
	private Actor pickAFly(ArrayList<Actor> otherFlies) {
		double dist = 1000000;
		Actor choice = new Actor();
		for(Actor a: otherFlies) {
			if(isCloser(a, dist)) {
				choice = a;
				dist = saveDist(a);
			}
		}
		return choice;
	}
	
	private boolean isCloser(Actor a , double dist) {
		return saveDist(a) <= dist;
	}
	
	private double saveDist(Actor a) {
		return Math.sqrt(Math.pow(a.getLocation().getCol() - this.getLocation().getCol() , 2) +
				Math.pow(a.getLocation().getRow() - this.getLocation().getRow() , 2));
	}
	private ArrayList<Actor> getOtherFlies() {
		ArrayList<Location> locs = getGrid().getOccupiedLocations();
		ArrayList<Actor> flies = new ArrayList<>();
		for(Location loc : locs) {
			Actor temp = getGrid().get(loc);
			if(temp instanceof FireflyCritter && temp.getColor().equals(Color.YELLOW) && !(temp.equals(this))) {
				flies.add(temp);
			}
		}
		return flies;
	}
	private void flash() {
		if(rand.nextInt(26) < 3 && this.state <= 0) {
			setColor(Color.YELLOW);
			this.state = 2;
		}
		else {
			this.state --;
			if(this.state <= 0) {
				setColor(Color.BLACK);
			}
		}
	}
	
}
