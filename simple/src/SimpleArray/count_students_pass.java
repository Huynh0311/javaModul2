package SimpleArray;

import java.util.Arrays;
import java.util.Scanner;

public class count_students_pass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng học sinh:");
        int students = input.nextInt();
        int[] arr_score = new int[students];
        int count = 0;

        if (students > 30) {
            System.out.println("Chỉ được nhập tối da 30 sinh viên");
        } else if (students < 1) {
            System.out.println("Số sinh viên không được nhỏ hơn 1");
        } else {
            for (int i = 0; i < students; i++) {
                System.out.println("Nhập điểm học sinh thứ " + (i+1) +" :");
                arr_score[i] = input.nextInt();
            }
            for (int i = 0; i < students; i++){
                if(arr_score[i] > 5){
                    count++;
                }
            }
            System.out.println("Danh sách điểm "+ Arrays.toString(arr_score));
            System.out.println("Số học sinh đỗ là: " + count);
        }
    }
}
