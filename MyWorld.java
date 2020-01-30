import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    GreenfootSound BGM = new GreenfootSound("mulai.mp3");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super( 439,950, 1); 
        prepare();
    }
    public void started()
    {
        music();
    }
    
    public void music()
    {        
        if(!BGM.isPlaying()){
        BGM.playLoop();
        BGM.setVolume(70);
        }
    }
    
    public void stopmusic()
    {
        BGM.stop();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        HowClick howClick = new HowClick();
        addObject(howClick,368,300);
        Start start = new Start();
        addObject(start,234,297);
        howClick.setLocation(363,223);
        start.setLocation(314,303);
        start.setLocation(263,296);
        howClick.setLocation(397,238);
        start.setLocation(309,323);
        howClick.setLocation(404,244);
        About about = new About();
        addObject(about,198,276);
        about.setLocation(124,406);
        start.setLocation(204,559);
        howClick.setLocation(289,394);
        start.setLocation(226,531);
    }
}
