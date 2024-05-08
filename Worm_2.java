package Gusanito.otro;

public class Worm_2 {
   private int worm_PosY;
   private int worm_PosX;
   private String worm_emoji;
   int tamanio=0;

   public Worm_2(String[][] field){
      this.worm_PosX=field.length/2;
      this.worm_PosY=field[0].length/2;
   }

   public int getWorm_PosX(){
      return this.worm_PosX;
   }
   public int getWorm_PosY(){
      return this.worm_PosY;
   }

   public void moveToRight(){
      this.worm_PosY+=1;
   }
   public void moveToLeft(){
      this.worm_PosY-=1;
   }
   public void moveToUp(){
      this.worm_PosX-=1;
   }
   public void moveToDown(){
      this.worm_PosX+=1;
   }
   public void setWorm_emoji(String worm_emoji) {
      this.worm_emoji = worm_emoji;
   }
   public String getWorm_emoji() {
      return worm_emoji;
   }



}
