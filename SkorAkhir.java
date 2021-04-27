import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SkorAkhir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SkorAkhir extends Actor
{
    /**
     * Act - do whatever the SkorAkhir wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage skor = new GreenfootImage(300,50);
        skor.setFont(new Font("Arial",18));
        skor.setColor(Color.BLUE);
        if(Skor.Skornya < 0)
        {
            skor.drawString("Total skormu adalah : 0",10,30);
            
        }
        else
        {
            skor.drawString("Total skormu adalah : "+
            Skor.Skornya,10,30);
        }
        setImage(skor);
    }   
}
