package Gusanito;

import java.util.Random;

public class Gusanito {

    public Gusanito(char[][] field){
      this.field=field;
    }
    private int posicionX;
    private int posicionY;
    private final char[][] field;
    private char[][] worm;
    private int foodPosX;
    private int foodPosY;



   public void SetPosicionXY(){
       this.posicionX=field.length/2;
       this.posicionY=field[0].length/2;
   }

    public int getPosicionX(){
       return this.posicionX;
    }
    public int getPosicionY(){
       return this.posicionY;
    }

    public void moveToRight(){
      this.posicionY+=1;
    }
    public void moveToLeft(){
       this.posicionY-=1;
    }
    public void moveToUp(){
       this.posicionX-=1;
    }
    public void moveToDown(){
       this.posicionX+=1;
    }

    public void MakeFoodAleatory(){
        Random random = new Random();
        this.foodPosX=random.nextInt(17)+1;
        this.posicionY=random.nextInt(17)+1;
    }

    public int getFoodPosX(){
       return this.foodPosX;
    }
    public int getFoodPosY(){
       return this.foodPosY;
    }



}
