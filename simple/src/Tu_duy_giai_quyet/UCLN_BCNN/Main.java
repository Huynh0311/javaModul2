package Tu_duy_giai_quyet.UCLN_BCNN;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FindGCD findGCD = new FindGCD();
        FindLCM findLCM = new FindLCM();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập a");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập b");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println("Ước chung lớn nhất là: " + findGCD.GCD(a, b));

        System.out.println("Bội chung nhỏ nhất: " + findLCM.LCM2(a, b));
        System.out.println("Bội chung nhỏ nhất: " + findLCM.LCM(a, b));
    }
}
