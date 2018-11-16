import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * Have the fly count how many Food object it eats (2 marks)
 * Every time the fly eats all 10 Food objects, add 10 more Food
 * objects to the world and continue playing. (3 marks)
 * 
 */
public class Fly extends Creature
{
    public Fly()
    {
        /*
         * modify this code to make the turtle face any random 
         * initial direction
         */
        setRotation(getRandomNumber(0, 360) );
    }
    public int getRandomNumber(int start,int end)
    {
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
       
    }
    public void act() 
    {
        // make the fly move 4 steps in the direction it is facing
        checkForKeys();
        
        checkForFood();
        /*
         * Make the fly turn left or right 5 degrees when
         * the left or right arrow key is pressed. 
         */
        
        
        /*
         * If the fly touches a Food object, remove the Food object
         * from the world. 
         */
        
        
    }    
    private void checkForKeys()
    {
        if(Greenfoot.isKeyDown("up") == true)
       {
           //The Fly will turn right
          move(6);
       }
       if(Greenfoot.isKeyDown("right") == true)
       {
           //The Fly will turn right
           turn(5);
       }
       //If the left arrow key is pressed
       if(Greenfoot.isKeyDown("left") == true)
       {
           //The Fly will turn left
           turn(-5);
        }
    }
    private void checkForFood()
    {
        if( isTouching(Food.class)==true)
       {
           //Eat the Food (remove the worm from world)
           removeTouching(Food.class);
           //This is to play the sound
           //Greenfoot.playSound("au.wav");
           ( (Beach)getWorld()).update();
       }
    }
}
