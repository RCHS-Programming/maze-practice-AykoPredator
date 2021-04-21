import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeWorld extends World
{

    /**
     * Constructor for objects of class MazeWorld.
     * 
     */
    public MazeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        for(int i = 0; i <16; i++)
        {
            addObject( new Wall("edge.png"), 25 + 50*i,12);
        }
        for(int i = 0; i <16; i++)
        {
            addObject( new Wall("edge.png"), 25 + 50*i,587);
        }
        for(int i = 0; i <16; i++)
        {
            addObject( new Wall("edge2.png"), 12 ,25 + 50*i);
        }
        for(int i = 0; i <16; i++)
        {
            addObject( new Wall("edge2.png"), 787 ,25 + 50*i);
        }
        for(int i = 0; i < 7; i++)
        {
            addObject( new Wall("edge.png"), 25 + 50*i,150);
        }
        for(int i = 0; i < 6; i++)
        {
            addObject( new Wall("edge2.png"), 550 ,25 + 50*i);
        }
        for(int i = 0; i < 8; i++)
        {
            addObject( new Wall("edge.png"), 170 + 50*i, 288);
        }
        for(int i = 0; i < 3; i++)
        {
            addObject( new Wall("edge2.png"), 155 ,310 + 50*i);
        }
        for(int i = 0; i < 11; i++)
        {
            addObject( new Wall("edge.png"), 170 + 50*i, 420);
        }
        for(int i = 0; i < 7; i++)
        {
            addObject( new Wall("edge2.png"), 700 ,100 + 50*i);
        }
    }
}
