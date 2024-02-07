package GridWorld;

import info.gridworld.actor.*;
import info.gridworld.grid.BoundedGrid;

public class AssassinRunner {

	public static void main(String[] args) {
			
			ActorWorld world = new ActorWorld(new BoundedGrid(20 , 20));
			for(int i = 0; i < 30; i++) {
				world.add(new Bug());
				world.add(new Critter());
				world.add(new Rock());
				world.add(new FireflyCritter());
			}
			world.add(new AssassinCritter());
			
			world.show();
		}

}
