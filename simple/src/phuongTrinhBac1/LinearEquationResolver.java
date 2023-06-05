package phuongTrinhBac1;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("LinearEquationResolver");
        System.out.println("a * x + b = c");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập giá trị b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập giá trị c: ");
        double c = scanner.nextDouble();

        if(a == 0){
            if(b == 0){
                System.out.println("Phương trình có vô số nghiệm");
            }else {
                System.out.println("Phương trình có vô nghiệm");
            }
        }else {
            double answer = (c - b) / a;
            System.out.println("Phương trình có nghiệm: x = " + answer);
        }
    }
}
