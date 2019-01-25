import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DeathScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeathScreen extends World
{

    /**
     * Constructor for objects of class DeathScreen.
     * 
     */
    public DeathScreen()
    {    
        // Create a new world with 1000x732 cells with a cell size of 1x1 pixels.
        super(1000,732, 1); 
    }
    /**
     * In the act method there is a isKeyDown Method that makes the deathScreen change to Level 1 by 
     * pressing "enter"
     * @return nothing is returned
     * @param no parameters
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
