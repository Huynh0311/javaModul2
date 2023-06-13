package collection_6.Circle_Cylinder;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(){

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double volume(){
        return Math.PI * super.getRadius() * this.height;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                "} " + super.toString();
    }
}
