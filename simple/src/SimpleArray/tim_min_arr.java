package SimpleArray;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class tim_min_arr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập độ dài mảng: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập số thứ " + (i + 1) + ": ");
            int num = scanner.nextInt();
            arr[i] = num;
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("giá tri nhỏ nhất trong mảng " + Arrays.toString(arr) +" là:  "+ min);
    }
}
