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
    //Score hasil = new Score("Score : ");
    
    public void act()
    {
        timer = timer + 1;
        showText("Time: " + timer, 500, 25);
        if(timer == 2000)
        {
            //Lv2 level2 = new Lv2();
            //level2.getScore = hasil.getHasil();
            Greenfoot.setWorld(new End());
            
        }
        
        if(Greenfoot.getRandomNumber(90)< 7)
        {
            Ceri ceri = new Ceri();
            addObject(ceri, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(1));
            
            Apel apel = new Apel();
            addObject(apel, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(1));
            
            Pisang pisang = new Pisang();
            addObject(pisang, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(1));
            
        }
        
        if(Greenfoot.getRandomNumber(90) < 3)
        {
            Bomb bomb = new Bomb();
            addObject(bomb, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(1));
            
        }
    }
}
