import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lv3 extends Mulai
{   
    private int timer;
    public void act()
    {
        timer = timer + 1;
        showText("Time: " + timer, 300, 25);
        if(timer == 2500)
        {
            Greenfoot.setWorld(new End());
        }
        
        if(Greenfoot.getRandomNumber(100)< 3)
        {
            Ceri ceri = new Ceri();
            addObject(ceri, Greenfoot.getRandomNumber(439), Greenfoot.getRandomNumber(8));
            
            Apel apel = new Apel();
            addObject(apel, Greenfoot.getRandomNumber(439), Greenfoot.getRandomNumber(8));
            
            Pisang pisang = new Pisang();
            addObject(pisang, Greenfoot.getRandomNumber(439), Greenfoot.getRandomNumber(8));
            
        }
        
        if(Greenfoot.getRandomNumber(90) < 1)
        {
            Bomb bomb = new Bomb();
            addObject(bomb, Greenfoot.getRandomNumber(439), Greenfoot.getRandomNumber(10));
            
        }
    }
}
