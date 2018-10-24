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
       // add 10 Food objects to the world (NOTE: YOU SHOULD BE CALLING A 
       //METHOD FROM THIS CLASS TO 
       // DO THIS!)
       addFood(10);

       // add a Fly object at a random position somewhere in the world
       
       addFly();
       // add a Frog object at the center of the world 
       
       addFrog();
       
       //adds in a scoreboard
       score = new Scoreboard();
       addObject( score, 75, 25);
       
       

    }
    /**
     * act() runs when you press the run or act button and adds ten peices of
     * food if ten food peices have already been eaten
     * 
     * @return nothing does not return anything
     * @param there are no paramaters
     */
    public void act()
    {
        if (getObjects(Food.class).size() == 0)
        {
           addFood(10);   
        }
    }
    
    /**
     * Adds n Food objects to the world
     * 
     * @return nothing does not return anything
     * @param int n is the parameter to tell the code how much food you want
     */
    public void addFood(int n)
    {
        for(int f=0; f<n; f++) {
            int x = Greenfoot.getRandomNumber( getWidth() );
            int y = Greenfoot.getRandomNumber( getHeight() );
            addObject(new Food(),x,y);
        }
        
    }
    
    /**
     * addFly() adds a fly at a random place on the screen
     * 
     * @return nothing does not return anything
     * @param there are no paramaters
     */    
    public void addFly()
    {
        int x = Greenfoot.getRandomNumber( getWidth() );
        int y = Greenfoot.getRandomNumber( getHeight() );
        addObject( new Fly(), x, y); 
    }
    
    /**
     * addFrog() adds a new frog in the middle of the world
     * 
     * @return nothing does not return anything
     * @param there are no paramaters
     */    
    public void addFrog()
    {
       addObject( new Frog(), getWidth()/2, getHeight()/2); 
    }
    
    /**
     * update() updates the score for the scoreboard by calling on the addToScore method
     * 
     *@return none there is nothing returned 
     *@param there are no paramaters
     */
    public void update()
    {
        score.addToScore();  
    }
    

}
