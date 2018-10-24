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
         * modify this code to make the fly faces any random 
         * initial direction
         */
        setRotation( Greenfoot.getRandomNumber(360));
    }
    
    /**
     * when the act or run button is pressed, it runs the following commented code
     * 
     * @return non there is no return
     * @param there is no parameters
     */
    public void act() 
    {
        // make the fly move 4 steps in the direction it is facing
        if (Greenfoot.isKeyDown("up") == true)
        {
            move(4);  
        }
        /*
         * Make the fly turn left or right 5 degrees when
         * the left or right arrow key is pressed. 
         */
        if (Greenfoot.isKeyDown("right") == true)
        {
            turn(5);  
        }
        if (Greenfoot.isKeyDown("left") == true)
        {
            turn(-5);  
        }
        
        /*
         * If the fly touches a Food object, remove the Food object
         * from the world. 
         */
        if (isTouching(Food.class) == true)
        {
            removeTouching(Food.class);
            
            ( (Beach)getWorld() ).update();
        }
        
    }    
}
