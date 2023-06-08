package SimpleArray;

import java.util.Arrays;
import java.util.Scanner;

public class sum_column {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số mảng");
        int num_arr = input.nextInt();
        System.out.println("Nhập độ dài mảng");
        int size_arr = input.nextInt();

        int[][] arr = new int[num_arr][size_arr];
        for (int i = 0; i < num_arr; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập phần tử " + (j + 1) + " mảng " + (i + 1));
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("nhập cột bạn muốn tính tổng");
        int column = input.nextInt();
        int sum = 0;
        for (int i = 0; i < num_arr; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == column) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Tổng của cột " + column + " là: " + sum);
    }
}
