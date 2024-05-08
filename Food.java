package Gusanito.otro;

import java.util.Random;

public class Food {
    private int worm_FoodY;
    private int worm_FoodX;

    public int getWorm_FoodY() {
        return this.worm_FoodY;
    }

    public int getWorm_FoodX() {
        return this.worm_FoodX;
    }

    public void makeFood(){
        Random random = new Random();
        worm_FoodX=random.nextInt(15)+2;
        worm_FoodY=random.nextInt(15)+2;

        if (worm_FoodX==10 && worm_FoodY==10 ){

            worm_FoodX=random.nextInt(15)+2;
            worm_FoodY=random.nextInt(15)+2;
        }
    }

}
