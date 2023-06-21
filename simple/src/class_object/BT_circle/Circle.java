package class_object.BT_circle;

public class Circle {
    private int id;
    private double radius;
    private static final double Pi = 3.14;
    static int count;
    static double maxRadius;
    static double totalArea;
    static double totalPerimeter;
    public Circle(double radius) {
        this.radius = radius;
        this.id = ++count;
        if (radius > maxRadius) {
            maxRadius = radius;
        }
        totalPerimeter += perimeter();
        totalArea += area();
    }
    static double getMaxRadius(){
        return maxRadius;
    }

    public double area() {
        return Pi * Math.pow(this.radius, 2);
    }

    public double perimeter() {
        return 2 * Pi * this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "id=" + this.id +
                ", radius=" + this.radius +
                '}';
    }

    public static double getTotalArea() {
        return totalArea;
    }

    public static double getTotalPerimeter() {
        return totalPerimeter;
    }
}
