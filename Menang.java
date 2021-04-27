import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menang extends Actor
{
    /**
     * Act - do whatever the Menang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage win = new GreenfootImage(400,50);
        win.setFont(new Font("Arial",20));
        win.setColor(Color.PINK);
        win.drawString("HOREE,KAMU MENANG",10,20);
        setImage(win);
    }    
}
