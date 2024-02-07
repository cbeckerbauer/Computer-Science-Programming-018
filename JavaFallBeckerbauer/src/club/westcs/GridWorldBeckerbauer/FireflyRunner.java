package club.westcs.GridWorldBeckerbauer;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;

public class FireflyRunner {

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld(new BoundedGrid<>(25, 25));
		for(int i =0; i < 5; i++) {
			world.add(new FireflyCritter());
		}
		world.show();
	}
	
}