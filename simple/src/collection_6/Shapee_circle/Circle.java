package collection_6.Shapee_circle;

import java.nio.channels.Pipe;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius= " + radius + ". " + super.toString();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle("indigo", false,3.5);
        System.out.println(circle);
    }
}
