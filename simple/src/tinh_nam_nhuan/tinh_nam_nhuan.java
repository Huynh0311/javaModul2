package tinh_nam_nhuan;

import java.util.Scanner;

public class tinh_nam_nhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nam;
        System.out.println("Enter a year: ");
        nam = scanner.nextInt();
        boolean namNhuan = false;

        boolean isDivisibleBy4 = nam % 4 == 0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = nam % 100 == 0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400 = nam % 400 == 0;
                if(isDivisibleBy400){
                    namNhuan = true;
                }
            } else {
                namNhuan = true;
            }
        }

        if(namNhuan){
            System.out.printf("%d là năm nhuận", nam);
        } else {
            System.out.printf("%d không là năm nhuận", nam);
        }
    }
}
