package chapter14;

import java.util.Random;

public class Coin {
    public static final String HEADS = "heads";
    public static final String TAILS = "tails";
    private String side;



    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void flip(){

        if(new Random().nextBoolean()){
            setSide(HEADS);
        }else {
            setSide(TAILS);
        }
        System.out.println("Random Coin Flip result: " + side);
    }
}
