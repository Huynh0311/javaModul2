package collection_7.interface_Resizeable;

public class main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(3, 4);
        shapes[1] = new Circle(2.5);
        shapes[2] = new Square(2);

        for(Shape s : shapes){
            if(s instanceof Rectangle) {
                System.out.println(((Rectangle) s).getArea());
            }
            if(s instanceof Circle) {
                System.out.println(((Circle) s).getArea());
            }
            if(s instanceof Square) {
                System.out.println(((Square) s).getArea());
            }
            if(s instanceof ColorAble) {
                ((ColorAble) s).howToColor();
            }
        }
    }
}
