package club.westcs.GridWorldBeckerbauer;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.UnboundedGrid;

public class MultiCritterRunner {
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld(new UnboundedGrid<>());
		world.add(new MultiCritter());
		world.show();
	}
}
