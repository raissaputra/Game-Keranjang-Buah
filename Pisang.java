import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pisang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pisang extends Actor
{
    /**
     * Act - do whatever the Pisang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY()+3);
        turn(3);
        cekLetakPisang();
    }  
    
    public boolean posisiPisang()
    {
        if(getY() > 390)return true;
        else return false;
    }
    
    public void cekLetakPisang()
    {
        if (posisiPisang())
        {
            getWorld().removeObject(this);
        }
    }
}
