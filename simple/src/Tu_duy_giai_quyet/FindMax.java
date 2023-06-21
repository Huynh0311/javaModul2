package Tu_duy_giai_quyet;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a");
        int numA = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số b");
        int numB = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số c");
        int numC = Integer.parseInt(scanner.nextLine());

        if(numA >= numB && numA >= numC ){
            System.out.println("max= " + numA);
        } else if (numB >= numA && numB >= numC) {
            System.out.println("max= " + numB);
        }else {
            System.out.println("max= " + numC);
        }
    }
}
