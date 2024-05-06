package Gusanito;

public class Gusanito {

    public Gusanito(char[][] field){
      this.field=field;
    }
    private int posicionX;
    private int posicionY;
    private final char[][] field;
    private char[][] worm;


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

    public void setWorm() {
        this.worm=new char[posicionX][posicionY];
    }
    public char[][] getWorm() {
        return worm;
    }

}
