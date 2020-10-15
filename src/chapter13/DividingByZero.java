package chapter13;

public class DividingByZero {
    public static void main(String[] arg){
        doDivision();
    }
    public static void doDivision(){
        try{
            int c = 30/0;
        } catch (ArithmeticException e){
            System.out.println("Error!");
            e.printStackTrace();
        }finally {
            System.out.println("Dividing is fun!");
        }


    }
}
