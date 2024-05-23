import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class peluru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class peluru extends Actor
{
    /**
     * Act - do whatever the peluru wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        this.setLocation(this.getX(), this.getY()-1);
        
        // jika peluru mencapai atas (koordinat Y <) maka peluru hilang
        if(this.getY() < 5){
            this.getWorld().removeObject(this);
        }else if(this.isTouching(alien.class)){
            this.removeTouching(alien.class);
            this.getWorld().addObject(new alien(), 
                Greenfoot.getRandomNumber(385),
                Greenfoot.getRandomNumber(20)
            );
            // tambahkan ledakan
            surip srp = new surip();
            this.getWorld().addObject(srp, this.getX(), this.getY());
            this.getWorld().removeObject(this);
            
            //skor kita tambahkan
            Skor.setSkor( (Skor.lihatSkor()+1 ) );
            Skor.lihatSkor();
        }
    }
}
