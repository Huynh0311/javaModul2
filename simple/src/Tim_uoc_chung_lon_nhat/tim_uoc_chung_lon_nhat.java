package Tim_uoc_chung_lon_nhat;

import java.util.Scanner;

public class tim_uoc_chung_lon_nhat {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số a");
        a = input.nextInt();
        System.out.println("Nhập số b");
        b = input.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 && b == 0) {
            System.out.println("Hai số không có ước chung lớn nhất");
        } else if (a == 0 || b == 0) {
            if (a == 0){
                System.out.println("Ước chung lớn nhất của hai số là "+ b);
            } else if (b == 0) {
                System.out.println("Ước chung lớn nhất của hai số là "+ a);
            }
        }else {
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
            System.out.println("Ước chung lớn nhất của hai số là "+ a);
        }
    }
}
