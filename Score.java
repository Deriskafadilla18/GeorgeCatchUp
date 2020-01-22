import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Score extends Actor
{
    private int hasil = 0;
    private int target = 0;
    private String text;
    private int StringLength;
    
    public Score()
    {
        this("");
    }
        
    public Score(String Skor)
    {
        text = Skor;
        StringLength = (text.length() + 2) * 16; // u ukuran panjang dari
        
        setImage(new GreenfootImage(StringLength, 50));//uk font
        GreenfootImage image = getImage();
        
        updateImage();
    }
    
    public void act()
    {
        if(hasil < target)
        {
            hasil++;
            updateImage();
        }
    }
    
    public void add(int score)
    {
        target += score;
    }
    
    public int getHasil()
    {
        return target;
    }
    
    public void setHasil(int nilai){
        target = nilai;
    }
    
    public void updateImage()
    {
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(text + hasil, 1, 18);
    }
}
