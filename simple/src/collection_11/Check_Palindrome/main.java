package collection_11.Check_Palindrome;
import java.util.LinkedList;

import java.util.*;

public class main {
    public static void main(String[] args) {

        Queue<String> stringQueue = new LinkedList<>();
        Stack<String> stringStack = new Stack<>();

        String chuoi = "Able was I ere I saw Elba";

        for (int i = 0; i < chuoi.length(); i++) {
            stringStack.push((chuoi.charAt(i)+"").toLowerCase());
            stringQueue.offer((chuoi.charAt(i)+"").toLowerCase());
        }
        System.out.println(stringStack);
        System.out.println(stringQueue);
        int size = chuoi.length();
        boolean check = true;
        for (int i = 0; i < size; i++) {
            if(stringStack.pop().equals(stringQueue.poll())){
                check = true;
            }
            else {
                check = false;
            }
        }

        System.out.println(check);
    }
}
