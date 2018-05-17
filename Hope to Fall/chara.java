import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class chara here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class chara extends Actor
{
    private int speed =3;
    private int vSpeed = 0;
    private int acceleration =1;
    public void act() 
    {
        checkKey();
        fall();
    }  
    private void checkKey()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            setImage("chara2.png");
            moveLeft();
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setImage("chara.png");
            moveRight();
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-1);
            jump();
        }
    }
    private void jump()
    {
        vSpeed = -1;
        fall();
    }
    public void fall()
    {
        if(!isTouching(ground.class)){
            setLocation(getX(),getY()+ vSpeed);
            vSpeed = vSpeed + acceleration;
        }
        
    }
    public void moveRight()
    {
        setLocation(getX()+speed,getY());
    }
    public void moveLeft()
    {
        setLocation(getX()-speed,getY());
    }   
    
}
