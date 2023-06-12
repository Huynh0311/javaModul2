package collection_6.Shapee_circle;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;
    public Rectangle(){

    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + this.width + " and "
                + "length = " + this.length + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle("orange", true, 2.5, 3.8);
        System.out.println(rectangle);

    }
}
