package chapter9;

public class TasteTester {

    public static void main(String[] arg){
        WeddingCake wedCake = new WeddingCake();
        wedCake.setFlavor("Apple");
        wedCake.setTiers(3);
        wedCake.setPrice(11.25);
        System.out.println("[*] Wedding cake details: Flavor: " + wedCake.getFlavor() + " | # of Tiers: " + wedCake.getTiers() + " | Price: $"
        + wedCake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setFlavor("Strawberry");
        birthdayCake.setPrice(12.75);
        birthdayCake.setCandles(34);
        System.out.println("[*] Birthday cake details: Flavor: " + birthdayCake.getFlavor() + " | # of Candles: " + birthdayCake.getCandles()
                + " | Price: $" + birthdayCake.getPrice());

        Cake cake = new Cake();
        cake.setFlavor("Lime");
        cake.setPrice(10);
        System.out.println("[*] Cake details: Flavor: " + cake.getFlavor() + " | Price: $" + cake.getPrice());
    }
}
