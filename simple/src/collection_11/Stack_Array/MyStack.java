package collection_11.Stack_Array;

public class MyStack {
    private int arr[];
    private int size;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is null");
        }
        arr[index] = element;
        index++;
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }

    public int size() {
        return index;
    }

    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] as) throws Exception {
        MyStack stack = new MyStack(5);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("1. Kích thước ngăn xếp sau thao tác đẩy: " + stack.size());
        System.out.printf("2. Các phần tử pop từ ngăn xếp: ");

        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }

        System.out.println("\n3. Kích thước ngăn xếp sau thao tác pop : " + stack.size());
    }

}
