package Gusanito.otro;
import java.util.Scanner;
public class Main {
    private int cont=0;
    private static final String[][]field=new String[20][20];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Worm_2 worm=new Worm_2(field);
        Food food=new Food();
        Main game=new Main();
        food.makeFood();
        int large= field.length;
        boolean play=true;



        //Make Field

        for (int i=0;i< large;i++){
            for (int j=0;j< large;j++){
                if (i==0 || i==19 || j==0 || j==19){
                    field[i][j]="*";
                }else if (i==food.getWorm_FoodX() && j==food.getWorm_FoodY()){
                    field[i][j]="*";
                }else if (i== worm.getWorm_PosX() && j== worm.getWorm_PosY()){
                    field[i][j]=">";
                }else{
                    field[i][j]=" ";
                }
            }
        }

        for (int i = 0; i < large; i++) {
            for (int j = 0; j < large; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
        System.out.println("-------------- !Welcome to Game: The Warm! ------------------");
        System.out.println("OBJETIVO: Comerse los '*' moviendo su gusano '>' por el campo");


        //PlayGame
        while(true){
            System.out.println();
            System.out.println("Diga hacia donde se deseea mover y presione ENTER \n D/Right  A/Left  W/Up  S/Down  Q/Quit");
            String direction = sc.next();

            switch (direction.toLowerCase()) {
                case "d": {
                    worm.moveToRight();
                   worm.setWorm_emoji(">");
                    break;
                }
                case "a": {
                    worm.moveToLeft();
                    worm.setWorm_emoji("<");
                    break;
                }
                case "w": {
                    worm.moveToUp();
                    worm.setWorm_emoji("^");
                    break;
                }
                case "s": {
                    worm.moveToDown();
                    worm.setWorm_emoji("v");
                    break;
                }
                case "q": {
                    play = false;
                    break;
                }
                default:
                    System.out.println("_______Caracter No Valido________");
            }

            if(!play){
                System.out.println("Hasta Pronto!!! \n---Comida Total:"+"["+game.cont+"]---");
                break;
            }

            //GameField
            if(worm.getWorm_PosX()== food.getWorm_FoodX() && worm.getWorm_PosY()== food.getWorm_FoodY()){
                food.makeFood();
                game.cont+=1;
            }

            for (int i=0;i< large;i++){
                for (int j=0;j< large;j++){
                    if (i==0 || i==19 || j==0 || j==19){
                        field[i][j]="*";
                    }else if (i==food.getWorm_FoodX() && j==food.getWorm_FoodY()){
                        field[i][j]="*";
                    }else if (i== worm.getWorm_PosX() && j== worm.getWorm_PosY()){
                        field[i][j]= worm.getWorm_emoji();
                    }
                    else{
                        field[i][j]=" ";
                    }
                }
            }


            for (int i = 0; i < large; i++) {
                for (int j = 0; j < large; j++) {
                    System.out.print(field[i][j]);
                }
                System.out.println();
            }
            System.out.println("---Comida Actual:"+"["+game.cont+"]---");

        }


    }
}
