package club.westcs.GridWorldBeckerbauer;

public class PartBoxCircleBug extends BoxBug{
	public PartBoxCircleBug(int length) {
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
        else if(steps == sideLength) {
        	turn();
        	move();
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
