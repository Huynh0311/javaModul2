package Tu_duy_giai_quyet;

import java.util.Scanner;

public class So_chinh_phuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a");
        int numA = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số b");
        int numB = Integer.parseInt(scanner.nextLine());

        for (int i = numA; i <= numB; i++) {
            if(i % Math.sqrt(i) == 0){
                System.out.println("số chính phương là: " + i);
            }
        }
    }
}
