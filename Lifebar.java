import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lifebar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lifebar extends Actor
{
    /**
     * Act - do whatever the Lifebar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    static int Nyawa = 0;
    static int LebarLife = 100;
    int TinggiLife = 20;
    
    public void act() 
    {
       GreenfootImage nyawaku = new GreenfootImage(LebarLife+2,TinggiLife+2);
       setImage(nyawaku);
       nyawaku.setColor(Color.YELLOW);
       nyawaku.fillRect(0,0,LebarLife-Nyawa,TinggiLife);
       nyawaku.setColor(Color.WHITE);
       nyawaku.drawRect(0,0,LebarLife,TinggiLife);
    }
    
       
}
