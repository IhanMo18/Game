package Gusanito;

public class Main {

    public static void main(String[] args) {
     char[][]matriz=new char[20][20];
     Gusanito gusanito=new Gusanito(matriz);
     int large= matriz.length;
     gusanito.setPosicionInicial(matriz);
     int location=gusanito.getPosicionInicial();

     //Make Field
     for (int i=0;i<large;i++){
         for (int j=0;j<large;j++){
             if (i==0 || i==(large-1) || j==0 || j==(large-1)){
                 System.out.print("*");
             } else if (i==location && j==location) {
                 System.out.print(">");
             } else{
             System.out.print(" ");
             }
         }
         System.out.println();
     }












    }
}
