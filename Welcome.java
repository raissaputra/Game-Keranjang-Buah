import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Welcome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Welcome extends Actor
{
    /**
     * Act - do whatever the Welcome wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("space"));
        {
            Greenfoot.setWorld(new Main());//mengalihkan world menuju ke world main
        }
        Welcome();//memanggil dan menjalankan metod welcome()
    }
    
    public void Welcome()
    {
        GreenfootImage welcome = new GreenfootImage(400,300);//membuat objek gbr baru
        welcome.setFont(new Font("Arial",20));//atur jenis huruf
        welcome.setColor(Color.BLUE);
        welcome.drawString("Game Tangkap Buah"+
        "\nTekan Space untuk mulai!",10,30);
        setImage(welcome);
        setLocation(350,300);
    }
}
