package collection_5.Access_modifier;

public class Circle {
    private static double radius = 1.0;
    private static String color = "red";

    public Circle(){

    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
    static void change(){
        color = "blue";
        radius = 2;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        System.out.println(circle.color);

        Circle.change();
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        System.out.println(circle.color);
    }
}
