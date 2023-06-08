package class_object;

import java.util.Scanner;

public class Rectangle {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{ " + " width= " + width + ", height= " + height + "}";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chiều rộng");
        double width = input.nextDouble();
        System.out.println("Nhập chiều cao");
        double height = input.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Hình chữ nhật của bạn: " + rectangle.display());
        System.out.println("Chu vi hcn của bạn: " + rectangle.getPerimeter());
        System.out.println("Diện tích của hình chữ nhật là: "+ rectangle.getArea());
    }
}

