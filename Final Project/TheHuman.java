    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    import java.util.List;
    /**
     * Write a description of class TheHuman here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class TheHuman extends Actor
    {
     
        private GreenfootImage frame0 = new GreenfootImage("frameRight1.gif");//uploads the "frame0.gif" image
        private GreenfootImage frame1 = new GreenfootImage("frameRight2.gif");//uplaods the "frame1.gif" image
        private GreenfootImage frame2 = new GreenfootImage("frameRight3.gif");//uplaods the "frame2.gif" image
        private GreenfootImage frame3 = new GreenfootImage("frameRight4.gif");//uploads the "frame3.gif" image
        private GreenfootImage frame4 = new GreenfootImage("frameRight5.gif");//uploads the "frame4.gif" image
        private GreenfootImage frame5 = new GreenfootImage("frameRight6.gif");//uploads the"frame5.gif" image
        private GreenfootImage frame6 = new GreenfootImage("frameRight7.gif");//uploads the "frame6.gif" image
        private GreenfootImage frame7 = new GreenfootImage("frameRight8.gif");//uploads the "frame7.gif"image
        /*
         * The rest of these variable will be for the left walking motion for the character
         * It uploads the images "Picture1.gif"-"Picture2.gif"
         */
        private GreenfootImage frameLeft1 = new GreenfootImage("frameLeft1.gif");
        private GreenfootImage frameLeft2 = new GreenfootImage("frameLeft2.gif");
        private GreenfootImage frameLeft3 = new GreenfootImage("frameLeft3.gif");
        private GreenfootImage frameLeft4 = new GreenfootImage("frameLeft4.gif");
        private GreenfootImage frameLeft5 = new GreenfootImage("frameLeft5.gif");
        private GreenfootImage frameLeft6 = new GreenfootImage("frameLeft6.gif");
        private GreenfootImage frameLeft7 = new GreenfootImage("frameLeft7.gif");
        private GreenfootImage frameLeft8 = new GreenfootImage("frameLeft8.gif");
        ///
        private int frame = 1;
        private int animateCounter = 0;
        private int speed = 4;
        private int vSpeed = 0;
        private int acceleration = 1;
        private int jumpStrength = -20;
        
    
        /**
         * Act - do whatever the TheHuman wants to do. This method is called whenever
         * the 'Act' or 'Run' button gets pressed in the environment.
         */
        public void act() 
        {
            animateCounter++;
            checkKeys();
            checkFall();
            
            if( onGround() == false )
            {
                if( getObjectsInRange(getImage().getHeight()/2, Ground.class).size() != 0 )
                {
                    while( getOneIntersectingObject(Ground.class) != null )
                    {
                        vSpeed = 0;
                        setLocation( getX(), getY() + acceleration);
                    }
                }
            }
            if (isTouching(Rubies.class) == true)
            {
                removeTouching(Rubies.class);
                ((MyWorld)getWorld()).update();
            }
            if(isTouching(Spike.class)==true)
            {
                Greenfoot.delay(30);
                Greenfoot.setWorld(new DeathScreen());
            }
            if(isTouching(Ghost.class)==true)
            {
                
                Greenfoot.delay(30);
                Greenfoot.setWorld(new DeathScreen());
                Greenfoot.setWorld(new MyWorld());
            }
            
            
            
            
            
            if(isTouching(Character.class))
            {
               Greenfoot.setWorld(new WinScreen()); 
            }
            
        }    
        private void checkKeys()
        {
            if (Greenfoot.isKeyDown("right")||Greenfoot.isKeyDown("d"))
            {
                setLocation(getX()+speed, getY());
                moveRight();
                if (Greenfoot.isKeyDown("right")&& Greenfoot.isKeyDown("up"))
                {
                    setImage(frame0);
                }
            }
            if (Greenfoot.isKeyDown("left")||Greenfoot.isKeyDown("a"))
            {
                setLocation(getX()-speed, getY());
                moveLeft();
                if (Greenfoot.isKeyDown("left")&& Greenfoot.isKeyDown("up"))
                {
                    setImage(frameLeft1);
                }
            }
            if (onGround() && (Greenfoot.isKeyDown("up")||Greenfoot.isKeyDown("w")) )
            {
                jump();
                
            }
            
          
        }

        public void jump()
        {
            vSpeed = jumpStrength;
            fall();
            
        }
        public void checkFall()
        {
            if(onGround())
            {
                vSpeed = 0;
            }
           
            else
            {
                fall();
            }
            
            
        }
        public boolean onGround()
        {
            Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Ground.class);
            return under != null;
        }
        
        public void fall()
        {
            setLocation(getX(), getY() + vSpeed   );
            vSpeed = vSpeed + acceleration;
            
        }
        private void moveRight()
        {
            
            if (animateCounter % 4 == 0)
            {
                animateRight();
                
            }
        }
        private void moveLeft()
        {
            if (animateCounter % 4 == 0)
            {
                animateLeft();
            }    
        }
        private void animateRight()
        {
            if (frame==1)
            {
                setImage(frame0);
            }
            
            else if (frame==2)
            {
                setImage(frame1);
            }
            else if (frame==3)
            {
                setImage(frame2);
            }
            else if (frame==4)
            {
                setImage(frame3);
            }
            else if (frame==5)
            {
                setImage(frame4);
            }
            else if (frame==6)
            {
                setImage(frame5);
            }
            else if (frame==7)
            {
                setImage(frame6);
            }
            else
            {
                setImage(frame7);
                frame = 1;
            }
            frame++;
        }
        private void animateLeft()
        {
              if (frame==1)
            {
                setImage(frameLeft1);
            }
            
            else if (frame==2)
            {
                setImage(frameLeft2);
            }
            else if (frame==3)
            {
                setImage(frameLeft3);
            }
            else if (frame==4)
            {
                setImage(frameLeft4);
            }
            else if (frame==5)
            {
                setImage(frameLeft5);
            }
            else if (frame==6)
            {
                setImage(frameLeft6);
            }
            else if (frame==7)
            {
                setImage(frameLeft7);
            }
            else
            {
                setImage(frameLeft8);
                frame = 1;
            }
            frame++;
        }
  
}
