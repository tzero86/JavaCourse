package chapter10;

public class FruitMarket {
    public static void main(String[] arg){
        Fruit lemon = new Lemon();
        ((Lemon) lemon).removeSeeds();

        Lemon lemon2 = new Lemon();
        lemon2.removeSeeds();

        Banana banana = new Banana();
        banana.peel();

        Fruit banana2 = new Banana();
        ((Banana) banana2).peel();

        Fruit orange = new Fruit();

    }

    public static void squeezeFruit(Fruit fruit){
        System.out.println("Squeezing the fruit...");
        fruit.makeJuice();
    }
}
