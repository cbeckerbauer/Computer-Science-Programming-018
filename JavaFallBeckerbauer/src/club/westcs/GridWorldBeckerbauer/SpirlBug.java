package club.westcs.GridWorldBeckerbauer;

public class SpirlBug extends BoxBug {

	public SpirlBug(int length) {
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
            turn();
            steps = 0;
            sideLength++;
        }
    }

}
