import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Babysitter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Babysitter extends Actor
{
    int enemySpeed = 3;
    /**
     * Act - do whatever the Babysitter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        moveAround();
    }
    public void moveAround()
    {
        move(3);
        if(getX() >= 599)
        {
            setLocation(0, getY());
        }
        if (Greenfoot.isKeyDown("space"))
        {
            enemySpeed = enemySpeed + 1;
        }
        else 
        {
            enemySpeed = 3;
        }
    }
}
