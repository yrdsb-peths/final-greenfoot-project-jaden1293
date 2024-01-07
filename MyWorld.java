import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * a frog that eats bugs
 * 
 * @author (jaden lee) 
 * @version (12/18/23)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        startGame();
    }

    private void startGame()
    {
        Player player = new Player();
        addObject(player,300,255);
        Babysitter enemy1 = new Babysitter();
        addObject(enemy1, 300, 60);
        Babysitter enemy2 = new Babysitter();
        addObject(enemy2, 100, 209);
        Babysitter enemy3 = new Babysitter();
        addObject(enemy3, 500, 338);
        Babysitter babysitter = new Babysitter();
        addObject(babysitter,499,232);
        Babysitter babysitter2 = new Babysitter();
        addObject(babysitter2,289,155);
        Babysitter babysitter3 = new Babysitter();
        addObject(babysitter3,97,92);
        Babysitter babysitter4 = new Babysitter();
        addObject(babysitter4,190,185);
        Babysitter babysitter5 = new Babysitter();
        addObject(babysitter5,402,259);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
}
