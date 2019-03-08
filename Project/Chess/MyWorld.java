import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 8x8 cells with a cell size of 60x60 pixels.
        super(8, 8, 60, true);
        GreenfootImage background = new GreenfootImage("chessboard.jpg");
        setBackground(background);
    }
}
