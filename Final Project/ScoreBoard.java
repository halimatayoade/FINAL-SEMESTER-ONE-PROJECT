import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Actor
{
    private int points;
    private Font myFont = new Font("Agency FB", true, false, 32);//makes the font comic sans MS in the size of 24
    private String score = "Score:";
    /**
     * adds the font to the code
     * Puts Score: to the code and places the adding numbers
     * Puts Score: at a specific coordinate
     */
    public ScoreBoard()
    {
        points = 0;
        GreenfootImage img = new GreenfootImage(150,30);
        img.setColor(Color.WHITE);
        img.setFont( myFont );
        img.drawString(score + points, 5,25);
        setImage(img);
    }

     /**
     * points add to the code
     * says that if the points are less than 7 keep adding the points
     * If not stop the scenerio
     */
    public void addToScore() 
    {
        points++;
        GreenfootImage img = getImage();
        img.clear();
        if(points < 7) 
        {
            img.drawString(score + points, 5,25); 
        } 
        else 
        {
           
            Greenfoot.stop();
        }        
    }       
  }      

