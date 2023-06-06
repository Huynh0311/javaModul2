package Kiem_tra_snt;

import java.util.Scanner;

public class snt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số muốn kiểm tra");
        int num = scanner.nextInt();
        boolean check = true;

        if(num < 2){
            check = false;

        } else {
            int i = 2;
            while (i < num){
                if(num % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
        }
        if(check){
            System.out.println("Số: "+ num +" là số nguyên tố");
        }else {
            System.out.println("Số: "+ num +" không là số nguyên tố");
        }
    }
}
