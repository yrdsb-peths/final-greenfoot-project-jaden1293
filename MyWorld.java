import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * a baby ran from his babysitters all the way to space where they now float
 * around
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
        //starts game
        startGame();
    }

    private void startGame()
    {
        Player player = new Player();
        addObject(player,51,44);
        Babysitter babysitter = new Babysitter();
        addObject(babysitter,51,135);
        Babysitter babysitter4 = new Babysitter();
        addObject(babysitter4,171,184);
        babysitter4.setLocation(189,187);
        Babysitter babysitter6 = new Babysitter();
        addObject(babysitter6,300,129);
        Babysitter babysitter7 = new Babysitter();
        addObject(babysitter7,303,237);
        Babysitter babysitter9 = new Babysitter();
        addObject(babysitter9,429,180);
        Babysitter babysitter10 = new Babysitter();
        addObject(babysitter10,435,312);
        Babysitter babysitter13 = new Babysitter();
        addObject(babysitter13,554,356);

    }
   
}
