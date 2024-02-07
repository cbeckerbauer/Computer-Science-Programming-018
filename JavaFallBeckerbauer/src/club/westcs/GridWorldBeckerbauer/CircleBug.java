package club.westcs.GridWorldBeckerbauer;

public class CircleBug extends BoxBug{
	public CircleBug(int length) {
		super(length);
	}
	
	@Override
	
	public void act()
	 
    {
		if (steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else
        {
            turn();
            steps = 0;
        }
    }
}
