import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apel extends Actor
{
    /**
     * Act - do whatever the Apel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(),getY()+3);
        turn(3);
        cekLetakApel();
    }  
    
    public boolean posisiApel()
    {
        if(getY() > 390)return true;
        else return false;
    }
    
    public void cekLetakApel()
    {
        if (posisiApel())
        {
            getWorld().removeObject(this);
        }
    }
}
