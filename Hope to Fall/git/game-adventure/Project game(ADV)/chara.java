import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class chara here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class chara extends scroll
{
    private int speed =7;
    private int vspeed = 1;
    private int acceleration =1;
    /**
     * Act - do whatever the chara wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       checkKey();
       fall();
    }    
    private void checkKey()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            setImage("chara-left.png");
            moveLeft();
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setImage("chara-right.png");
            moveRight();
        }
    }
    public void fall()
    {
        setLocation(getX(),getY()+ vspeed);
        vspeed = vspeed + acceleration;
    }
    public void moveRight()
    {
        setLocation(getX()+speed,getY());
    }
    public void moveLeft()
    {
        setLocation(getX()+speed,getY());
    }
    
}
