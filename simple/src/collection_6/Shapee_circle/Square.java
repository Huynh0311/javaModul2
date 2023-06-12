package collection_6.Shapee_circle;

public class Square extends Rectangle {
    public Square(){

    }
    public Square(double side){
        super(side ,side);
    }
    public Square(double side, String color, boolean filled) {
        super( color, filled, side, side);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    public void setWidth(double width){
        setSide(width);
    }
    public void setLength(double length) {
        setSide(length);
    }
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(5.8, "yellow", true);
        System.out.println(square);
    }

}
