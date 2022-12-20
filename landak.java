import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class landak here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class landak extends Actor
{
    /**
     * Act - do whatever the landak wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //Prosedur Pergerakan Landak Dari Atas Kebawah
        setLocation(getX(), getY() +3 );
        if(isAtEdge())
        setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),0);
        
    }
}
