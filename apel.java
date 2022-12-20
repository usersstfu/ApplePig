import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class apel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class apel extends Actor
{
    /**
     * Act - do whatever the apel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    //Prosedur Membuat pergerakan Apel Dari Arah Kanan Ke Arah Kiri
    {
        setLocation(getX()-3 , getY());
        if(getX() <= 1) {
            setLocation(getX()+700, Greenfoot.getRandomNumber(400));
        }
}
}
