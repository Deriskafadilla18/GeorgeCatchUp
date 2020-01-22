import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buah extends Actor
{
    /**
     * Act - do whatever the Buah wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void remove() 
    {
        setLocation(getX(), getY()+3);
        if( isAtEdge() )
        {
            getWorld().removeObject(this);
        }
    }
       
}
