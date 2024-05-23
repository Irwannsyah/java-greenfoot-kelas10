import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class arip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class alien extends Actor
{
    /**
     * Act - do whatever the arip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        
        this.setLocation(
          this.getX()+Greenfoot.getRandomNumber(1),
          this.getY()+Greenfoot.getRandomNumber(4)
        );
        
        if(this.getY() >= 580){
            alien aln = new alien();
            this.getWorld().addObject(aln, 
                 Greenfoot.getRandomNumber(600),
                 Greenfoot.getRandomNumber(1)
            );
            // alien yang dibawah hilang
            this.getWorld().removeObject(this);
            // nyawa di kurangi 1
            nyawa.setNyawa( ( nyawa.lihatNyawa()-1) );
            nyawa.lihatNyawa();
        }
    }
}
