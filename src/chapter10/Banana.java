package chapter10;

public class Banana extends Fruit{

    public Banana(){
        setCalories(43);
    }

    public void peel(){
        System.out.println("The banana has been peeled!");
    }

    @Override
    public void makeJuice(){
        System.out.println("Banana Juice has been made!");
    }
}
