import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NyawaBaru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NyawaBaru extends Actor
{
    /**
     * Act - do whatever the NyawaBaru wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(),getY()+3);
        cekLetakNyawaBaru();
        
    } 
    
    public boolean posisiNyawaBaru()
    {
        if(getY() > 390)return true;
        else return false;
    }
    
    public void cekLetakNyawaBaru()
    {
        if (posisiNyawaBaru())
        {
            getWorld().removeObject(this);
        }
    }
    
}
