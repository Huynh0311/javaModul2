package Tu_duy_giai_quyet;

import java.util.Scanner;

public class NemRan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nem cần rán");
        int nem = Integer.parseInt(scanner.nextLine());

        if(nem % 9 == 0){
            System.out.println("số lần rán: " + nem/9);
        }else {
            System.out.println("số lần rán: " + (nem/9 + 1));
        }
    }
}
