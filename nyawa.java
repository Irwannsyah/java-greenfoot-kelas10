import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nyawa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nyawa extends Actor
{
    /**
     * Act - do whatever the nyawa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static int angka = 3;
    private String teks;
    private int panjangTeks;
    public nyawa(){ this("");}
    public nyawa(String awal){
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
        if(angka <= 0){  
            //ini nanti game over
        }
}
public static int lihatNyawa(){
    return angka;
}
   public static void setNyawa(int nilai){
    angka = nilai;
}
}
