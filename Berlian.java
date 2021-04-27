import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Berlian here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Berlian extends Actor
{
    /**
     * Act - do whatever the Berlian wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(),getY()+7);
        cekLetakBerlian();
    }
    
    public boolean posisiBerlian()
    {
        if(getY() > 390)return true;
        else return false;
    }
    
    public void cekLetakBerlian()
    {
        if (posisiBerlian())
        {
            getWorld().removeObject(this);
        }
    }
}
