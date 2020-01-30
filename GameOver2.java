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
        super( 439,950, 1); 
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

        player.setLocation(354,848);
        tryAgain.setLocation(90,477);
        home.setLocation(296,616);
        home.setLocation(352,641);
        tryAgain.setLocation(139,492);
        player.setLocation(242,832);
    }
}
