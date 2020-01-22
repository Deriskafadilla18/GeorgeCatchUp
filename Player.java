import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int Nyawa = 5;
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {   tampil();
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-3, getY());
            setImage("monyet2.png");
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+3, getY());
            setImage("monyet21.png");
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+3);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-3);
        }
        
        if(isTouching(Buah.class))
        {   
            removeTouching(Buah.class);
            Greenfoot.playSound("nyam.wav");
            Mulai m= (Mulai)getWorld();
            m.hasil.add(10);
        }

        if(isTouching(Bomb.class))
        {
            removeTouching(Bomb.class);
            Greenfoot.playSound("bomb.mp3");
            Nyawa = Nyawa - 1;
        }
        gameStop();
    }

    
    private void tampil()
    {
          getWorld().showText("Nyawa = "+ Nyawa,100,60);
    }
    
    private void gameStop()
    {
        if(Nyawa == 0)
        {
            //playSound.stop();
            Greenfoot.setWorld(new GameOver2());
        }
    }
}
