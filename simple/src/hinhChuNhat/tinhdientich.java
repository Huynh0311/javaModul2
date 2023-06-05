package hinhChuNhat;

import java.util.Scanner;

public class tinhdientich {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        width = scanner.nextFloat();
        System.out.println("Nhập chiều rộng");
        height = scanner.nextFloat();

        float area = width * height;
        System.out.println("Diện tích hình chữ nhật là: " + area);
    }
}
