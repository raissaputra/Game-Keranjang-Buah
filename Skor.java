import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Skor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Skor extends Actor
{
    /**
     * Act - do whatever the Skor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int Skornya = 0;
    public void act() 
    {
        GreenfootImage skor = new GreenfootImage(200,50);
        skor.setFont(new Font("Arial",18));
        skor.setColor(Color.RED);
        skor.drawString("Skornya : "+Skornya,10,30);
        setImage(skor);
    }    
}
