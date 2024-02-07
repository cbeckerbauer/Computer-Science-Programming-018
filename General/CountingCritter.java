package GridWorldCode.GridWorldCode.projects.critters;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import GridWorldCode.GridWorldCode.framework.info.gridworld.actor.Bug;
import GridWorldCode.GridWorldCode.framework.info.gridworld.actor.Actor;
import GridWorldCode.GridWorldCode.framework.info.gridworld.actor.Critter;
import GridWorldCode.GridWorldCode.framework.info.gridworld.actor.Flower;


public class CountingCritter extends Critter{
	
	private Actor temp;
	private int actorCount;
	private int bugCount; 
	private int critterCount; 
	private Random rand; 
	private int flowerCount; 
	private Color newColor;
	
	public CountingCritter() {
		actorCount = 0;
		bugCount = 0;
		critterCount = 0;
		flowerCount = 0; 
		rand = new Random();
		newColor = getNewColor();
		act();
	}
	
	@Override 
	public void act() {
		super.act();
		ArrayList<info.gridworld.grid.Location> locs = getGrid().getOccupiedAdjacentLocations(getLocation());
		for(info.gridworld.grid.Location l: locs) {
			temp = getGrid().get(l);
			if(temp instanceof Actor) {
				actorCount++;
				System.out.println(actorCount);
				this.setColor(newColor);
				getNewColor();
			}
			else if(temp instanceof Bug) {
				bugCount++;
				System.out.println(bugCount);
				this.setColor(newColor);
				getNewColor();
			}
			else if(temp instanceof Critter) {
				critterCount++;
				System.out.println(critterCount);
				this.setColor(newColor);
				getNewColor();
			}
			else if(temp instanceof Flower) {
				flowerCount++;
				System.out.println(flowerCount);
				this.setColor(newColor);
				getNewColor();
			}
			else {
				super.act();
				}
			}
	}
	
	public Color getNewColor() {
		int colora = rand.nextInt(10);
		if(colora == 1) {
			newColor = Color.RED;
		}
		else if(colora == 2) {
			newColor = Color.ORANGE;
		}
		else if(colora == 3) {
			newColor = Color.YELLOW;
		}
		else if(colora == 4) {
			newColor = Color.GREEN;
		}
		else if(colora == 5) {
			newColor = Color.BLUE;
		}
		else if(colora == 6) {
			newColor = Color.PINK;
		}
		else if(colora == 7) {
			newColor = Color.BLACK;
		}
		else if(colora == 8) {
			newColor = Color.CYAN;
		}
		else if(colora == 9) {
			newColor = Color.GRAY;
		}
		else if(colora == 10) {
			newColor = Color.DARK_GRAY;
		}
		else {
			newColor = Color.MAGENTA;
		}
		return newColor;
	}
	
}