package Gusanito;

public class Gusanito {

    public Gusanito(char[][] field){
      this.field=field;
    }
    private int posicionX;
    private int posicionY;
    int posicionInicial;
    char[][] field;
    char[][] worm = new char[posicionX][posicionY];


    public void setPosicionInicial(char[][]matriz) {
        this.posicionX= matriz.length/2;
        this.posicionY=matriz[0].length/2;

    }
    public int getPosicionInicial(){
       return posicionInicial;
    }

    public char[][] MovetToRight(){

    }

}
