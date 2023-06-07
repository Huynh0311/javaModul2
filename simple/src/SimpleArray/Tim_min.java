package SimpleArray;

import java.sql.Array;
import java.util.Arrays;

public class Tim_min {
    public static void main(String[] args) {
        int [] array = {33,8 ,3 ,9 ,6};
        System.out.println("Giá trị nhỏ nhất trong mảng: "+ Arrays.toString(array) +" là: " + minValue(array));
    }

    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
