import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Keranjang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Keranjang extends Actor
{
    /**
     * Act - do whatever the Keranjang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("right"))
        {
            move(5);
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
            move(-5);
        }
        tambahSkor();
        kurangiSkor();
        tambahNyawa();
        Winner();
    }
    
    public void tambahSkor()
    {
        Actor skorApel = getOneObjectAtOffset(0,0,Apel.class);
        if(skorApel != null)
        {
            Skor.Skornya+=100;
            getWorld().removeObject(skorApel);
            
        }
        Actor skorAnggur = getOneObjectAtOffset(0,0,Anggur.class);
        if(skorAnggur!=null)
        {
            Skor.Skornya+=100;
            getWorld().removeObject(skorAnggur);
            
        }
        Actor skorPisang = getOneObjectAtOffset(0,0,Pisang.class);
        if(skorPisang!=null)
        {
            Skor.Skornya+=100;
            getWorld().removeObject(skorPisang);
            
        }
    }
    
    public void kurangiSkor()
    {
        Actor pisau1 = getOneIntersectingObject(Pisau1.class);
        if(pisau1!=null)
        {
            Skor.Skornya-=100;
            getWorld().removeObject(pisau1);
            
            Lifebar.Nyawa+=20;
        }
        
        Actor pisau2 = getOneIntersectingObject(Pisau2.class);
        if(pisau2!=null)
        {
            Skor.Skornya-=100;
            getWorld().removeObject(pisau2);
            
            Lifebar.Nyawa+=20;
        }
    }
    
    public void tambahNyawa()
    {
        Actor nyawaBaru = getOneObjectAtOffset(0,0,NyawaBaru.class);
        if(nyawaBaru !=null)
        {
            Lifebar.Nyawa -= 20;
            getWorld().removeObject(nyawaBaru);
            
        }
    }
    
    public void Winner()
    {
        Actor winner = getOneObjectAtOffset(0,0,Berlian.class);
        if(winner !=null)
        {
            Greenfoot.setWorld(new Win());
            
        }
    }
}
