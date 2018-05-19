import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private background img0;
    private int[] GroundX;
    private int counter;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1025, 512, 1, false);
        
        img0 =new background();
        addObject(img0, getWidth()/2, getHeight()/2);
        
        addObject(new chara(),100,410);
        
        int x = 0;
        for(int G=0; G<25; G++)
        {
            addObject(new ground(),x,470);
            x= x+50;
        }
    }
    
    public void act()
    {
      grnd();  
    }
    int position[] = {100,200,300,400,500,600};
    ground Ground = new ground();
    private void grnd()
    {
        counter++;
        if(counter == 90)
        {
            int i = Greenfoot.getRandomNumber(5);
          addObject(new ground(),getWidth(),position[i]);
          counter =0    ;
        }
    }
      
        
}
