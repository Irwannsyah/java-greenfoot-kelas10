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
    //public static GreenfootSound suara = new GreenfootSound("alien.wav");
    public MyWorld()
    {
    super(400, 600, 1); 
    // MENAMBAHKAN ROKET
    roket rkt = new roket();
    this.addObject(rkt, 200,540);
    // MENAMBAHKAN ALIEN 5 KALI KE STAGE
      for(int i=0; i<3; i++){  
        alien aln = new alien();
        this.addObject(aln,
          Greenfoot.getRandomNumber(385),
          Greenfoot.getRandomNumber(20)
        );
     }
    // MENAMBAHKN PELURU DARI BADAN ROKET
    peluru plr = new peluru();
    this.addObject(plr, rkt.getX(), rkt.getY()-50);
    //menambahkan nyawa
    nyawa ny = new nyawa("nyawa: ");
    this.addObject(ny, 380,580);
    
    Skor skr = new Skor("score: ");
    this.addObject(skr, 60,580);
    }
    //public void started(){ suara.playLoop();}
    //public void stopped(){ suara.stop();}
 
}



