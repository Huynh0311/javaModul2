package class_object;

import java.util.Scanner;

public class QuadraticEquation {
    public double a;
    public double b;
    public double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }
    public double getRoot1(){
        return (-this.b + Math.sqrt(this.getDiscriminant())) / (2 * this.a);
    }
    public double getRoot2(){
        return (-this.b - Math.sqrt(this.getDiscriminant())) / (2 * this.a);
    }
    public double getDoubleRoot(){
        return -this.b / 2 * this.a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a");
        double a = input.nextDouble();
        System.out.println("Nhập b");
        double b = input.nextDouble();
        System.out.println("Nhập c");
        double c = input.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if(quadraticEquation.getDiscriminant() > 0){
            System.out.println("Nghiệm x1 của phương trình là: " + quadraticEquation.getRoot1());
            System.out.println("Nghiệm x2 của phương trình là: " + quadraticEquation.getRoot2());
        }else if (quadraticEquation.getDiscriminant() == 0){
            System.out.println("Phương trình có nghiệm kép x = " + quadraticEquation.getDoubleRoot());
        }else System.out.println("phương trình vô nghiệm");
    }
}
