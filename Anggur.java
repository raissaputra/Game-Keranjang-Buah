import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Anggur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Anggur extends Actor
{
    /**
     * Act - do whatever the Anggur wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(),getY()+3);
        turn(-3);
        cekLetakAnggur();
    }
    
    public boolean posisiAnggur()
    {
        if(getY() > 390)return true;
        else return false;
    }
    
    public void cekLetakAnggur()
    {
        if (posisiAnggur())
        {
            getWorld().removeObject(this);
        }
    }
}
