package chapter9;

public class InheritanceTester3 {
    public static void main(String[] arg){
        Mother mom = new Mother();
        mom.setName("Ana");
        System.out.println(mom.getName() + " is a " + mom.getGender());
    }
}
