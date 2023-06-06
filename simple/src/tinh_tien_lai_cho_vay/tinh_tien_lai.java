package tinh_tien_lai_cho_vay;

import java.util.Scanner;

public class tinh_tien_lai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tienGui = 1.0;
        double laiSuatThang = 1.0;
        int month = 1;
        System.out.println("Nhập số lượng tiền cho vay");
        tienGui = input.nextDouble();
        System.out.println("Tỉ lệ lãi suất theo tháng");
        laiSuatThang = input.nextDouble();
        System.out.println("Nhập số tháng cho vay");
        month = input.nextInt();

        double tong = 0;
        for(int i = 0; i < month; i++){
            tong += tienGui * (laiSuatThang/100)/12 * month;
        }
        System.out.println("Tổng số tiền sau khi hết kì hạn: " + tong);
    }
}
