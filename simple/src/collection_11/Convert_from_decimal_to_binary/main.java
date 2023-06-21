package collection_11.Convert_from_decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số");
        int n = Integer.parseInt(scanner.nextLine());

        int temp = n;
        int du;
        while (temp != 0) {
            du = temp % 2;
            integerStack.push(du);
            temp = temp / 2;
        }
        int size = integerStack.size();
        for (int i = 0; i < size; i++) {
            System.out.print(integerStack.pop());
        }
    }
}
