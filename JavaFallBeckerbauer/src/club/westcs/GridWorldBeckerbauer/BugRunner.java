package club.westcs.GridWorldBeckerbauer;

/* 
	 * AP(r) Computer Science GridWorld Case Study:
	 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
	 *
	 * This code is free software; you can redistribute it and/or modify
	 * it under the terms of the GNU General Public License as published by
	 * the Free Software Foundation.
	 *
	 * This code is distributed in the hope that it will be useful,
	 * but WITHOUT ANY WARRANTY; without even the implied warranty of
	 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	 * GNU General Public License for more details.
	 * 
	 * @author Cay Horstmann
	 */

	import info.gridworld.actor.ActorWorld;
	import info.gridworld.actor.Bug;
	import info.gridworld.actor.Rock;
	import java.awt.Color;
	import info.gridworld.actor.Actor;
	import info.gridworld.grid.BoundedGrid;

	/**
	 * This class runs a world that contains a bug and a rock, added at random
	 * locations. Click on empty locations to add additional actors. Click on
	 * populated locations to invoke methods on their occupants. <br />
	 * To build your own worlds, define your own actors and a runner class. See the
	 * BoxBugRunner (in the boxBug folder) for an example. <br />
	 * This class is not tested on the AP CS A and AB exams.
	 */
	public class BugRunner
	{
		public static void main(String[] args)
		{
			ActorWorld world = new ActorWorld(new BoundedGrid<>(25, 20));	//creates an instance of the grid
																			//if you past a BoundedGrid of a size of a param it allows you to change to size of the grid
			Actor bob = new Actor();		//made an instance of actor bob
			bob.setColor(Color.RED);		//set bob to red
			world.add(bob);					//put bob in the world
			world.add(new Actor());		//adds stuff to the grid
			world.add(new Bug(Color.GREEN));
			world.add(new Bug());
			world.add(new Rock());
			world.show();	//makes the grid
		}
	}
