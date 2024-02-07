package club.westcs.GridWorldBeckerbauer;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class ThanosCritterLevel2 extends Critter{

	private Random rand;
	private ArrayList<Actor> halfActs;
	private ArrayList<Location> allLocs1;
	private boolean hasInfinityStones, firstRun, ender;
	private Rock spaceStone, realityStone, mindStone, powerStone, timeStone, soulStone; 
	
	
	public ThanosCritterLevel2() {
		ender = false;
		firstRun = true;
		rand = new Random();
		hasInfinityStones = false;
		halfActs = new ArrayList<>();
		allLocs1 = new ArrayList<>();
		spaceStone = new Rock();
		spaceStone.setColor(Color.BLUE);
		mindStone = new Rock();
		mindStone.setColor(Color.YELLOW);
		realityStone = new Rock();
		realityStone.setColor(Color.RED);
		powerStone = new Rock();
		powerStone.setColor(new Color(128, 0, 128));
		timeStone = new Rock();
		timeStone.setColor(Color.GREEN);
		soulStone = new Rock();
		soulStone.setColor(Color.ORANGE); 
	}
	
	
	
	public void addStones() {
		spaceStone.putSelfInGrid(getGrid(),randomLocation() );
		realityStone.putSelfInGrid(getGrid(), randomLocation() );
		mindStone.putSelfInGrid(getGrid(), randomLocation() );
		powerStone.putSelfInGrid(getGrid(), randomLocation() );
		timeStone.putSelfInGrid(getGrid(), randomLocation() );
		soulStone.putSelfInGrid(getGrid(), randomLocation() );
	}
	
	public Location randomLocation() {
		Location loc = new Location(0,0);
		do {
			
			loc = new Location(rand.nextInt(getGrid().getNumRows()), rand.nextInt(getGrid().getNumCols())); 
		}
		while(getGrid().get(loc) != null);
		System.out.println(loc);
		return loc;
	}
	
	public void act() {
		if(getGrid() == null || ender) {
			return;
		}
		if(firstRun) {
			firstRun = false;
			addStones();
		}
		ArrayList<Actor> infinityStones = getInfinityStones();	
		if(infinityStones.isEmpty()) {
			doomed();
			System.out.println("Mr.Stark, I don't feel so good....");
			System.out.println("Doomed " + halfActs);
			remove();
			ender = true;
		}
		else {
			moveToInfinityStones(infinityStones);
		}
	}

	public ArrayList<Actor> doomed() {
		halfActs.clear();
		ArrayList<Location> allLocs1 = getGrid().getOccupiedLocations(); 
		for(Location b: allLocs1) {
			if(!(getGrid().get(b) .equals(this))) {
				 halfActs.add(getGrid().get(b));
				 if(halfActs.size() >= allLocs1.size()/2) {
					 break;
				 }
			}
		}
		return halfActs; 
	}
	
	public void remove() {
		for(Actor a: halfActs) {
			a.removeSelfFromGrid();
		}
	}

	private void moveToInfinityStones(ArrayList<Actor> infinityStones) {
		Actor infinityStone = pickAInfinityStone(infinityStones);
		for(int i = 0; i < 1; i++) {
			int dir = getLocation().getDirectionToward(infinityStone.getLocation());
			Location next = getLocation().getAdjacentLocation(dir);
			if(getGrid().get(next) == null) {
				makeMove(next);
			}
			addInfinityStones();
			
		}
	}

	private ArrayList<Actor> addInfinityStones() {
		ArrayList<Location> locs = getGrid().getOccupiedLocations();
		ArrayList<Actor> myInfinityStones = new ArrayList<>();
		for(Location loc : locs) {
			Actor temp = getGrid().get(loc);
			if(temp instanceof Rock ) {
				myInfinityStones.add(temp);
			}
		}
		return myInfinityStones;
	}

	private Actor pickAInfinityStone(ArrayList<Actor> infinityStones) {
		double dist = 1000000;
		Actor choice = new Actor();
		for(Actor a: infinityStones) {
			if(isCloser(a, dist)) {
				choice = a;
				dist = saveDist(a);
			}
		}
		return choice;
	}

	private double saveDist(Actor a) {
		System.out.println(a.getLocation().getCol());
		return Math.sqrt(Math.pow(a.getLocation().getCol() - this.getLocation().getCol() , 2) +
				Math.pow(a.getLocation().getRow() - this.getLocation().getRow() , 2));
	}

	private boolean isCloser(Actor a, double dist) {
		return saveDist(a) <= dist;
	}

	private ArrayList<Actor> getInfinityStones() {
		processActors(getActors());
		ArrayList<Location> locs = getGrid().getOccupiedLocations();
		ArrayList<Actor> InfinityStones = new ArrayList<>();
		for(Location loc : locs) {
			Actor temp = getGrid().get(loc);
			if(temp instanceof Rock) {
				InfinityStones.add(temp);
				hasInfinityStones = true;
			}
		}
		return InfinityStones;
	}
	
	@Override
	
	public void processActors(ArrayList<Actor> actors)
    {
        for (Actor a : actors)
        {
            if (a instanceof Rock && !(a instanceof Critter))
                a.removeSelfFromGrid();
        }
    }

	
}
