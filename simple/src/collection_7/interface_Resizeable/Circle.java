package collection_7.interface_Resizeable;

public class Circle extends Shape{
    private double radius;
    public Circle(){

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * this.radius * 2;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +'\'' +
                '}';
    }
}

