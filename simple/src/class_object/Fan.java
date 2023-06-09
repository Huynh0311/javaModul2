package class_object;

public class Fan {
    public static final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {

    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        if (this.isOn()) {
            return "Speed: " + this.getSpeed() + ". Color: " + this.getColor() + " .Fan is on";
        } else return "Color: " + this.getColor() + " .Radius: " + this.getRadius() + " .Fan is off";
    }

    public static void main(String[] args) {
        Fan fan = new Fan();
        Fan fan1 = new Fan(fan.FAST, true, 10, "yellow");
        Fan fan2 = new Fan(fan.MEDIUM, false, 5, "Blue");

        System.out.println("Fan: " + fan.toString());
        System.out.println("Fan1: " + fan1.toString());
        System.out.println("Fan2: " + fan2.toString());
    }
}
