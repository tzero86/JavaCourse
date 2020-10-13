package chapter6;

public class Rectangle {

    private double length, width;

    // Default constructor must be named the same as the class.
    public Rectangle(){
        length = 0;
        width = 0;
    }

    // Another constructor
    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    // Getters and setters
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    // general methods
    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }
}
