package GridWorldCode.GridWorldCode.projects.critters;

import java.awt.Color;
import java.util.ArrayList;


import GridWorldCode.GridWorldCode.framework.info.gridworld.actor.Bug;
import GridWorldCode.GridWorldCode.framework.info.gridworld.actor.Flower;
import GridWorldCode.GridWorldCode.framework.info.gridworld.actor.Actor;
import GridWorldCode.GridWorldCode.framework.info.gridworld.actor.Critter;
import GridWorldCode.GridWorldCode.framework.info.gridworld.grid.Location;

public class IceCritter extends Critter{
	
	private Actor temp;
	private ArrayList<Location> temper;
	private Color color;
	private Color colora;
	
	public IceCritter() {
		color = Color.BLACK;
		colora = Color.BLUE;
		act();
	}
	
	@Override 
	public void act() {
		super.act();
		ArrayList<info.gridworld.grid.Location> locs = getGrid().getOccupiedAdjacentLocations(getLocation());
		for(info.gridworld.grid.Location l: locs) {
			temp = getGrid().get(l);
			if(temp instanceof Flower) {
				temp.setColor(color);
			}
			else {
				temp.setColor(colora);
				if(temp instanceof Bug || temp instanceof Critter || temp instanceof Actor) {
					info.gridworld.grid.Location now = temp.getLocation();
					for(;;) {
						temp.moveTo(now);
					}
				}
			}
		}
	}
	
}