package club.westcs.GridWorldBeckerbauer;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Flower;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.UnboundedGrid;

public class ThanosCritterLevel2Runner {
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld(new BoundedGrid<>(25, 25));
		world.add(new ThanosCritterLevel2());
		world.add(new Flower());
		world.add(new Actor());
		world.add(new Actor());
		world.add(new Actor());
		world.add(new Actor());
		world.add(new Actor());
		world.add(new Actor());
		world.add(new Actor());
		world.add(new Actor());
		world.add(new Actor());
		world.add(new Actor());
		world.show();
	}
}
