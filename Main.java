package Gusanito;

public class Main {

    public static void main(String[] args) {
     char[][]field=new char[20][20];
     Gusanito gus =new Gusanito(field);
     int large= field.length;
     gus.SetPosicionXY();
     int posicionX=gus.getPosicionX();
     int posicionY=gus.getPosicionY();

     //Make Field
     for (int i=0;i<large;i++){
         for (int j=0;j<large;j++){
             if (i==0 || i==(large-1) || j==0 || j==(large-1)){
                 System.out.print("*");
             } else if (i==posicionX && j==posicionY) {
                 System.out.print(">");
             } else{
             System.out.print(" ");
             }
         }
         System.out.println();
     }













    }
}
