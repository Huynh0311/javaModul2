package collection_11.reverse_element_stack;

import java.util.Stack;

public class ReverseArrayUsingStack {
    public static int[] reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            stack.push(num);
        }
        int[] reverseArr = new int[arr.length];
        int i = 0;
        while (!stack.empty()){
            reverseArr[i] = stack.pop();
            i++;
        }
        return reverseArr;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] reversedArray = reverseArray(array);

        // In mảng đã đảo ngược
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
    }
}
