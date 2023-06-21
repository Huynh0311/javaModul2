package Tu_duy_giai_quyet;

import java.util.Scanner;

public class Cac_loai_tam_giac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh a");
        int numA = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập cạnh b");
        int numB = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập cạnh c");
        int numC = Integer.parseInt(scanner.nextLine());
        if(numA == numB && numA == numC){
            System.out.println("tam giác đều");
        }else if (numA == numB || numA == numC || numB == numC){
            System.out.println("tam giác cân");
        } else if (numA > numB && numA > numC ) {
            if (Math.pow(numB, 2) + Math.pow(numC, 2) == Math.pow(numA, 2)){
                System.out.println("Tam giac vuong");
            }
        }else if (numB > numA && numB > numC ) {
            if (Math.pow(numA, 2) + Math.pow(numC, 2) == Math.pow(numB, 2)){
                System.out.println("Tam giac vuong");
            }
        }else if (numC > numA && numC > numB ) {
            if (Math.pow(numA, 2) + Math.pow(numB, 2) == Math.pow(numC, 2)){
                System.out.println("Tam giac vuong");
            }
        }
    }
}
