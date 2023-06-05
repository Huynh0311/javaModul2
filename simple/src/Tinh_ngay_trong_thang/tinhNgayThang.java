package Tinh_ngay_trong_thang;

import java.util.Scanner;

public class tinhNgayThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bạn muốn xem ngày trong tháng nào?");
        int month = scanner.nextInt();
        String dayInMonth;
        switch (month) {
            case 2:
//                System.out.println("Tháng " + month + " có 28 hoặc 29 ngày");
                dayInMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
//                System.out.println("Tháng " + month + " có 31 ngày");
                dayInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
//                System.out.println("Tháng " + month + " có 30 ngày");
                dayInMonth = "30";
                break;
            default:
//                System.out.println("1 năm chỉ có 12 tháng");
                dayInMonth = "";
                break;
        }
        if (!dayInMonth.equals("")) System.out.printf("Tháng %d có %s ngày!", month, dayInMonth);
        else System.out.println("1 năm chỉ có 12 tháng");
    }
}
