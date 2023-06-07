package SimpleArray;

import java.util.Arrays;
import java.util.Scanner;

public class loai_bo_phan_tu {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa");
        int num = scanner.nextInt();
        int index = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == num) {
                index = i;
                array[i] = array[i + 1];
                break;
            }
        }
        for (int j = index + 1; j < array.length - 1; j++) {
            array[j] = array[j + 1];
        }
        array[array.length - 1] = 0;
        System.out.println("Mảng sau khi xóa phần tử là " + Arrays.toString(array));
    }
}
