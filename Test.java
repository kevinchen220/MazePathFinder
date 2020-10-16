package src;

import becker.robots.Direction;
import becker.robots.MazeCity;
import becker.robots.Thing;

public class Test
{
    public static void main(String[] args)
    {
        int streets = 10;
        int avenues = 10;
        MazeCity maze = new MazeCity(streets, avenues);
        Thing exit = new Thing(maze, streets - 2, avenues - 1);
        AdvancedRightWall bob = new AdvancedRightWall(maze, 0, 0, Direction.EAST);
        AdvancedLeftWall mike = new AdvancedLeftWall(maze, 0, 0, Direction.EAST);

        Thread right = new Thread(bob);
        Thread left = new Thread(mike);

        right.start();
        left.start();
    }
}
