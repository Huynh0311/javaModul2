package collection_14.Sort_Foamy_input;

import java.util.Arrays;

public class Sort_insertion {
    public static void main(String[] args) {
        int[] array = {5, 9, 2, 9, 1, 8};
        int arrPos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            arrPos = i;
            while (arrPos > 0 && x < array[arrPos - 1]){
                array[arrPos] = array[arrPos - 1];
                arrPos--;
            }
            array[arrPos] = x;
        }
        System.out.println(Arrays.toString(array));
    }
}
