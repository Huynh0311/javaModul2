package collection_14.Sort_Foamy_input;

import java.util.Arrays;

public class Sort_Select {
    public static void main(String[] args) {
        int[] array = {5, 6, 2, 4, 1, 8};
        int min;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
