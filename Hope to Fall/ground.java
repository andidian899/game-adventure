import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gound here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ground extends Actor
{
    int ground_speed = -4;
    private int x = 0;
    /**
     * Act - do whatever the gound wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()+ground_speed, getY()); 
    }    
}
