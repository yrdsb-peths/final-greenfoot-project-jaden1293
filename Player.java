import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The thing you control to eat the candy through the maze
 * 
 * @author (Jaden Lee) 
 * @version (23-12-19)
 */
public class Player extends Actor
{
    int speed = 2;
    /**
     * Act - do whatever the Baby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        moveAround();
        hitEnemy();
        youWin();
    }
    public void moveAround()
    {
        move(speed);
        if (Greenfoot.isKeyDown("right"))
        {
            turn(4);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }
        if (Greenfoot.isKeyDown("space"))
        {
            speed = speed + 1;
        }
        else
        {
            speed = 1;
        }
    }
    public void hitEnemy()
    {
        if (isTouching(Babysitter.class))
        {
            getWorld().addObject(new YouLose(), 300, 200);
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
    }
    public void youWin()
    {
        if(getY() == 399)
        {
            getWorld().addObject(new YouWin(), 400, 300);
            Greenfoot.stop();
        }
        
    }
}
