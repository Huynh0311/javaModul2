package collection_7.interface_Resizeable;

public class Shape {
    private String color = "green";
    private boolean filled = true;
    public Shape(){

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "a Shape with color of " + this.getColor() + " and " + (this.isFilled() ? "Filled" : "not filled");
    }
}
