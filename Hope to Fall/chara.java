import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class chara here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class chara extends Actor
{
    private int speed =7;
    private int vSpeed = 0;
    private int acceleration =1;
    double middle=0;
    double bottom = 1.3;
    double start =-15;
    
    public void act() 
    {
        checkKey();
        fall();
        
        if(getY()>getWorld().getHeight())
        {
        gameover GameOver =new gameover();
        restart Restart = new restart();
        exit Exit = new exit();
        getWorld().addObject(GameOver,522,256);
        
        getWorld().addObject(Restart,480,350);
        getWorld().addObject(Exit,580,350);
        //Greenfoot.stop();
    }
        middle = middle + bottom;
       
   }
    private void checkKey()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            setImage("idle4.png");
            moveLeft();
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setImage("idle3.png");
            moveRight();
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-10);
            jump();
        }
    }
    private void jump()
    {
        vSpeed = -5;
        fall();
    }
    public void fall()
    {
        if(!isTouching(ground.class)){
            setLocation(getX()+0,getY()+ vSpeed);
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

