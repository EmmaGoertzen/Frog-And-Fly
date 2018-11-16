import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 10 marks
 */
public class Frog extends Creature
{
    // The Frog's speed ...
    private int speed;
    
    public Frog()
    {        
        // set the Frog's speed to a random number between 4 and 8
       
    }
    
    public void act() 
    {
        // make the Frog move at its speed, in the direction it is facing
        move(getRandomNumber(4,8) );
        /*
         * Make the frog turn off course 35% of the time.
         * It will turn left or right 15 degrees equally as often. 
         */ 
        if(Greenfoot.getRandomNumber(100)<35)
        {
            if( Greenfoot.getRandomNumber(2)<1)
            {
                turn(15);
            }
            else
            {
                turn(-15);
            }
        }
        
        /*
         * If the frog is near an edge of the world, make it turn
         * 7 degrees to the right. 
         * 
         * Hint: use the atEdgeOfWorld method in the Creature class.
         */
        checkForFlys();
        if(isAtEdge() == true)
        {
            turn(7);
        }
        
        /*
         * If the frog encounters the fly, the game ends, so
         * stop the scenario 
         */ 
        
        
    }   
    public int getRandomNumber(int start,int end)
    {
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
    private void checkForFlys()
    {
        if( isTouching(Fly.class)==true)
       {
           //Eat the worm (remove the worm from world)
           removeTouching(Fly.class);
           //This is to play the sound
           //Greenfoot.playSound("au.wav");
           Greenfoot.stop();
        }
    }
}
