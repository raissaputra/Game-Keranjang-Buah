import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gameover extends World
{

    /**
     * Constructor for objects of class Gameover.
     * 
     */
    public Gameover()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject (new GO(),330,100);
        addObject (new SkorAkhir(),330,150);
        addObject (new MainLagi(),380,200);
    }
}
