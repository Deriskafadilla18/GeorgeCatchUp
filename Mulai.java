import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mulai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mulai extends World
{
    private int timer;
    public Score hasil = new Score("Score : ");
    public Mulai()
    {   
        super( 439,950, 1); 
        addObject(hasil, 550,50);
        prepare();
        timer = 0;
    }
    
    public void act()
    {
        timer = timer + 1;
        showText("Time: " + timer, 300, 25);
        if(timer == 1200)
        {
           Lv2 level2 = new Lv2();
            level2.hasil.setHasil(hasil.getHasil()) ;
            Greenfoot.setWorld(level2);

        }
        
        if(Greenfoot.getRandomNumber(400)< 7)
        {
            Ceri ceri = new Ceri();
            addObject(ceri, Greenfoot.getRandomNumber(439), Greenfoot.getRandomNumber(10));
            
            Apel apel = new Apel();
            addObject(apel, Greenfoot.getRandomNumber(439), Greenfoot.getRandomNumber(10));
            
            Pisang pisang = new Pisang();
            addObject(pisang, Greenfoot.getRandomNumber(439), Greenfoot.getRandomNumber(10));
            
        }
        
        if(Greenfoot.getRandomNumber(400) < 3)
        {
            Bomb bomb = new Bomb();
            addObject(bomb, Greenfoot.getRandomNumber(439), Greenfoot.getRandomNumber(30));
            
        }
    }


    private void prepare()
    {
        Player player = new Player();
        addObject(player,477,502);
        player.setLocation(367,887);
    }
    

}
