package club.westcs.GridworldRYoung;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.UnboundedGrid;

public class MultiRunner {

	public static void main(String[] args) {
		
		ActorWorld world = new ActorWorld(new UnboundedGrid<>()); 
		
		world.add(new MultiCritter());
		
		world.show(); 

	}

}
