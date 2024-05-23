import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class surip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class surip extends Actor
{
    /**
     * Act - do whatever the surip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int jeda=0;
    public void act()
    {
        //menghapus ledakan
        jeda++;
        if(jeda>= 20){
            this.getWorld().removeObject(this);
            Greenfoot.playSound("ledakan.mp3");
        }   
    }
}
