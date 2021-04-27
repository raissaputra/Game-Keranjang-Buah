import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pisau1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pisau1 extends Actor
{
    /**
     * Act - do whatever the Pisau1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(),getY()+3);
        turn(3);
        cekLetakPisau1();
    } 
    
    public boolean posisiPisau1()
    {
        if(getY() > 390)return true;
        else return false;
    }
    
    public void cekLetakPisau1()
    {
        if (posisiPisau1())
        {
            getWorld().removeObject(this);
        }
    }
}
