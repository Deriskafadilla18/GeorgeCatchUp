import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mulai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lv2 extends Mulai
{
    private int timer;
    public void act()
    {   
        timer = timer + 1;
        showText("Time: " + timer, 300, 25);
        if(timer == 2000)
        {
            Greenfoot.setWorld(new Lv3());
        }
        
        if(Greenfoot.getRandomNumber(200)< 7)
        {
            Ceri ceri = new Ceri();
            addObject(ceri, Greenfoot.getRandomNumber(439), Greenfoot.getRandomNumber(9));
            
            Apel apel = new Apel();
            addObject(apel, Greenfoot.getRandomNumber(439), Greenfoot.getRandomNumber(9));
            
            Pisang pisang = new Pisang();
            addObject(pisang, Greenfoot.getRandomNumber(439), Greenfoot.getRandomNumber(9));
            
        }
        
        if(Greenfoot.getRandomNumber(200) < 3)
        {
            Bomb bomb = new Bomb();
            addObject(bomb, Greenfoot.getRandomNumber(439), Greenfoot.getRandomNumber(20));
            
        }
    }
}
