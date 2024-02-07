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
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class BoxBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        BoxBug alice = new BoxBug(6);
        world.add(new Location(1, 1), alice);
        alice.setColor(Color.RED);
        
        SpirlBug bob = new SpirlBug(3);
        world.add(new Location(2, 2), bob);
        bob.setColor(Color.ORANGE);
        
        PartBoxCircleBug james = new PartBoxCircleBug(5);
        world.add(new Location(3, 3), james);
        james.setColor(Color.YELLOW);
        
        ZBug sally = new ZBug(4);
        world.add(new Location(4, 4), sally);
        sally.setDirection(Location.EAST);
        sally.setColor(Color.GREEN);
        
        CircleBug holly = new CircleBug(10);
        world.add(new Location(5, 5), holly);
        holly.setColor(Color.CYAN);
        
        HydraBug jake = new HydraBug();
        world.add(new Location(6, 6), jake);
        jake.setColor(Color.BLUE);
        
        HydraBug billy = new HydraBug();
        world.add(new Location(7, 7), billy);
        billy.setColor(Color.MAGENTA);
        
        Critter sam = new Critter();
        world.add(new Location(8, 8), sam);
        sam.setColor(Color.PINK);
        
        TattooCritter jack = new TattooCritter();
        world.add(new Location(9, 9), jack);
        jack.setColor(Color.BLACK);
        
        world.add(new Rock());
        world.add(new Rock());
        world.add(new Rock());
        world.add(new Rock());
        world.add(new Bug());
        world.add(new Critter());
        world.show();
    }
}