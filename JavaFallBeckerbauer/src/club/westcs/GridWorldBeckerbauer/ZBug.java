package club.westcs.GridWorldBeckerbauer;

import info.gridworld.grid.Location;

public class ZBug extends BoxBug{
	public ZBug(int length) {
		super(length);
	}
	
	@Override
	public void act()
	{
		if (steps < sideLength && canMove()) {
			move();
			steps++;
		}
		else if (steps == sideLength) {
			setDirection(Location.SOUTHWEST);
			if(canMove()) {
				move();
			}
			steps++;
		}
		else if (steps < sideLength*2 && canMove()) {
			move();
			steps++;
		}
		else if (steps == sideLength*2 && canMove()) {
			setDirection(Location.EAST);
			if(canMove()) {
				move();
			}
			steps++;
		}
		else if (steps < sideLength*3 && canMove()) {
			move();
			steps++;
		}
    }
}
