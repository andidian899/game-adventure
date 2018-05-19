import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Retry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Retry extends World
{

    /**
     * Constructor for objects of class Retry.
     * 
     */
    public Retry()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1025, 562, 1); 
        ready();
    }
    private void ready()
    {
        restart Restart = new restart();
        addObject(Restart,521,340);
    }
}

