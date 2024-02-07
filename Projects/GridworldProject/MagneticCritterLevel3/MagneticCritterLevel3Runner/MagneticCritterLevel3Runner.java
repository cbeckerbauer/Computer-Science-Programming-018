package club.westcs.GridWorldBeckerbauer;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;

public class MagneticCritterLevel3Runner {
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld(new BoundedGrid<>(25, 25));
		world.add(new MagneticCritterLevel3());
		world.add(new MagneticCritterLevel3());
		world.add(new MagneticCritterLevel3());
		world.add(new MagneticCritterLevel3());
		world.add(new MagneticCritterLevel3());
		world.add(new MagneticCritterLevel3());
		world.add(new MagneticCritterLevel3());
		world.add(new MagneticCritterLevel3());
		world.add(new MagneticCritterLevel3());
		world.add(new MagneticCritterLevel3());
		world.show();
	}
}
