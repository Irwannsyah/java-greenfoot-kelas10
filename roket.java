import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class roket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class roket extends Actor
{
    /**
     * Act - do whatever the roket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int jeda = 0;
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w")){
            this.setLocation(this.getX(), this.getY()-9);
        }
        if(Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s")){
            this.setLocation(this.getX(), this.getY()+9);
        }
         if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")){
            this.setLocation(this.getX()-9, this.getY());
        }
         if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")){
            this.setLocation(this.getX()+9, this.getY());
        }
        
        // buat peluru secara terus menerus
    jeda++;
    if(jeda >= 70){
        peluru plr = new peluru();
        this.getWorld().addObject(plr,this.getX(), this.getY()-50);
        Greenfoot.playSound("pecu.mp3");
        jeda = 0;
    }
    
  }
}


