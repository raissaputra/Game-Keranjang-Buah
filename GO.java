import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GO extends Actor
{
    /**
     * Act - do whatever the GO wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage GO = new GreenfootImage(200,50);
        GO.setFont(new Font("Arial",20));
        GO.setColor(Color.BLUE);
        GO.drawString("GAME OVER",10,30);
        setImage(GO);
    }    
}
