import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class scroll here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class scroll extends Actor
{
    /**
     * Act - do whatever the scroll wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public void scroll()
    {
        if(getX()<-getImage().getWidth()/2)
        {
            setLocation(getWorld().getWidth()+498,getY());
        }
        setLocation(getX()-2,getY());
    }
}
