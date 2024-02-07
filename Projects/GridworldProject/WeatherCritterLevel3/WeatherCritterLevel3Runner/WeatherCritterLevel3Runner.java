package club.westcs.GridWorldBeckerbauer;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.BoundedGrid;

public class WeatherCritterLevel3Runner {
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld(new BoundedGrid<>(25, 25));
		WeatherCritterLevel3 bob = new WeatherCritterLevel3();
		world.add(bob);
		world.add(new Bug());
		world.add(new Bug());
		world.add(new Bug());
		world.add(new Bug());
		world.add(new Bug());
		world.add(new Bug());
		world.add(new Actor());
		world.add(new Actor());
		world.add(new Actor());
		world.add(new Actor());
		world.add(new Actor());
		world.show();
		bob.run();
	}

}
