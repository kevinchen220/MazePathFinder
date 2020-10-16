package src;

import becker.robots.City;
import becker.robots.Direction;

public class AdvancedLeftWall extends AdvancedMazeWalker implements Runnable
{
    public AdvancedLeftWall(City aCity, int row, int column, Direction aDirection)
    {
        super(aCity, row, column, aDirection);
    }

    public void run()
    {
        this.followLeftWall();
    }
}
