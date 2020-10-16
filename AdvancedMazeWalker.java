package src;

import becker.robots.*;

import java.awt.*;

public class AdvancedMazeWalker extends RobotSE
{
    public AdvancedMazeWalker(City aCity, int row, int column, Direction aDirection)
    {
        super(aCity, row, column, aDirection);
    }

    public void followRightWall()
    {
        boolean exit = false;
        while (!exit)
        {
            this.drawPath("right");
            this.checkWalls("right");
            if (this.isBesideThing(IPredicate.aThing))
            {
                exit = true;
            }
        }
    }

    public void followLeftWall()
    {
        boolean exit = false;
        while (!exit)
        {
            this.drawPath("left");
            this.checkWalls("left");
            if (this.isBesideThing(IPredicate.aThing))
            {
                exit = true;
            }
        }
    }


    private void checkWalls(String direction)
    {
        if (direction.equals("right"))
        {
            this.turnRight();
            while (!this.frontIsClear())
            {
                this.turnLeft();
            }
        } else
        {
            this.turnLeft();
            while (!this.frontIsClear())
            {
                this.turnRight();
            }
        }
        this.move();
    }

    private void drawPath(String direction)
    {
        Intersection path = this.getIntersection();
        if (this.getStreet() == 0 && this.getAvenue() == 0)
        {
            path.setColor(Color.GREEN);
        } else if (direction.equals("right"))
        {
            if (Color.CYAN.equals(path.getColor()) || Color.GREEN.equals(path.getColor()))
            {
                path.setColor(Color.GREEN);
            } else
            {
                path.setColor(Color.ORANGE);
            }
        } else
        {
            if (Color.ORANGE.equals(path.getColor()) || Color.GREEN.equals(path.getColor()))
            {
                path.setColor(Color.GREEN);
            } else
            {
                path.setColor(Color.CYAN);
            }
        }
    }



}
