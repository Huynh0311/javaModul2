package SimpleArray;

import java.util.Scanner;

public class daoNguocMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        // kiểm tra nhập vào mảng độ dài <20
        do {
            System.out.println("Nhập độ dài");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Độ dài không vượt quá 20");
            }
        } while (size > 20);
        //nhập vào phần tử
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("enter element" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        //thêm vào mảng
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
        }
        //đảo ngược mảng
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.println("");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
        }
    }
}
