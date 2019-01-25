import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ghost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ghost extends Actor
{
    private int speed ;
    /**
     * Constructor for Ghost class
     */
    public Ghost()
    {
        getImage().scale(getImage().getWidth()+ 20, getImage().getHeight()+20);
        speed = Greenfoot.getRandomNumber(300);
    }
    /**
     * Act - do whatever the Ghost wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * Got the lines of code for the movemnet from my classmate Caelan
     * This method controls how the ghost move. 
     * @return no return type
     * @param no parameters
     * 
     */ 
    public void act() 
    {
       if (isTouching(Ground.class) == true)
       {
           
           turn(7);
       }
        
       move(2);
       if (isAtEdge()==true)
       {
           turn(2);
       }
        
       if (Greenfoot.getRandomNumber(100)<20) 
       {
          
           Actor person = (Actor)getWorld().getObjects(TheHuman.class).get(0);
           turnTowards(person.getX(), person.getY());
       }
       
    }  
    
}
