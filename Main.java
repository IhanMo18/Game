package Gusanito;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
     char[][]field=new char[20][20];
     Gusanito gus =new Gusanito(field);
     gus.SetPosicionXY();
     int large= field.length;
     String direction;
     boolean play=true;
     System.out.println("Bienvenido a nuestro juego: The Worm!");
     gus.MakeFoodAleatory();

        for (int i=0;i<large;i++){
            for (int j=0;j<large;j++){
                if (i==0 || i==(large-1) || j==0 || j==(large-1)){
                    System.out.print("*");
                } else if (i==gus.getPosicionX() && j==gus.getPosicionY()) {
                    System.out.print("@");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        while(play){
         System.out.println("Hacia donde se deseea mover? D/Rigth  A/Left  W/Up  S/Down  Q/Quit");
         direction=sc.next();

          switch (direction.toLowerCase()){
             case"d":{
                 gus.moveToRight();
                 break;
             }
              case"a":{
                  gus.moveToLeft();
                  break;
              }
              case"w":{
                  gus.moveToUp();
                  break;
              }
              case "s":{
                  gus.moveToDown();
                  break;
              }
             case "q":{
                 play=false;
                 break;
             }
              default:
                  System.out.println("Caracter No Valido");
          }

            for (int i = 0; i < large; i++) {
                for (int j = 0; j < large; j++) {
                    if (i == 0 || i == (large - 1) || j == 0 || j == (large - 1)) {
                        System.out.print("*");
                    }if (i == gus.getPosicionX() && j == gus.getPosicionY()) {
                        System.out.print("@");
                    } else if (i== gus.getFoodPosX() && j==gus.getFoodPosY()) {
                        System.out.println("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            if (gus.getPosicionX() == 0 || gus.getPosicionX() == (large - 1) || gus.getPosicionY() == 0 || gus.getPosicionY() == (large - 1)) {
                System.out.println("OH no se ha estrellado");
                play = false;
            }

        }

    }
}
