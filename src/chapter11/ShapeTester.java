package chapter11;

public class ShapeTester {

    public static void main(String[] arg){
        Shape rectangle = new Rectangle(5, 7);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}
