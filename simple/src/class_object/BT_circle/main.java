package class_object.BT_circle;

public class main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(7);
        Circle circle3 = new Circle(6);
        Circle circle4 = new Circle(9);
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);
        System.out.println(circle4);
        System.out.println("Hình tròn có bán kính lớn nhất là: " + Circle.getMaxRadius());
        System.out.println("Tổng diện tích: " + Circle.getTotalPerimeter());
        System.out.println("Tổng diện tích: " + Circle.getTotalArea());
    }

}
