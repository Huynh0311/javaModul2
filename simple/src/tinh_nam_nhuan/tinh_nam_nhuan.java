package tinh_nam_nhuan;

import java.util.Scanner;

public class tinh_nam_nhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập năm bạn muốn kiểm tra!");
        int nam = scanner.nextInt();

        if (nam % 4 == 0 && nam % 100 != 0) {
            System.out.println("Năm " + nam + " là năm nhuận");
        } else if (nam % 100 == 0 && nam % 400 != 0) {
            System.out.println("Năm " + nam + " là năm không nhuận");
        } else if (nam % 100 == 0 && nam % 400 == 0) {
            System.out.println("Năm " + nam + " là năm nhuận");
        }
    }

}
