package Gusanito;

public class Main {

    public static void main(String[] args) {
     Gusanito gusanito=new Gusanito();
     char[][]matriz=new char[20][20];
     int large= matriz.length;
     gusanito.setPosicionA(matriz);
     int location=gusanito.GetLocation();

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
