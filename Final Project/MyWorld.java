import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
/**
 * Name: Halimat Ayoade
 * Course: Software Development 
 * Course Teacher: Mr. Hardman
 * Date last modified: 1/25/2019
 */
public class MyWorld extends greenfoot.World
{
    private ScoreBoard score;
    
    /**
     * Constructor for objects of class MyWorld.
     * adds all the Characters for the world
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(990, 740, 1); 
        
        getBackground().setColor(Color.BLACK);
        getBackground().fillRect(0,0,getWidth(),getHeight());
         Font myFont = new Font("Agency FB", true, false, 32);//makes the font comic sans MS in the size of 24

        //
     
        
        //add ground
        addObject(new Ground(), 15, 728);
        addObject(new Ground(), 65, 728);
        addObject(new Ground(), 115, 728);
        addObject(new Ground(), 165, 728);
        addObject(new Ground(), 215, 728);
        addObject(new Ground(), 265, 728);
        addObject(new Ground(), 315, 728);
        addObject(new Ground(), 365, 728);
        addObject(new Ground(), 410, 728);
        addObject(new Ground(), 460, 728);
        addObject(new Ground(), 510, 728);
        addObject(new Ground(), 560, 728);
        addObject(new Ground(), 610, 728);
        addObject(new Ground(), 660, 728);
        addObject(new Ground(), 710, 728);
        addObject(new Ground(), 760, 728);
        addObject(new Ground(), 810, 728);
        addObject(new Ground(), 860, 728);
        addObject(new Ground(), 910, 728);
        addObject(new Ground(), 960, 728);
        addObject(new Ground(), 980, 728);
        
        //the platform with dot
        addObject(new Ground(), 430, 135);
        addObject(new Ground(), 480,135);
        addObject(new Ground(), 530,135);
        // more grounds
        addObject(new Ground(),20,520);
        addObject(new Ground(),70,520);
        addObject(new Ground(), 120, 520);
        
        addObject(new Spike(), 120, 490);
        addObject(new Ground(),170,520);
        addObject(new Ground(),220, 520);
        addObject(new Ground(),270, 520);
        
        //addObject(new Ground(), 350,560 );
        addObject(new Ground(),465,540);
        addObject(new Ground(), 485,540);
        addObject(new Rubies(), 485, 540);
        addObject(new Ground(), 470,540);
        addObject(new Ground(), 420,540);
        addObject(new Ground(), 490,540);
        //addObject(new Ground(), 510,600);
       
        addObject(new Ground(), 730,520);
        addObject(new Ground(), 780,520);
        addObject(new Ground(), 830,520);
        addObject(new Spike(), 870, 490);
        addObject(new Ground(), 880,520);
        addObject(new Ground(), 930,520);
        addObject(new Ground(), 980,520);
        //Adding more
        addObject(new Ground(), 20, 260);
        addObject(new Ground(), 70, 260);
        addObject(new Rubies(), 45, 200);
        addObject(new Ground(), 480,340);
        addObject(new Ground(), 430,340);
        addObject(new Ground(), 530,340);
        addObject(new Ground(), 700,360);
        addObject(new Ground(), 750,360);
        addObject(new Rubies(), 725, 290);
        addObject(new Ground(), 150, 345);
        addObject(new Ground(), 200,360);
        addObject(new Ground(), 250,360);
        addObject(new Rubies(), 225, 290);
        addObject(new Rubies(), 480, 290);
        
        addObject(new Ground(), 920, 260);
         addObject(new Rubies(), 950, 200);
        addObject(new Ground(),970,260);
        /////////
        addObject(new Ground(), 310, 520);
        addObject(new Ground(), 680, 520);
        addObject(new Ground(), 360, 540);
        addObject(new Ground(), 410,540);
        addObject(new Ground(),640, 540);
        addObject(new Ground(),590,540);
        addObject(new Ground(), 540,540);
        addObject(new Ground(), 800, 345);
        
        addObject(new Ground(), 270, 185);
        addObject(new Ground(), 200,200);
        addObject(new Ground(), 220,200);
        //addObject(new Ground(),);
        addObject(new Ground(), 670, 185);
        addObject(new Ground(), 720,200);
        addObject(new Ground(), 740,200);
        //dot
        addObject(new Character(),480, 80);
        //add scoreboard
        score = new ScoreBoard();
        addObject(score,79,25);
        //
       ;
        //the human
        addObject(new TheHuman(),480,500);
        //the ghosts
        if (getObjects(Rubies.class).isEmpty()) 
        {
            Greenfoot.setWorld(new WinScreen());

        }
        addObject( new Ghost(), Greenfoot.getRandomNumber(getWidth() ), Greenfoot.getRandomNumber(getHeight() ) );
    }
    /**
     * Update will update the number of the score in the world
     */
    public void update()
    {
        score.addToScore();
    } 
    
    
    
    
    
    
    
    
    
    
}
