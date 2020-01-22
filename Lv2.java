
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
    //public int getScore;
    public void act()
    {   
        //Greenfoot.getScore = getScore("Score : ");
        timer = timer + 1;
        showText("Time: " + timer, 500, 25);
        if(timer == 2000)
        {
            Greenfoot.setWorld(new Lv3());
            //Greenfoot.setWorld(new GameOver());
            
        }
        
        if(Greenfoot.getRandomNumber(200)< 7)
        {
            Ceri ceri = new Ceri();
            addObject(ceri, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(1));
            
            Apel apel = new Apel();
            addObject(apel, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(1));
            
            Pisang pisang = new Pisang();
            addObject(pisang, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(1));
            
        }
        
        if(Greenfoot.getRandomNumber(200) < 3)
        {
            Bomb bomb = new Bomb();
            addObject(bomb, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(1));
            
        }
    }
}
