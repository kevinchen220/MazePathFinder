package src;

import becker.robots.City;
import becker.robots.Direction;

public class AdvancedRightWall extends AdvancedMazeWalker implements Runnable
{
    public AdvancedRightWall(City aCity, int row, int column, Direction aDirection)
    {
        super(aCity, row, column, aDirection);
    }

    public void run()
    {
        this.followRightWall();
    }
}
