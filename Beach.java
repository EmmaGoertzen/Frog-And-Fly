import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 5 marks
 */
public class Beach extends World
{
    private Scoreboard score;
    
    public Beach()
    {    
       super(800, 600, 1); 
       // add 10 Food objects to the world (NOTE: YOU SHOULD BE CALLING A METHOD FROM THIS CLASS TO 
       // DO THIS!)
       addFood(10);

       // add a Fly object at a random position somewhere in the world
       addObject(new Fly(), Greenfoot.getRandomNumber(getWidth()/2) +getWidth()/2, Greenfoot.getRandomNumber(getHeight()) );
       
       //add a Frog object at the center of the world
       addObject(new Frog(), getWidth()/2, getHeight()/2 );
        
       
       //This holds the score so the scoreboard can go up
       score = new Scoreboard();
       
       //This add the scoreboard itself to the world
       addObject( score, 75, 25);
       
       //Ignore this bit
       //if(getObjects(Food.class).isEmpty())
        //{
          //  Greenfoot.setWorld(new FinalScreen());
        //}
      
    }
    
    public void act() 
    {
        if(getObjects(Food.class).size()==0)
        {
            addFood(10);
        }
    }
    /**
     * Adds n Food objects to the world
     */
    public void addFood(int n)
    {
        for(int f=0; f<n; f++) {
            int x = Greenfoot.getRandomNumber( getWidth() );
            int y = Greenfoot.getRandomNumber( getHeight() );
            addObject(new Food(),x,y);
        }
    }
    
    public void update()
    {
        score.addToScore();
    }
}
