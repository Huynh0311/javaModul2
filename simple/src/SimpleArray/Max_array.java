package SimpleArray;

import java.util.Arrays;
import java.util.Scanner;

public class Max_array {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập độ dài");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("size không được vượt quá 20");
            }
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhập số thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Mang vua nhap la: " + Arrays.toString(array));

        int max = 0;
        for (int j = 0; j < array.length; j++) {
            if(array[j] > max){
                max = array[j];
            }
        }
        System.out.println("Max trong mang vua nhap la: " + max);
    }
}
