package SimpleArray;

import java.sql.Array;
import java.util.Arrays;

public class Gop_mang {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 6};
        int[] arr2 = {4, 5, 6};
        int[] newArr = gopmang(arr1, arr2);
        System.out.println("Mảng thứ 1: " + Arrays.toString(arr1));
        System.out.println("Mảng thứ 2: " + Arrays.toString(arr2));
        System.out.println("Mảng sau gộp: " + Arrays.toString(newArr));
    }

    public static int[] gopmang(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < newArr.length; i++) {
            if (i < arr1.length) newArr[i] = arr1[i];
            else newArr[i] = arr2[i - arr1.length];
        }
        return newArr;
    }
}
