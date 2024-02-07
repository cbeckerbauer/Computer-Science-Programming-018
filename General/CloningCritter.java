package GridWorldCode.GridWorldCode.projects.critters;

import java.util.ArrayList;

import GridWorldCode.GridWorldCode.framework.info.gridworld.actor.Bug;
import GridWorldCode.GridWorldCode.framework.info.gridworld.actor.Actor;
import GridWorldCode.GridWorldCode.framework.info.gridworld.actor.Critter;


public class CloningCritter extends Critter{
	
	private Actor temp;
	
	public CloningCritter() {
		act();
	}
	
	@Override 
	public void act() {
		super.act();
		ArrayList<info.gridworld.grid.Location> locs = getGrid().getOccupiedAdjacentLocations(getLocation());
		for(info.gridworld.grid.Location l: locs) {
			temp = getGrid().get(l);
			if(temp instanceof Actor) {
				Actor clone = new Actor();
				clone.putSelfInGrid(getGrid(), getLocation());
			}
			else if(temp instanceof Bug) {
				Bug clone = new Bug();
				clone.putSelfInGrid(getGrid(), getLocation());
			}
			else if(temp instanceof Critter) {
				Critter clone = new Critter();
				clone.putSelfInGrid(getGrid(), getLocation());
			}
			else {
				super.act();
				}
			}
	}
	
}