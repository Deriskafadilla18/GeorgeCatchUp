import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver2 extends World
{

    /**
     * Constructor for objects of class GameOver2.
     * 
     */
    public GameOver2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        Greenfoot.playSound("GameOver.mp3");
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Home home = new Home();
        addObject(home,462,293);

        TryAgain tryAgain = new TryAgain();
        addObject(tryAgain,145,293);

        Player player = new Player();
        addObject(player,304,496);

        /*Bomb bomb = new Bomb();
        addObject(bomb,553,187);

        Apel apel = new Apel();
        addObject(apel,54,216);

        Ceri ceri = new Ceri();
        addObject(ceri,179,349);

        Pisang pisang = new Pisang();
        addObject(pisang,461,206);*/

    }
}
