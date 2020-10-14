package chapter10;

public class Lemon extends Fruit {

    public Lemon(){
        setCalories(20);
    }

    public void removeSeeds(){
        System.out.println("Seeds removed");
    }

    @Override
    public void makeJuice(){
        System.out.println("Lemon Juice has been made.");
    }
}
