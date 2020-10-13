package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen,bathroom);
        System.out.printf("The total area is %.2f", area);
        calculator.scanner.close();
    }

    public Rectangle getRoom(){

        System.out.println("Enter the Room Width:");
        double width = scanner.nextDouble();

        System.out.println("Enter the Room Length:");
        double length = scanner.nextDouble();

        return new Rectangle(length,width);
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
