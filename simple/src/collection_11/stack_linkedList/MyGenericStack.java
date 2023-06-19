package collection_11.stack_linkedList;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;
    public MyGenericStack(){
        stack = new LinkedList();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        if(stack.size() == 0){
            return true;
        }
        return false;
    }
    private static void stackOfIStrings(){
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("5");
        stack.push("4");
        stack.push("3");
        stack.push("2");
        stack.push("1");
        System.out.println("1.1 Kích thước ngăn xếp sau thao tác đẩy:  " + stack.size());
        System.out.println("Các phần tử pop từ ngăn xếp: ");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("Kích thước ngăn xếp sau thao tác pop: " + stack.size());
    }
    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Kích thước ngăn xếp sau thao tác đẩy: " + stack.size());
        System.out.printf("2.2. Các phần tử pop từ ngăn xếp : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3.3 Kích thước ngăn xếp sau thao tác pop : " + stack.size());
    }
    public static class GenericStackClient {
        public static void main(String[] args) {
            System.out.println("1. Stack of integers");
            stackOfIntegers();
            System.out.println("\n2. Stack of Strings");
            stackOfIStrings();
        }
    }
}
