package SimpleArray;

import java.util.Arrays;
import java.util.Scanner;

public class Them_phan_tu {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử cần thêm");
        int num = scanner.nextInt();
        System.out.println("Nhập vị trí thêm");
        int index = scanner.nextInt();

        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = num;

        System.out.println("Mảng sau khi thêm là: " + Arrays.toString(array));
    }
}
