import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private background img0,img1;
    private int[] GroundX;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1025, 512, 1, false); 
        
        img0 =new background();
        addObject(img0, getWidth()/2, getHeight()/2);
        
        img1 = new background();
        addObject(img1, getWidth()+getWidth()/2,getHeight()/2);
        int x = 25;
        for(int G=0; G<25; G++)
        {
            addObject(new ground(),x,490);
            x= x+39;
        }
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            img0.scroll();
            img1.scroll();
        }
    }
}
