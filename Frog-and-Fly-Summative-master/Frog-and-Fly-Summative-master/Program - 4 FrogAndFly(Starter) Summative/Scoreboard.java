import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends Actor
{
    private int points;
    private Font myFont = new Font("Comic Sans MS", true, false, 24);
    public boolean pointsAreTen = false;
    
    /**
     * Scoreboard() sets the points value to 0, creates a new greenfootimage 
     * called img, sets the font to myFont, draws a string that says "score:", 
     * and then draws img.
     * 
     * @return none there is no parameters
     * @param there is no parameters
     */
    public Scoreboard()
    {
        points = 0;
        GreenfootImage img = new GreenfootImage(150,30);
        img.setFont( myFont );
        img.drawString("Score: " + points, 5,25);
        setImage(img);
    }

    /**
     * addToScore increases the points variable by one, draws "img",
     * clears that img, and then if points are less than 1000 it draws the score
     * 
     * @return none there is no return
     * @param there is no parameters
     */
    public void addToScore() 
    {
        points++;
        GreenfootImage img = getImage();
        img.clear();
        if(points < 1000) {
            img.drawString("Score: " + points, 5,25); 
        } 
    } 

}
