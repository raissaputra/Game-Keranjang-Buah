import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main extends World
{

    /**
     * Constructor for objects of class Main.
     * 
     */
    static GreenfootSound backsound = new GreenfootSound("happysound.mp3");
    public Main()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Keranjang(),300,380);
        addObject(new Skor(),100,20);
        addObject(new Lifebar(),540,20);
        backsound.playLoop();
    }
    
    public void act()
    {
        tampilApel();
        tampilAnggur();
        tampilPisang();
        tampilPisau1();
        tampilPisau2();
        tampilNyawaBaru();
        tampilBerlian();
        Gameover();
    }
    int nextApel;
    public void tampilApel()
    {
        nextApel++;
        if(nextApel == 80)
        {
            int x = Greenfoot.getRandomNumber(600);
            int y = -20;
            addObject(new Apel(),x,y);
            
            nextApel = 0;
        }
    }
    
    int nextAnggur;
    public void tampilAnggur()
    {
       nextAnggur++;
       if(nextAnggur == 90)
       {
            int x = Greenfoot.getRandomNumber(600);
            int y = -20;
            addObject(new Anggur(),x,y);
            nextAnggur = 0;
        }
    }
    
    int nextPisang;
    public void tampilPisang()
    {
        nextPisang++;
        if(nextPisang == 100)
        {
            int x = Greenfoot.getRandomNumber(600);
            int y = -20;
            addObject(new Pisang(),x,y);
            nextPisang = 0;
        }
    }
    
    int nextPisau1;
    public void tampilPisau1()
    {
        nextPisau1++;
        if(nextPisau1 == 70)
        {
            int x = Greenfoot.getRandomNumber(600);
            int y = -20;
            addObject(new Pisau1(),x,y);
            nextPisau1 = 0;
        }
    }
    
    int nextPisau2;
    public void tampilPisau2()
    {
        nextPisau2++;
        if(nextPisau2 == 60)
        {
            int x = Greenfoot.getRandomNumber(600);
            int y = -20;
            addObject(new Pisau2(),x,y);
            nextPisau2 = 0;
        }
    }
    
    int nextNyawa1,nextNyawa2,nextNyawa3,nextNyawa4 = 0;
    public void tampilNyawaBaru()
    {
        int Life = Lifebar.LebarLife - Lifebar.Nyawa;
        nextNyawa1++;
        if(nextNyawa1 ==500)
        {
            if(Life==80)
            {
                int x = Greenfoot.getRandomNumber(600);
                int y = -20;
                addObject(new NyawaBaru(),x,y);
            }
            nextNyawa1 = 0;
        }
        
        nextNyawa2++;
        if(nextNyawa2 ==300)
        {
            if(Life ==60)
            {
                int x = Greenfoot.getRandomNumber(600);
                int y = -20;
                addObject(new NyawaBaru(),x,y);
            }
            nextNyawa2 =0;
        }
        
        nextNyawa3++;
        if(nextNyawa3 == 200)
        {
            if(Life == 40)
            {
                int x = Greenfoot.getRandomNumber(600);
                int y = -20;
                addObject(new NyawaBaru(),x,y);
            }
            nextNyawa3 = 0;
        }
        
        nextNyawa4++;
        if(nextNyawa4 == 100)
        {
            if(Life == 20)
            {
                int x = Greenfoot.getRandomNumber(600);
                int y = -20;
                addObject(new NyawaBaru(),x,y);
            }
            nextNyawa4 = 0;
        }
    }
    
    int nextBerlian = 0;
    public void tampilBerlian()
    {
        nextBerlian++;
        if (nextBerlian == 500)
        {
            if(Skor.Skornya >= 2000)
            {
                int x = Greenfoot.getRandomNumber(600);
                int y = -20;
                addObject(new Berlian(),x,y);
            }
            nextBerlian = 0;
        }
    }
    
    public void Gameover()
    {
        int Life = Lifebar.LebarLife - Lifebar.Nyawa;
        if(Skor.Skornya < 0 || Life == 0)
        {
            Greenfoot.setWorld(new Gameover());
            //stopSound();
            //Greenfoot.playSound("gameover.mp3");
        }
    }
    
    //static public void stopSound()
    {
        //backsound.stop();
    }
    
}
