import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class skor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Skor extends Actor
{
    /**
     * Act - do whatever the skor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static int angka = 0;
    private String teks;
    private int panjangTeks;
    public Skor(){ 
        this("");
}
    public Skor(String awal){
        teks = awal;
        panjangTeks = (teks.length() +2)*10;
        setImage(new GreenfootImage(panjangTeks,16));
        GreenfootImage gambar = getImage();
        gambar.setColor(new Color(100,128, 54));
        updateGambar();
}
 public void updateGambar(){
        GreenfootImage img = getImage();
        img.clear();
        img.drawString(teks + angka, 1, 12);
}
    public void act(){
        // Add your action code here.
        updateGambar();
        if(angka >= 100){  
            //maka akan ganti dunia (stage)
        }
}
public static int lihatSkor(){
    return angka;
}
   public static void setSkor(int nilai){
    angka = nilai;
}
}
