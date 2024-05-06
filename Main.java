package Gusanito;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
     char[][]field=new char[20][20];
     Gusanito gus =new Gusanito(field);
     gus.SetPosicionXY();
     int posicionX=gus.getPosicionX();
     int posicionY=gus.getPosicionY();
     int large= field.length;
     String direction;
     boolean play=true;
     System.out.println("Bienvenido a nuestro juego: The Worm!");


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



        while(play){
         System.out.println("Hacia donde se deseea mover? R/rigth  L/Left  U/Up  D/Down  Q/Quit");
         direction=sc.next();

          switch (direction.toLowerCase()){
             case"r":{
                 gus.moveToRight();
                 System.out.println(posicionX+" "+posicionY);
                 break;
             }
             case "q":{
                 play=false;
                 break;
             }

          }
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
}
