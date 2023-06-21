package Tu_duy_giai_quyet;

import java.util.Scanner;

public class ChanLe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số");
        int num = Integer.parseInt(scanner.nextLine());
        if(num % 2 == 0){
            System.out.println(num + " là số chẵn");
        }else {
            System.out.println(num + " là số lẻ");
        }
    }
}
