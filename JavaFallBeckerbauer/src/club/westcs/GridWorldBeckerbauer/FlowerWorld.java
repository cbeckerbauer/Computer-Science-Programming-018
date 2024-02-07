package club.westcs.GridWorldBeckerbauer;

import java.util.Random;

import info.gridworld.grid.Grid;
import info.gridworld.actor.*;

public class FlowerWorld extends ActorWorld{
	
	private Random rand;
	
	public FlowerWorld() {
		super();
		rand = new Random();
	}
	
	public FlowerWorld(Grid<Actor> grid) {
		super(grid);
		rand = new Random();
	}
	
	@Override
	public void step() {
		super.step();
		for(int i =0; i < 5; i++) {
			if(rand.nextInt(25) == 0) {
				new Flower().putSelfInGrid(getGrid(), getRandomEmptyLocation());
			}
		}
	}
	
}
