import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Info here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Info extends World
{

    /**
     * Constructor for objects of class Info.
     * 
     */
    public Info()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1025, 512, 1); 
        
        exit Exit = new exit();
        addObject(Exit,120,80);
    }
}
