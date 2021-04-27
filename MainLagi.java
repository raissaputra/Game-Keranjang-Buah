import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainLagi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainLagi extends Actor
{
    /**
     * Act - do whatever the MainLagi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       GreenfootImage mainLagi = new GreenfootImage(400,50);
       mainLagi.setFont(new Font("Arial",18));
       mainLagi.setColor(Color.BLUE);
       mainLagi.drawString("Mau main lagi?Tekan spasi!",10,30);
       setImage(mainLagi);
       
       if (Greenfoot.isKeyDown("Space"))
       {
           getWorld().removeObject(this);
           Skor.Skornya = 0;
           Lifebar.Nyawa = 0;
           Greenfoot.setWorld(new Main());
        }
    }
        
}
